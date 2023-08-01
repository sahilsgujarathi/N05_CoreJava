// Program to Demonstrate Super Keyword with Constructor.
package org.tnsif.superkeyword;
class Nationality {
	String nationName;

	public Nationality(String nationName) {
		this.nationName = nationName;
		System.out.println(nationName);
	}
}

class Person extends Nationality {
	String language;

	public Person(String nationName, String language) {
		// Calling to Parent Class Constructor.
		super(nationName);
		this.language = language;
		System.out.println(language);
	}
	
}

public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		Person p = new Person("Germany", "German");
	}
}
