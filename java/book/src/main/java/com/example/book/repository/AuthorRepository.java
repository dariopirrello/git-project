package com.example.book.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.book.domain.Author;

/**
 * Created by jt on 12/23/19.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
