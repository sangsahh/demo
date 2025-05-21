package com.example.demo.service;

import com.example.demo.dto.request.HistorySearchRequestDTO;
import com.example.demo.dto.response.HistorySearchResponseDTO;
import java.util.List;

public interface HistorySearchSerivce {
    List<HistorySearchResponseDTO> searchReservations(HistorySearchRequestDTO request);
} 