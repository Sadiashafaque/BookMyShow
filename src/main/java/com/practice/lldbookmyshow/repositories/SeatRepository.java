package com.practice.lldbookmyshow.repositories;

import com.practice.lldbookmyshow.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Long> {
    List<Seat> findAllBy(List<Long> ids);
}
