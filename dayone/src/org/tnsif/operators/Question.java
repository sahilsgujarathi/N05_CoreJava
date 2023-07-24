// Program to demonstrate that the Person is Eligible for Blood Donation or Not.
package org.tnsif.operators;
import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age:- ");
		int age = sc.nextInt();
		System.out.println("Enter Your Weight:- ");
		float weight = sc.nextFloat();
		
		if((age>=18) && (weight>=50.00f)) {
			System.out.println("You are Eligible for Blood Donation.");
		}
		else {
			System.out.println("You are not Eligible for Blood Donation");
		}
		
		sc.close();
	}
}
