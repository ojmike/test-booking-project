package com.example.booking.service;

import com.example.booking.domain.Booking;
import com.example.booking.payload.request.BookingRequest;
import com.example.booking.payload.response.BookingResponse;

public interface BookingService {
    BookingResponse createBooking(BookingRequest request);
}
