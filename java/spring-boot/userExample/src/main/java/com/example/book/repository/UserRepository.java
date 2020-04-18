package com.example.book.repository;



import org.springframework.data.repository.CrudRepository;

import com.example.book.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
