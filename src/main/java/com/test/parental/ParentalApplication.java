package com.test.parental;

import com.test.parental.Repository.BookRepository;
import com.test.parental.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParentalApplication implements CommandLineRunner {


    private final BookRepository bookRepo;

    public ParentalApplication(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(ParentalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Book newBook = new Book(1,"gothan city","jeremy","200");
        bookRepo.save(newBook);
    }
}
