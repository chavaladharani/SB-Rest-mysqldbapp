package com.example.scon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.book;
import com.example.repo.bookrepo;

@RestController
public class bookcontroller {
	
	@Autowired
	private bookrepo repo;
	
	@PostMapping(value="/book",consumes="application/json")
	public ResponseEntity<String> addbook(@RequestBody book bk)
	{
		repo.save(bk);
		String msg="book deails are saved";
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping(value="/books",produces="application/json")
	
	public ResponseEntity<List<book>> getbook()
	{
		List<book> find = repo.findAll();
		
		return new ResponseEntity<>(find,HttpStatus.OK);
		
	}

}
