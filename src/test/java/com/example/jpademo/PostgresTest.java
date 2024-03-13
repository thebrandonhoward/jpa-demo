package com.example.jpademo;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PostgresTest {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    private EntityManager entityManager;

    @Test void randomTest() {
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);

        QBook book = QBook.book;

        List<Book> fetch = queryFactory.selectFrom(book)
                .where(book.id.gt(1))
                .fetch();

        fetch.forEach(System.out::println);
    }

    @Test
    void connectionTest() {
        assertEquals(4, bookRepository.count());
        bookRepository.findAll()
                .forEach(System.out::println);
    }
}
