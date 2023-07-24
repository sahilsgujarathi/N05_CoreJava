// Program to Demonstrate While Loop Executor.
package org.tnsif.looping;
import java.util.Scanner;

public class WhileLoopExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>=1) {
			System.out.print(n + " ");
			n--;
		}
		
		sc.close();
	}
}
