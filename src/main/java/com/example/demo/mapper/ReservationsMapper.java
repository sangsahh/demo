package com.example.demo.mapper;

import com.example.demo.dto.request.ReservationSearchRequest;
import com.example.demo.dto.request.CsvDownloadRequest;
import com.example.demo.entity.Reservations;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * 予約情報のデータアクセスインターフェース
 */
@Mapper
public interface ReservationsMapper {
    /**
     * 予約情報を検索
     * @param request 検索条件
     * @return 予約情報リスト
     */
    List<Reservations> searchReservations(ReservationSearchRequest request);

    /**
     * CSVダウンロード用の予約情報を取得
     * @param request 選択された予約のシーケンス番号リスト
     * @return 予約情報リスト
     */
    List<Reservations> getReservationsForCsv(CsvDownloadRequest request);
} 