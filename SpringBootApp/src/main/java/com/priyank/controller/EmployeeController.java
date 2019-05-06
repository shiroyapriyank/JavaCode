package com.priyank.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.priyank.model.Employee;
import com.priyank.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String defaultMethod(ModelMap model) {

		return "index";
	}
	
	@GetMapping("/testing")
	public Map<String,Object> insertEmployee(Map<String, Object> map) {
		Employee e1 = new Employee(1004, "Priyank", "1113 HighFieldCT");
		Employee e2 = new Employee(1005, "Priya", "1113 HighFieldCT");
		map.put("empForm", e1);
		map.put("empForm", e2);
		return map;
	}
	
	@GetMapping("/list-emp")
	public String listEmployee(ModelMap model) {
		int employeeId = 1001;
		model.addAttribute("emp",employeeService.findEmployeeById(employeeId));
		return "list-emp";
	}
	
	@PutMapping("/edit-emp")
	public String updateEmployee(@RequestParam int empId,ModelMap model) {
		Employee employee = employeeService.findEmployeeById(empId);
		model.addAttribute("edit",employee);
		return "edit-emp";
	}
	
	@DeleteMapping("/delete-emp")
	public String deleteEmployee(@RequestParam int empId,ModelMap model) {
		employeeService.deleteEmployee(empId);
		return "redirect:/list-emp";
	}
	
	@PostMapping("/insert-emp")
	public String insertEmployee(ModelMap model,@Valid Employee e,BindingResult result) {
		employeeService.addEmployee(e.getEmployeeId(), e.getEmployeeName(), e.getEmployeeAddress());
		return "redirect:/list-emp";
	}
	
	
}
