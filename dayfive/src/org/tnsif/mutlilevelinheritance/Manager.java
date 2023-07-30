package org.tnsif.mutlilevelinheritance;
// Parent Class 1 (Super Class)
public class Manager {
	
	// Private Data Members.
	private String deptName;
	private String name;
	private int empid;
	
	// Default Constructor.
	public Manager() {
		System.out.println("Default Constructor - Manger");
	}

	// Parameterized Constructor.
	public Manager(String deptName, String name, int empid) {
		super();
		this.deptName = deptName;
		this.name = name;
		this.empid = empid;
	}
	
	// toString Method.
	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + ", name=" + name + ", empid=" + empid + "]";
	}

	// Getters and Setters.
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

}

