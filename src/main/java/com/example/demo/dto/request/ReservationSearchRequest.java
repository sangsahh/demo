package com.example.demo.dto.request;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

@Data
public class ReservationSearchRequest {
    private String reservationId;
    private String userId;
    private String status;
    
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date;
} 