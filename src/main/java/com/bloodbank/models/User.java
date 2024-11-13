package com.bloodbank.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;

	private String firstName;
	private String lastName;
	
	@Enumerated(EnumType.STRING)
	private BloodGroup bloodGroup;
	private String city;
	private long contactNumber;
	private String email;

	@Enumerated(EnumType.STRING)
	private Role role;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<BloodRequest> bloodRequests; // One user can have multiple blood requests

	@OneToMany(mappedBy = "donor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Donation> donations; // One user can donate multiple times

	public enum Role {
		REQUESTER, DONOR
	}
}
