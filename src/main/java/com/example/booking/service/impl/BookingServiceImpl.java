package com.example.booking.service.impl;

import com.example.booking.domain.Booking;
import com.example.booking.domain.Item;
import com.example.booking.domain.User;
import com.example.booking.payload.request.BookingRequest;
import com.example.booking.payload.response.BookingResponse;
import com.example.booking.repository.BookingRepository;
import com.example.booking.repository.UserRepository;
import com.example.booking.service.BookingService;
import com.example.booking.service.ItemService;
import com.example.booking.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final ItemService itemService;

    private final UserService userService;

    private final BookingRepository repository;
    @Override
    public BookingResponse createBooking(BookingRequest request) {

        Booking booking = new Booking();

        Item item = itemService.findById(request.getItemId());

        User user = userService.findById(request.getUserId());

        booking.setDescription(request.getDescription());
        booking.setItem(item);
        booking.setUser(user);
        booking = repository.save(booking);

        BookingResponse response = new BookingResponse();
        response.setDescription(booking.getDescription());
        response.setId(booking.getId());

        return response;
    }
}
