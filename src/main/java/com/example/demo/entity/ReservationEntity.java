package com.example.demo.entity;

import lombok.Data;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Data
public class ReservationEntity {
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
    private Boolean deleteFlag;
    private String createdBy;
    private Timestamp createdDate;
    private String updatedBy;
    private Timestamp updatedDate;
}
