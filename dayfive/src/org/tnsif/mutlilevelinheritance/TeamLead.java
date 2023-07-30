package org.tnsif.mutlilevelinheritance;
//Child Class 2
//Parent Class 2
public class TeamLead extends Manager{
	
	// Private Data Members.
	private String leadName;
	private int empId;
	private String projectName;
	
	// Getters and Setters.
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public int getEmpid() {
		return empId;
	}
	public void setEmpid(int empid) {
		this.empId = empid;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	// toString Method.
	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", empid=" + empId + ", projectName=" + projectName + ", toString()="
				+ super.toString() + "]";
	}
	
	// Parametereized Constructor.
	public TeamLead(String deptName, String name, int empid, String leadName, int empId,
			String projectName) {
		super(deptName, name, empid);
		this.leadName = leadName;
		this.empId = empId;
		this.projectName = projectName;
	}
		
}









