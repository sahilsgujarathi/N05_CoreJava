package org.tnsif.heirarchicalinheritance;

public class SnowCone extends Android{
	
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
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	// Parameterized Constructor.
	public SnowCone(String brandName, String slotType, int version) {
		super(brandName, slotType);
		this.version = version;
	}
	
}
