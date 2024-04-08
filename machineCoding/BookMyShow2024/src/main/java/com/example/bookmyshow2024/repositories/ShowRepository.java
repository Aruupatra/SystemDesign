package com.example.bookmyshow2024.repositories;

import com.example.bookmyshow2024.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShowRepository extends JpaRepository<Show,Long> {


    Optional<Show> findById(Long userId);

}
