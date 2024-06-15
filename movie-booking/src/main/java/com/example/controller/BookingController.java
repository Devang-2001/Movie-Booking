package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.moviebooking.Booking;
import com.example.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping
    public ResponseEntity<Booking> bookSeat(@RequestBody Map<String, Long> bookingRequest) {
        Booking booking = bookingService.bookSeat(bookingRequest.get("userId"), bookingRequest.get("movieId"), bookingRequest.get("seatId"));
        return ResponseEntity.ok(booking);
    }
}