package com.example.demo.mapper;

import com.example.demo.dto.request.HistorySearchRequestDTO;
import com.example.demo.dto.request.CSVOutputRequestDTO;
import com.example.demo.entity.ReservationEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * MyBatis Mapper for 予約情報
 */
@Mapper
public interface ReservationMapper {

    List<ReservationEntity> searchReservations(HistorySearchRequestDTO request);

    List<ReservationEntity> getReservationsForCsv(CSVOutputRequestDTO request);
}
