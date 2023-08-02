// This can be passed as argument in the constructor call.

package org.tnsif.thiskeyword;

public class ThisKeywordDemoTwo {
	
	// Default variable
	int x,y;
	
	 public ThisKeywordDemoTwo (int x,int y) {
		// We can change the parameter name
		this.x=x;
		this.y=y;	
	}
	 
	 void display(){
		 System.out.println(x+" "+y);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordDemoTwo t=new ThisKeywordDemoTwo(2,3);
		t.display();

	}

}
