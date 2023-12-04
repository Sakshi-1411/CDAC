package com.demo.beans;

import java.time.LocalDate;

public class SalariedEmp extends Employee {

	private double sal;
	private double bonus;
	public SalariedEmp(int pid, String nm, String mob, String em, String dept, String desg, LocalDate ldt, double s, double b) {
		super();
	}
	public SalariedEmp(int pid, String name, String mob,String dept, LocalDate doj, String desg,double sal, double bonus) {
		super(pid,name,mob,dept,doj,desg);
		this.sal = sal;
		this.bonus = bonus;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString()+"SalariedEmp [sal=" + sal + ", bonus=" + bonus + "]";
	}
	
	public double calsal() {
		return sal+bonus;
	}
	
}
