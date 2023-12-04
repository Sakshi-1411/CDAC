package com.demo.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;


public class EmployeeDaoImpl implements EmployeeDao{
	static List<Employee> elist;
	{
		elist = new ArrayList<>();
	}
	
	public void save(Employee e) {
		elist.add(e);
	}
	
	public List<Employee>findAll(){
		return elist;
	}
	
	public boolean removeById(int eid) {
		return elist.remove(new Employee(eid,null,null));
	}
	
	public void readDataFromFile() {
		File f = new File("empdata.txt");
		if(f.exists()) {
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empdata.txt"));){
			while(true) {
				Employee e =(Employee)ois.readObject();
				elist.add(e);
			}
			}catch(EOFException e) {
				System.out.println("Reached to end of file");
			}catch(IOException|ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void writeDataToFile() {
		// TODO Auto-generated method stub
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empdata.txt"));){
			for(Employee e:elist) {
				oos.writeObject(e);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
