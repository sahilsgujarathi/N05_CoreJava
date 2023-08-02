// This can be use as an argument in a method call.
package org.tnsif.thiskeyword;

public class ThisKeywordDemoThree {
	
	void print(ThisKeywordDemoThree t)
	{
		System.out.println("Hey there ,I am using 'this"+"keyword");
	}
	void diplay(){
		/*
		 * when you call any parameterized method inside non parameterized method then we
		 * get an error to overcome that we have to use this keyword as an argument in
		 * method call.
		*/
			   
		print(this);
	}

	public static void main(String[] args) {
		ThisKeywordDemoThree t = new ThisKeywordDemoThree();
		t.diplay();
	}

}
