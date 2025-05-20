package com.example.demo.service;

import com.example.demo.dto.request.CsvDownloadRequest;

/**
 * CSVファイル生成機能のサービスインターフェース
 */
public interface CsvService {
    /**
     * 予約情報のCSVファイルを生成
     * @param request 選択された予約のシーケンス番号リスト
     * @return CSVファイルのバイトデータ
     */
    byte[] generateReservationsCsv(CsvDownloadRequest request);
} 