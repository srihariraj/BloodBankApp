package com.bloodbank.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long  adminId;
	
	private String name;
	
	private String password;
	
	
}
