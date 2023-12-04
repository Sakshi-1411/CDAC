package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestArrayList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		int choice=0;
		do {
		System.out.println("1. Add new Employee\n2. delete employee by id\n 3. modify salary");
		System.out.println("4. Display all\n5. display by id\n 6. sort by salary\n7. sort by name");
		System.out.println("8. Display n topmost based on salary \n9. exit\n choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("1. salaried\n2.contract\n 3.vendor");
			int ch=sc.nextInt();
			eservice.addnewEmployee(ch);
			break;
		case 2:
			System.out.println("enetr id for delete");
			int id=sc.nextInt();
			boolean status=eservice.deleteById(id);
			if(status) {
				System.out.println("deleted successfully");
			}
			else {
				System.out.println("not found");
			}
			break;
		case 3:
			System.out.println("enetr id for delete");
			id=sc.nextInt();
			System.out.println("enter salary");
			double sal=sc.nextDouble();
			status=eservice.modifySalById(id,sal);
			if(status) {
				System.out.println("modified successfully");
			}
			else {
				System.out.println("not found");
			}
			break;
}
