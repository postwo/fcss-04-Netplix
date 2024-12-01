package com.example.fcss_04.passwordencoder;

import org.junit.jupiter.api.Test;

class Sha512PasswordEncoderTest {
    @Test
    void sha512Test() {
        // given
        String rawPassword = "danny.kim";

        // when
        Sha512PasswordEncoder encoder = new Sha512PasswordEncoder();
        encoder.encode(rawPassword);
    }

}