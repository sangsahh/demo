package com.example.demo.dto.response;

import lombok.Data;
import java.sql.Date;
import java.sql.Time;

@Data
public class HistorySearchResponseDTO {
    private String reservationId;
    private String userId;
    private String roomId;
    private Integer seqNumber;
    private String description;
    private Date date;
    private Time startTime;
    private Time endTime;
    private String status;
    private String reasonRejected;
} 