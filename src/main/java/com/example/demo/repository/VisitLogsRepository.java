package com.example.demo.repository;

import com.example.demo.entity.VisitLogs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitLogsRepository extends JpaRepository<VisitLogs, String> {
}
