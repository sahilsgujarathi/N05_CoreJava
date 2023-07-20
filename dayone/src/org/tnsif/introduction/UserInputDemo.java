// Program to demonstrate user input.

package org.tnsif.introduction;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		// For Integer
		System.out.println("Enter the value of num:- ");
		int num = s.nextInt();
		System.out.println("The value of num is:- " + num);
		
		// For Float 
		System.out.println("Enter value of float:- ");
		float num1 = s.nextFloat();
		System.out.println("The value of num1 is:- "+num1);
		
		// For Character
		System.out.println("Enter a Character:- ");
		char ch = s.next().charAt(0);
		System.out.println("The character is:- "+ch);
		
		// For String
		System.out.println("Enter a String:- ");
		String str = s.next();
		System.out.println("String is:- "+str);
		String str1 = s.nextLine();
		s.next();
		System.out.println("String is:- "+str1);
		
		
		

	}

}
