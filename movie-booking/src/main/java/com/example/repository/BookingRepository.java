package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.moviebooking.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {}

