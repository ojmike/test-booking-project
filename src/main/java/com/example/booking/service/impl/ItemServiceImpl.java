package com.example.booking.service.impl;

import com.example.booking.domain.Item;
import com.example.booking.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    @Override
    public Item findById(Integer id) {
        return null;
    }
}
