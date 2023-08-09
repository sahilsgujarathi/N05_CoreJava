// Program to demonstrate on Final Method.
package org.tnsif.finalkeyword;

// We can't inherit final class.
// public final class shape.

public class Shape {
	
	final String shapename = "Circle";
	
	// Final Method
	final void printShapeType() {
		System.out.println(shapename);
	}
}
