package com.example.demo.controller;

import com.example.demo.dto.request.HistorySearchRequestDTO;
import com.example.demo.dto.response.HistorySearchResponseDTO;
import com.example.demo.service.HistorySearchSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class HistorySearchController {

    @Autowired
    private HistorySearchSerivce historySearchSerivce;

    @GetMapping
    public List<HistorySearchResponseDTO> searchReservations(HistorySearchRequestDTO request) {
        return historySearchSerivce.searchReservations(request);
    }
}
