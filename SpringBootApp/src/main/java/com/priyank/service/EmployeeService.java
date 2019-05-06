package com.priyank.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.priyank.model.Employee;

@Service
public class EmployeeService {

	private int count = 0;
	private static List<Employee> emp = new ArrayList<Employee>();
	static {
		emp.add(new Employee(1001, "Priyank", "1113 HighFieldCT"));
		emp.add(new Employee(1002, "Punit", "1126 HighFieldCT"));
		emp.add(new Employee(1003, "Anirudhh", "1124 HighFieldCT"));
	}
	
	public List<Employee> findEmployeeByName(String employeeName){
		List<Employee> emp = new ArrayList<>();
		for(Employee employee:emp) {
			if(employee.getEmployeeName().equals(employeeName)) {
				emp.add(employee);
			}
		}
		return emp;
	}

	public Employee findEmployeeById(int employeeId) {
		for(Employee employee:emp) {
			if(employee.getEmployeeId()==employeeId) {
				return employee;
			}
		}
		return null;
	}
	public void updateEmployee(Employee employee) {
		emp.remove(employee);
		emp.add(employee);
	}
	
	public void deleteEmployee(int employeeId) {
		Iterator<Employee> it = emp.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			if(emp.getEmployeeId() == employeeId) {
				it.remove();
			}
		}
	}
	public void addEmployee(int employeeId,String employeeName,String employeeAddress) {
		emp.add(new Employee(++count,employeeName,employeeAddress));
	}
}
