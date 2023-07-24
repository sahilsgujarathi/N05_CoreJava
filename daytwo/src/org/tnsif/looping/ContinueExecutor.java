// Program to Demonstrate Continue Executor
package org.tnsif.looping;

public class ContinueExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=10; i++) {
			if(i==5) {
				continue;
			}
			else {
				System.out.print(i + " ");
			}
		}
	}
}
