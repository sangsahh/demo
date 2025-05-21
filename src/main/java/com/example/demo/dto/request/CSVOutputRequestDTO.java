package com.example.demo.dto.request;

import lombok.Data;
import java.util.List;

/**
 * CSVダウンロードリクエストDTO
 */
@Data
public class CSVOutputRequestDTO {
    /**
     * 選択された予約のシーケンス番号リスト
     */
    private List<Integer> seqNumbers;
} 