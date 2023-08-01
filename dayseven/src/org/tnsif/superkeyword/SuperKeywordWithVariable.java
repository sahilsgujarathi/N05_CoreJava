// Program to demonstrate Super Keyword with Variables.
package org.tnsif.superkeyword;
class State {
	String statename = "Punjab";
}

class Capital extends State{
	String statename = "Hariyana";
	String capital = "Chandigarh";
	
	public void display() {
		/*
		 * Super Keyword with variable is used to call parent class variable if and only if
		 * Parent and Child class variable name are same.
		*/
		System.out.println(super.statename);
		System.out.println(statename);		
	}
}

// Driver Class.
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Capital c = new Capital();
		System.out.println(c.statename);	
		c.display();
	}

}
