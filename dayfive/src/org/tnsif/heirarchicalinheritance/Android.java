package org.tnsif.heirarchicalinheritance;
// Parent/Base Class - Super Class
public class Android {
	private String brandName;
	private String slotType;
	
	// Getters and Setters.
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getSlotType() {
		return slotType;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
		
	// toString Method.
	@Override
	public String toString() {
		return "Android [brandName=" + brandName + ", slotType=" + slotType + "]";
	}
	public Android() {
		super();
		System.out.println("Default Constructor in Parent Class.");
	}
	public Android(String brandName, String slotType) {
		super();
		this.brandName = brandName;
		this.slotType = slotType;
		System.out.println("Parameterized Constructor in Parent Class.");
	}
	
	
	
	

}
