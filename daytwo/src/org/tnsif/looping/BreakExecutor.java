// Program to Demonstrate Break Executor.
package org.tnsif.looping;

public class BreakExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=10; i++) {
			if(i==5) {
				break;
			}
			else {
				System.out.print(i + " ");
			}
		}
	}
}
