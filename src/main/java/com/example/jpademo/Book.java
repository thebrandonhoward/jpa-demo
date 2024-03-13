package com.example.jpademo;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Data
public class Book {

    @Id
    //@GeneratedValue
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String title;
    @Column
    private BigDecimal price;
    @Column
    private LocalDate publishDate;

    public Book() {

    }

    public Book(String title, BigDecimal price, LocalDate publishDate) {
        this.title = title;
        this.price = price;
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", publishDate=" + publishDate +
                '}';
    }
}
