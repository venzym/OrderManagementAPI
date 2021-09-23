package com.example.gccoffee.model;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            Email email = new Email("abcd");
        });
    }

    @Test
    public void testValidEmail() {
        Email email = new Email("venzym@naver.com");
        assertEquals("venzym@naver.com", email.getAddress());
    }

    @Test
    public void testEqEmail() {
        Email email = new Email("venym@naver.com");
        Email email2 = new Email("venym@naver.com");
        assertEquals(email , email2);
    }
}