// Program to Demonstrate Cascaded If-Else
package org.tnsif.decisionmaking;
import java.util.Scanner;

public class CascadedIfElseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age1 = sc.nextInt();
		int age2 = sc.nextInt();
		int age3 = sc.nextInt();
		
		if(age1>age2 && age1>age3) {
			System.out.println("Age 1 is Greater: " + age1);
		}
		else if(age2>age1 && age2>age3) {
			System.out.println("Age 2 is Greater: " + age2);
		}
		else {
			System.out.println("Age 3 is Greater: " + age3);
		}
		
		sc.close();
	}

}
