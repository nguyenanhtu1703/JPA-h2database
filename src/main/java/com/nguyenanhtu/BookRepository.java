package com.nguyenanhtu;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> findByName(String name);
}