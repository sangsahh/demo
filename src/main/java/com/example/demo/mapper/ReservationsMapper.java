package com.example.demo.mapper;

import com.example.demo.dto.request.ReservationSearchRequest;
import com.example.demo.entity.Reservations;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ReservationsMapper {
    List<Reservations> searchReservations(ReservationSearchRequest request);
} 