// Program to Demonstrate Encapsulation.
/* 
 * Encapsulation achieves the Data Hiding using 
 * Private Access Specifiers
*/
package org.tnsif.encapsulation;

public class HDFC {
	
	// Private Data Members.
	private long accountNo;
	private int ccvNo;
	private String accountType;
	private int pinNo;
	
	// Getters and Setters
	/* 
	 * Getter Method is used to get a Value,
	 * And, Setter Method is used to set a Value.
	*/
	
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public int getCcvNo() {
		return ccvNo;
	}
	public void setCcvNo(int ccvNo) {
		this.ccvNo = ccvNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	
	@Override
	public String toString() {
		return "HDFC [accountNo=" + accountNo + ", ccvNo=" + ccvNo + ", accountType=" + accountType + ", pinNo=" + pinNo
				+ "]";
	}
	
}





