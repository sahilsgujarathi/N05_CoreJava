/*
 * Ask a user for their birth year, encode it as two digit (like "62" and for the current 
 * year , also encode it as two digit (like "99") . Write a program to find users current
 * age in years.
*/

package org.tnsif.challenges;
import java.util.Scanner;

public class XYZ {
	
	static void age(int curr, int birth) {
		
		if(curr > birth) {
			System.out.println(curr-birth);
		}
		else {
			System.out.println((100 - birth) + curr);
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int curr = sc.nextInt();
		int birth = sc.nextInt();
		age(curr, birth);
		
		sc.close();

	}

}
