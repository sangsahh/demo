package com.example.demo.dto.response;

import java.sql.Date;
import java.sql.Time;
import lombok.Data;


@Data
public class ResponseDTO {

    private Integer seqNumber;
    private String reservationId;
    private Date reservationDate;
    private Time startTime;
    private Time endTime;
    private String status;
    private String representName;
    private String roomId;
    private String description;
    private String reasonRejected;

}