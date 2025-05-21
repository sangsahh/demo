package com.example.demo.mapper;

import com.example.demo.dto.request.HistorySearchRequestDTO;
import com.example.demo.dto.request.CSVOutputRequestDTO;
import com.example.demo.entity.ReservationEntity;
import com.example.demo.mapper.ReservationDAO;
import com.example.demo.mapper.ReservationMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 予約情報のデータアクセス実装クラス
 */
@Repository
public class ReservationDAOImpl implements ReservationDAO {

    private final ReservationMapper reservationMapper;

    public ReservationDAOImpl(ReservationMapper reservationMapper) {
        this.reservationMapper = reservationMapper;
    }

    @Override
    public List<ReservationEntity> searchReservations(HistorySearchRequestDTO request) {
        return reservationMapper.searchReservations(request);
    }

    @Override
    public List<ReservationEntity> getReservationsForCsv(CSVOutputRequestDTO request) {
        return reservationMapper.getReservationsForCsv(request);
    }
}
