package com.demo.beans;
import java.time.LocalDate;
public class ContractEmp extends Employee {

	private double charges;
	private int hrs;
	
	
	public ContractEmp(int pid, String nm, String mob, String em, String dept, String desg, LocalDate ldt, int hrs2, double charges2) {
		super();
	}


	public ContractEmp(int pid, String name, String mob,String dept, LocalDate doj,String desg,double charges, int hrs) {
		super(pid,name,mob,dept,doj,desg);
		this.charges = charges;
		this.hrs = hrs;
	}


	public double getCharges() {
		return charges;
	}


	public void setCharges(double charges) {
		this.charges = charges;
	}


	public int getHrs() {
		return hrs;
	}


	public void setHrs(int hrs) {
		this.hrs = hrs;
	}


	@Override
	public String toString() {
		return "ContractEmp [charges=" + charges + ", hrs=" + hrs + "]";
	}
	
	public double calsal() {
		return charges*hrs;
	}
	
}
