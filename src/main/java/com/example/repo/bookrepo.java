package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.book;

@Repository
public interface bookrepo extends JpaRepository<book,Integer>{

}
