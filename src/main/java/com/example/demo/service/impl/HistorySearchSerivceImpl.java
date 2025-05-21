package com.example.demo.service.impl;

import com.example.demo.dto.request.HistorySearchRequestDTO;
import com.example.demo.dto.response.HistorySearchResponseDTO;
import com.example.demo.entity.ReservationEntity;
import com.example.demo.mapper.ReservationDAO;
import com.example.demo.service.HistorySearchSerivce;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HistorySearchSerivceImpl implements HistorySearchSerivce {

    @Autowired
    private ReservationDAO reservationDAO;

    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    @Override
    public List<HistorySearchResponseDTO> searchReservations(HistorySearchRequestDTO request) {
        List<ReservationEntity> reservations = reservationDAO.searchReservations(request);
        
        return reservations.stream()
                .map(reservation -> dozerBeanMapper.map(reservation, HistorySearchResponseDTO.class))
                .collect(Collectors.toList());
    }
} 