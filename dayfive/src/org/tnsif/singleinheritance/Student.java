package org.tnsif.singleinheritance;
// Derived Class
public class Student extends Citizen{
	
	// Private Data Members.
	private int rollno;
	private String collegeName;
	
	// Default Constructor.
	public Student() {
		// super() - It calls Parent Class Default Constructor.
		super();
		System.out.println("Child Class-Default Constructor.");
	}
	
	// Parameterized Constructor.
	public Student(String city, int pincode, long aadharNo, long contactNo,
			int rollno, String collegeName) {
		super(city, pincode, aadharNo, contactNo);
		this.rollno = rollno;
		this.collegeName = collegeName;
	}
	
	// Getters and Setters.
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	// To-String Method.
	// Select data members of child class and select tostring from inherited class.
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}

}

