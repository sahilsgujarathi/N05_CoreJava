// Program to Demonstrate on Access Specifiers.
package org.tnsif.accessspecifiers;

public class Bank {
	
	// Different Access Specifiers.
	public String bankName;
	private int pinNo;
	long accountNo = 3456778901234L;
	
	// Public Method
	public void displayPublic() {
		System.out.println("Bank Name is:- " + bankName);
	}
	
	// Private Method
	private void displayPrivate() {
		System.out.println("Pin Number is:- " + pinNo);
	}
	
	// Default Method
	void displayDefault() {
		System.out.println("Account No:- " + accountNo);
	}
	
}

