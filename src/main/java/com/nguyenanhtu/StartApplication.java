package com.nguyenanhtu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nguyenanhtu.Book;
import com.nguyenanhtu.BookRepository;


@SpringBootApplication
public class StartApplication implements CommandLineRunner { 

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}
	
	@Autowired
	private BookRepository repository;
	
	public void run(String... args) throws Exception {
		repository.save(new Book("Java"));
		repository.save(new Book("Node"));
		repository.save(new Book("Python"));
		
		System.out.println("\nfindById(1L)");
		repository.findAll().forEach(x -> System.out.println(x));
		
		System.out.println("\nfindById(1L)");
		repository.findById(1l).ifPresent(x -> System.out.println(x));
		
		System.out.println("\nfindByName(Node)");
		repository.findByName("Node").forEach(x -> System.out.println(x));
	}	
}
