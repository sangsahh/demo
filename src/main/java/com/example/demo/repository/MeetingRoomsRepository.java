package com.example.demo.repository;

import com.example.demo.entity.MeetingRooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRoomsRepository extends JpaRepository<MeetingRooms, String> {
}
