package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "visitors_info")
public class VisitorsInfo {

    @Id
    @Column(name = "visitor_id")
    private String visitorId;

    @Column(name = "reservation_id")
    private String reservationId;

    @Column(name = "seq_number")
    private int seqNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "token")
    private String token;

    @Column(name = "delete_flag")
    private Boolean deleteFlag;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_date")
    private Timestamp updatedDate;

    // Getter & Setter 省略如需可自動生成
}
