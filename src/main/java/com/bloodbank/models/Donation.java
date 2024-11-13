package com.bloodbank.models;

import java.util.Date;

import com.bloodbank.models.BloodRequest.Status;

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
public class Donation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long donationId;

	@ManyToOne
	@JoinColumn(name = "donor_id", nullable = false) // Foreign key to User (Donor)
	private User donor; // A donation is made by a user (donor)

	private short bloodGlucose;

	@Enumerated(EnumType.STRING)
	private Status status;

	private String notes;
	private Date donationDate;
}
