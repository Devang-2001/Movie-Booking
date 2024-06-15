package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.moviebooking.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {}

