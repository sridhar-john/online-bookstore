package com.accolite.onlinebookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accolite.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long> {

}
