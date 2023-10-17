package com.springboot.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int sid;
	@NotNull(message = "tata")
	public String sname;
	public String sage;
	
	
}
