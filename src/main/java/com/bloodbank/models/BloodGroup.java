package com.bloodbank.models;

public enum BloodGroup {

	// Blood groups with Rh factor
	A_POSITIVE("A+"), A_NEGATIVE("A-"), B_POSITIVE("B+"), B_NEGATIVE("B-"), AB_POSITIVE("AB+"), AB_NEGATIVE("AB-"),
	O_POSITIVE("O+"), O_NEGATIVE("O-");

	// Field to hold the blood group value
	private final String bloodGroup;

	// Constructor to set the blood group value
	BloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	// Getter method to retrieve the blood group value
	public String getBloodGroup() {
		return this.bloodGroup;
	}

	// Override toString() to display the blood group
	@Override
	public String toString() {
		return this.bloodGroup;
	}

	// Optional: A method to check if a given blood group is compatible
	// with another group (just as an example)
	public boolean isCompatibleWith(BloodGroup other) {
		
		return this == other; // Simple example; actual logic would be more complex
	}
}
