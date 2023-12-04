package com.demo.dao;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.List;
import java.util.Set;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class EmployeeDaoImpl implements EmployeeDao{
	static Set<Employee> hs;
	static {
		hs=new HashSet<>();
		hs.add(new SalariedEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
 		hs.add(new SalariedEmp(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
 		hs.add(new ContractEmployee(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		hs.add(new ContractEmployee(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
 		hs.add(new ContractEmployee(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
	}
	
	public void save(Employee e) {
		
		hs.add(e);
	}
	
	public Set<Employee> getAll() {
		return hs;
	}
	
	public Employee getById(int id) {
		for(Employee e:hs) {
			if(e.getPid()==id) {
				return e;
			}
		}
		return null;
	}
	
	public boolean removeById(int id) {
		return hs.remove(new SalariedEmp(id) );
	}
	
	public boolean updateSalById(int id, double sal) {
		Employee e = getById(id);
		if(e!=null) {
			if(e instanceof SalariedEmp) {
				((SalariedEmp) e).setSal(sal);
			}
			else if(e instanceof ContractEmployee){
				((ContractEmployee) e).setCharges(sal);
			}else {
				//vendor
			}
			return true;
		}
		return false;
	}
}
