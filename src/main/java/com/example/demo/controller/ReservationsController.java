package com.example.demo.controller;

import com.example.demo.dto.request.ReservationSearchRequest;
import com.example.demo.dto.response.ReservationResponse;
import com.example.demo.service.ReservationsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reservations")
public class ReservationsController {

    @Autowired
    private ReservationsService reservationsService;

    @GetMapping
    public List<ReservationResponse> searchReservations(ReservationSearchRequest request) {
        return reservationsService.searchReservations(request);
    }
}
