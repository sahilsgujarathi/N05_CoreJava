// Program to Demonstrate on Default and Parameterized Constructor.
package org.tnsif.classandobjects;

public class Citizen {
	// Data Members
	String citizenType;
	long aadharNo;
	String gender;
	String city;
	
	// Default Constructor.
	public Citizen() {
		System.out.println("Demonstration on Default Constructor.");		
	}
	
	// Parameterized Constructor.
	public Citizen(String citizenType, long aadharNo, String gender, String city) {
		super();
		this.citizenType = citizenType;
		this.aadharNo = aadharNo;
		this.gender = gender;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Citizen [citizenType=" + citizenType + ", aadharNo=" + aadharNo + ", gender=" + gender + ", city="
				+ city + "]";
	}
}
