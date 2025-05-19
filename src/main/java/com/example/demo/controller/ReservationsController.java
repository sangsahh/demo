package com.example.demo.controller;

import com.example.demo.entity.Reservations;
import com.example.demo.repository.ReservationsRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reservations")
public class ReservationsController {

    @Autowired
    private ReservationsRepository reservationsRepository;

    @GetMapping
    public List<Reservations> searchReservations(
            @RequestParam(required = false) String reservationId,
            @RequestParam(required = false) String userId,
            @RequestParam(required = false) String status,
            @RequestParam(required = false)
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {

        List<Reservations> all = reservationsRepository.findAll();

        return all.stream()
                .filter(r -> reservationId == null || r.getReservationId().equals(reservationId))
                .filter(r -> userId == null || r.getUserId().equals(userId))
                .filter(r -> status == null || r.getStatus().equals(status))
                .filter(r -> date == null || r.getDate().equals(date))
                .collect(Collectors.toList());
    }
}
