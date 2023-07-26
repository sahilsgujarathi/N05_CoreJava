// Driver Class.
// Program to Demonstrate Encapsulation.
/* 
 * Encapsulation achieves the Data Hiding using 
 * Private Access Specifiers
*/
package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h = new HDFC();
		
		// Setting a Value for Private Members.
		h.setAccountNo(234567890123L);
		h.setAccountType("Current Account");
		h.setCcvNo(233);
		h.setPinNo(1221);
		
		/*
		// Accessing and Printing all the Private Members.
		System.out.println(h.getAccountNo());
		System.out.println(h.getAccountType());
		System.out.println(h.getCcvNo());
		System.out.println(h.getPinNo());
		*/
		
		System.out.println(h);
	}

}
