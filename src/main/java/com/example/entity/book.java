package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.Data;




@Entity
@Data
public class book {
	
	@Id
	private int bid;
	private String bname;
	private Integer bprice;
	
	}

	


