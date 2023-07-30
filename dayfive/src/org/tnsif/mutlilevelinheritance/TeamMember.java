package org.tnsif.mutlilevelinheritance;
// Child Class
public class TeamMember extends TeamLead{
	
	public TeamMember(String deptName, String name, int empid, String leadName, int empId2, String projectName,
			int size, int duration) {
		super(deptName, name, empid, leadName, empId2, projectName);
		this.size = size;
		this.duration = duration;
	}

	private int size;
	private int duration;
	
	// Getters and Setters.
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	// toString Method.
	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
}



