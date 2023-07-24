// Program to Demonstrate on Bunjee Jumping using Nested If
package org.tnsif.decisionmaking;
import java.util.Scanner;

public class NestedIfExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int weight = sc.nextInt();
		
		if(age>=12) {
			if(weight>=40) {
				System.out.println("Eligible for Bunjee Jumping.");
				if(weight>110) {
					System.out.println("Extra Ropes will be Added.");
				}
			}
			else {
				System.out.println("Not Eligible for Bunjee Jumping.");
			}
		}
		else {
			System.out.println("Not Eligible for Bunjee Jumping.");
		}
		
		sc.close();
	}
}
