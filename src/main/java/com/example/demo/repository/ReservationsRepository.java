package com.example.demo.repository;

import com.example.demo.entity.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationsRepository extends JpaRepository<Reservations, String> {
}
