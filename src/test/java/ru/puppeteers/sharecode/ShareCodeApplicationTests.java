package ru.puppeteers.sharecode;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;


class ShareCodeApplicationTests {

//    @Test
//    void contextLoads() {
//    }

    @Test
    void test() {
//        System.out.println(LocalDateTime.now());
        System.out.println(UUID.randomUUID());

        System.out.println(LocalDateTime.parse("2023-05-07T10:04:32.032"));
    }

}
