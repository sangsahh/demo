package com.example.demo.service;

import com.example.demo.dto.request.CSVOutputRequestDTO;

/**
 * CSVファイル生成機能のサービスインターフェース
 */
public interface CSVOutputService {
    /**
     * 予約情報のCSVファイルを生成
     * @param request 選択された予約のシーケンス番号リスト
     * @return CSVファイルのバイトデータ
     */
    byte[] generateReservationsCsv(CSVOutputRequestDTO request);
} 