package com.example.demo.dto.response;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

/**
 * CSV出力用の予約情報DTO
 */
@Data
public class CSVOutputResponseDTO {
    private Integer seqNumber;
    private String reservationId;
    private Date date;
    private Time startTime;
    private Time endTime;
    private String status;
    private String representName;
    private String roomId;
    private String description;
    private String reasonRejected;
}
