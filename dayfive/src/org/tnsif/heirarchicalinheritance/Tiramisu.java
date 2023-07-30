package org.tnsif.heirarchicalinheritance;
// Child Class 1.
public class Tiramisu extends Android {
	// Private Data Members
	private int version;
	
	// Getters and Setters.
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	// toString Method.
	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}

	// Default Constructor.
	public Tiramisu() {
		super();
	}
	
	// Parameterized Constructor.
	public Tiramisu(String brandName, String slotType, int version) {
		super(brandName, slotType);
		this.version = version;
	}

	
	
}
