package com.example.book.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.book.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{

}
