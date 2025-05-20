package com.example.demo.service.impl;

import com.example.demo.dto.request.ReservationSearchRequest;
import com.example.demo.dto.response.ReservationResponse;
import com.example.demo.entity.Reservations;
import com.example.demo.mapper.ReservationsMapper;
import com.example.demo.service.ReservationsService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservationsServiceImpl implements ReservationsService {

    @Autowired
    private ReservationsMapper reservationsMapper;

    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    @Override
    public List<ReservationResponse> searchReservations(ReservationSearchRequest request) {
        List<Reservations> reservations = reservationsMapper.searchReservations(request);
        
        return reservations.stream()
                .map(reservation -> dozerBeanMapper.map(reservation, ReservationResponse.class))
                .collect(Collectors.toList());
    }
} 