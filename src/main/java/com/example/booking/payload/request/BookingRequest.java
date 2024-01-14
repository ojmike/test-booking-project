package com.example.booking.payload.request;

import lombok.Data;

@Data
public class BookingRequest {

    private String description;

    private Integer itemId;

    private Integer userId;
}
