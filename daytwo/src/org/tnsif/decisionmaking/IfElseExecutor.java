// Program to demonstrate If Else
package org.tnsif.decisionmaking;
import java.util.Scanner;

public class IfElseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		int weight = sc.nextInt();
		
		if(age>18 && weight>50) {
			System.out.println("Eligible to Donate Blood");
		}
		else {
			System.out.println("Not Eligible to Donate Blood");
		}
		
		sc.close();
	}

}
