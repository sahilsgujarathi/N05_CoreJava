// Program to Calculate Digits in a Given Number.
package org.tnsif.looping;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:- ");
		int n = sc.nextInt();
		int number = n;
		
		int count = 0;
		while(number != 0) {
			number = number/10;
			count++;			
		}
		System.out.println("The Digits in a Given Number " + n + " is " + count + ".");
		sc.close();
		
	}
}
