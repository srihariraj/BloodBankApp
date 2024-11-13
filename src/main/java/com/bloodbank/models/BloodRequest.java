package com.bloodbank.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BloodRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long requestId;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false) // Foreign key to User
	private User user; // A blood request is associated with one user

	private String patientName;
	
	@Enumerated(EnumType.STRING)
	private BloodGroup patientBloodGroup;
	private String city;
	private String doctorName;
	private String hospitalName;
	private String hospitalAddress;
	private Date dateOfRequirement;
	private String contactName;
	private long contactNumber;
	private String contactEmail;
	private String message;

	@Enumerated(EnumType.STRING)
	private Status status;

	public enum Status {
		PENDING, APPROVED, REJECTED
	}
}
