/*
 * Pratik is so much interested in gardening and hence he plants more trees in his garden.
 * He plants trees in a rectangular fashion with a order of rows and columns and numbers 
 * the trees in row wise order. He planted the mango tree only in the first row, first 
 * column and last column. So, given the tree number and rows and columns. Your task is to
 * find out whether the given tree is mango tree or not.
 * Input n = 5.
 * Tree = 11.
*/

package org.tnsif.challenges;
import java.util.Scanner;

public class MangoTreeExecutor {
	
	static void isMangoTree(int n, int t) {
		if(t%n == 0 || t%n == 1 || t<=n) {
			System.out.println("Mango Tree.");
		}
		else {
			System.out.println("Not a Mango Tree.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:- ");
		int n = sc.nextInt();
		System.out.println("Enter t:- ");
		int t = sc.nextInt();
		sc.close();
		isMangoTree(n,t);
	}
}
