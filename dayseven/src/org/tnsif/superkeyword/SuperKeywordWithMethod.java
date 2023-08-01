// Program to Demonstrate Super Keyword with Method.
package org.tnsif.superkeyword;

// Parent Class.
class Sports {
	String sportsName;
	void display() {
		System.out.println("Sports name is :- " + sportsName);
	}
}

// Child Class.
class Cricket extends Sports {
	int noOfPlayers = 11;
	void display() {
		/* 
		 * If Parent and Child class methods are same and if we want to call parent class 
		 * method inside the child class then use super.methodName();
		*/
		super.display();
		System.out.println("No. of Players are:- " + noOfPlayers);
	}
}

// Driver Class.
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		
		Cricket c = new Cricket();
		c.display();

	}
}



