package com.example.booking.service.impl;

import com.example.booking.domain.User;
import com.example.booking.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public User findById(Integer id) {
        return null;
    }
}
