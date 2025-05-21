package com.example.demo.controller;

import com.example.demo.dto.request.CSVOutputRequestDTO;
import com.example.demo.service.CSVOutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * CSVダウンロード機能のコントローラー
 */
@RestController
@RequestMapping("/api/csv")
public class CSVOutputController {

    @Autowired
    private CSVOutputService CSVOutputService;

    /**
     * 予約情報のCSVファイルをダウンロード
     * @param request 選択された予約のシーケンス番号リスト
     * @return CSVファイルのバイトデータ
     */
    @PostMapping("/reservations")
    public ResponseEntity<String> downloadReservationsCsv(@RequestBody CSVOutputRequestDTO request) {
        String csvData = CSVOutputService.generateReservationsCsv(request);
        
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.valueOf("text/csv"));
        headers.setContentDispositionFormData("attachment", "reservations.csv");

        return ResponseEntity.ok()
                .headers(headers)
                .body(csvData);
    }
} 