package com.example.fcss_04.passwordencoder;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MyDelegatingPasswordEncoder {
    private final PasswordEncoder passwordEncoder;

    public String encodeWithDelegator(String raw) {
        return passwordEncoder.encode(raw);
    }
}