package com.example.demo.service.impl;

import com.example.demo.dto.request.CSVOutputRequestDTO;
import com.example.demo.entity.ReservationEntity;
import com.example.demo.mapper.ReservationDAO;
import com.example.demo.service.CSVOutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;
import java.lang.reflect.Method;

@Service
public class CSVOutputServiceImpl implements CSVOutputService {

    @Autowired
    private ReservationDAO reservationDAO;

    @Override
    public byte[] generateReservationsCsv(CSVOutputRequestDTO request) {
        List<ReservationEntity> reservations = reservationDAO.getReservationsForCsv(request);
        
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             OutputStreamWriter writer = new OutputStreamWriter(baos, StandardCharsets.UTF_8)) {
            
            // CSVカラム定義
            Map<String, String> columns = new LinkedHashMap<>();
            columns.put("reservationId", "予約ID");
            columns.put("date", "予約日");
            columns.put("startTime", "開始時刻");
            columns.put("endTime", "終了時刻");
            columns.put("roomId", "ルーム番号");
            columns.put("status", "状態");
            columns.put("userId", "担当者ID");
            columns.put("description", "訪問目的");
            columns.put("reasonRejected", "却下理由");
            
            // ヘッダー作成
            writer.write(String.join(",", columns.values()) + "\n");
            
            // データ作成
            for (ReservationEntity reservation : reservations) {
                StringBuilder row = new StringBuilder();
                boolean isFirst = true;
                
                for (Map.Entry<String, String> column : columns.entrySet()) {
                    if (!isFirst) {
                        row.append(",");
                    }
                    isFirst = false;
                    
                    // リフレクションを使用して動的にゲッターメソッドを呼び出し
                    String methodName = "get" + column.getKey().substring(0, 1).toUpperCase() + 
                                      column.getKey().substring(1);
                    Method method = ReservationEntity.class.getMethod(methodName);
                    Object value = method.invoke(reservation);
                    
                    // nullチェックと値の変換
                    if (value == null) {
                        row.append("");
                    } else if (value instanceof java.sql.Date) {
                        row.append(((java.sql.Date) value).toLocalDate());
                    } else if (value instanceof java.sql.Time) {
                        row.append(((java.sql.Time) value).toLocalTime());
                    } else {
                        row.append(value.toString());
                    }
                }
                writer.write(row.toString() + "\n");
            }
            
            writer.flush();
            return baos.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException("CSVファイルの作成中にエラーが発生しました。", e);
        }
    }
} 