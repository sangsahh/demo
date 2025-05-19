package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "visit_logs")
public class VisitLogs {

    @Id
    @Column(name = "visit_id")
    private String visitId;

    @Column(name = "visitor_id")
    private String visitorId;

    @Column(name = "seq_number")
    private int seqNumber;

    @Column(name = "checkin_time")
    private Timestamp checkinTime;

    @Column(name = "checkout_time")
    private Timestamp checkoutTime;

    @Column(name = "delete_flag")
    private boolean deleteFlag;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_date")
    private Timestamp updatedDate;

    // Getter / Setter 略
}
