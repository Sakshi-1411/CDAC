package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao edao;
	public EmployeeServiceImpl() {
		edao = new EmployeeDaoImpl();
	}
	
	public void ReadFromFile() {
		edao.readDataFromFile();
	}
	
	public void addNewEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int eid = sc.nextInt();
		System.out.println("Enter Name");
		String nm = sc.next();
		System.out.println("Enter Mobile");
		String mob = sc.next();
		Employee e = new Employee(eid,nm,mob);
		edao.save(e);
	}
	
	public List<Employee> getAllEmployees(){
		return edao.findAll();
	}
	
	public boolean deleteById(int eid) {
		return edao.removeById(eid);
	}
	
	

	@Override
	public void writToFile() {
		// TODO Auto-generated method stub
		edao.writeDataToFile();
	}
}
