package com.example.demo.mapper;

import com.example.demo.dto.request.HistorySearchRequestDTO;
import com.example.demo.dto.request.CSVOutputRequestDTO;
import com.example.demo.entity.ReservationEntity;
import org.springframework.stereotype.Repository;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 予約情報のデータアクセス実装クラス
 * - ReservationDAOインターフェースの実装クラス
 * - ReservationMapperを通じて、DB操作を実行する (lombok)
 */

@Repository
@RequiredArgsConstructor
public class ReservationDAOImpl implements ReservationDAO {

    private final ReservationMapper reservationMapper;

    @Override
    public List<ReservationEntity> searchReservations(HistorySearchRequestDTO request) {
        return reservationMapper.searchReservations(request);
    }

    @Override
    public List<ReservationEntity> getReservationsForCsv(CSVOutputRequestDTO request) {
        return reservationMapper.getReservationsForCsv(request);
    }
}
