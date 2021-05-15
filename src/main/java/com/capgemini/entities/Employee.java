package com.capgemini.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String email;
	
}
