package com.example.demo.service;

import com.example.demo.dto.request.ReservationSearchRequest;
import com.example.demo.dto.response.ReservationResponse;
import java.util.List;

public interface ReservationsService {
    List<ReservationResponse> searchReservations(ReservationSearchRequest request);
} 