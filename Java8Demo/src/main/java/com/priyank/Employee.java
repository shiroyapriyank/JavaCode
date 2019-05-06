package com.priyank;

public class Employee {

	private int empID;
	private String empName;
	private String empAddress;

	public Employee(int empID, String empName, String empAddress) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empAddress = empAddress;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

}
