package com.practice.lldbookmyshow.repositories;

import com.practice.lldbookmyshow.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShowRepository extends JpaRepository<Show, Long> {


}
