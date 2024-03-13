package com.example.jpademo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PostgresTest {
    @Autowired
    BookRepository bookRepository;

    @Test
    void connectionTest() {
        assertEquals(4, bookRepository.count());
        bookRepository.findAll()
                .forEach(System.out::println);
    }
}
