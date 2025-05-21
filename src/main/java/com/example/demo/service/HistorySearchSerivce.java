package com.example.demo.service;

import com.example.demo.dto.request.HistorySearchRequestDTO;
import com.example.demo.dto.response.HistorySearchResponseDTO;
import java.util.List;

public interface HistorySearchSerivce {
    HistorySearchResponseDTO searchReservations(HistorySearchRequestDTO request);
} 