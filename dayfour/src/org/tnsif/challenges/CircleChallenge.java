/*
 *  1) There are n people standing in a circle waiting to be executed. The counting out
 *     at some point in the circle and proceeds around the circle in a fixed Direction.
 *     In each step , a certain number of people are skipped and the next person is 
 *     executed. The elimination proceeds around the circle (which is becoming smaller 
 *     and smaller as the executed people are removed.) , until only the last person 
 *     remains , who is given freedom.
 *     
 *     Given the total number of person n and a number A which indicates that k-1 person 
 *     are skipped and the kth person is killed in a circle.
 *     The task is to choose the person in the initial circle that survives.
*/

package org.tnsif.challenges;
import java.util.Scanner;

public class CircleChallenge {
	
	public static int Recursion(int n, int A) {
		if(n==1) {
			return 1;
		}
		int nextSurvivor = Recursion(n-1,A);
		int survivor = (nextSurvivor + A - 1) % n + 1;
		return survivor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int position = Recursion(n,a);
		System.out.println("The Position is:- " + position);
		
		sc.close();

	}

}
