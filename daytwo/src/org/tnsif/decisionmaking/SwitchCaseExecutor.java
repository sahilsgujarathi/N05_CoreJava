// Program to Demonstrate Switch Case.
package org.tnsif.decisionmaking;
import java.util.Scanner;

public class SwitchCaseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which callertune to Activate:- ");
		int songno = sc.nextInt();
		
		switch(songno) {
		case 1:
			System.out.println("Aaj Din Chadeya");
			break;
		case 2:
			System.out.println("Gadar");
			break;
		case 3:
			System.out.println("Apna Bana le");
			break;
		case 4:
			System.out.println("Oo Antava");
			break;
		default:
			System.out.println("Invalid Input.");		
		}
		
		sc.close();
	}
}
