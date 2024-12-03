package com.practice.lldbookmyshow.repositories;

import com.practice.lldbookmyshow.models.Seat;
import com.practice.lldbookmyshow.models.Show;
import com.practice.lldbookmyshow.models.ShowSeatMapping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatRepository extends JpaRepository<ShowSeatMapping,Long> {
    @Override
    List<ShowSeatMapping> findAll(List<Seat> seats, Show show);
}
