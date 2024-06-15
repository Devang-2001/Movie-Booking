package com.example.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.moviebooking.Booking;
import com.example.moviebooking.Seat;
import com.example.repository.BookingRepository;
import com.example.repository.SeatRepository;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private SeatRepository seatRepository;

    public Booking bookSeat(Long userId, Long movieId, Long seatId) {
        // Lock seat and create booking
        Seat seat = seatRepository.findById(seatId).orElseThrow();
        if (!seat.getIsAvailable()) {
            throw new RuntimeException("Seat not available");
        }
        seat.setIsAvailable(false);
        seatRepository.save(seat);

        Booking booking = new Booking();
        booking.setUserId(userId);
        booking.setMovieId(movieId);
        booking.setSeatId(seatId);
        booking.setBookingTime(new Date());

        return bookingRepository.save(booking);
    }
}
