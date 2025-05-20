package com.example.demo.controller;

import com.example.demo.dto.request.ReservationSearchRequest;
import com.example.demo.dto.response.ReservationResponse;
import com.example.demo.service.ReservationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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
