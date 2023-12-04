package com.demo.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
public class EmployeeServiceImpl {

	private EmployeeDao edao;
	public EmployeeServiceImpl() {
		edao=new EmployeeDaoImpl();
	}
	
	@Override
	public void addnewEmployee(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter mobile");
		String mob=sc.next();
		System.out.println("enter email");
		String em=sc.next();
		System.out.println("enter dept");
		String dept=sc.next();
		System.out.println("enter desg");
		String desg=sc.next();
		System.out.println("enter date of joining(dd/MM/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e=null;
		if(ch==1) {
			System.out.println("enter salary");
			double s=sc.nextDouble();
			System.out.println("enter bonus");																															
			double b=sc.nextDouble();
			e=new SalariedEmp(pid, nm, mob, em, dept, desg, ldt, s, b);
		}
		else if (ch==2) {
			System.out.println("enter Hrs");
			int hrs=sc.nextInt();
			System.out.println("enter charges per hour");
			double charges=sc.nextDouble();
			e=new ContractEmp(pid, nm, mob, em, dept, desg, ldt, hrs, charges);
		}
		else {
			System.out.println("enter no of emp");
			int emp = sc.nextInt();
			System.out.println("Enter the amt");
			double amt = sc.nextDouble();
			e=new VendorEmp(pid, nm, mob, em, dept, desg, ldt, emp, amt);
		}
		edao.save(e);
		
	}
}
