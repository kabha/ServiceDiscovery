package com.empl.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.empl.model.Employee;

@RestController
public class EmployeeController {
	

	 private static Map<String,List<Employee> > CompanyDB = new HashMap<String ,List<Employee>>();
	 
	    static {
	    	CompanyDB = new HashMap<String, List<Employee>>();
	 
	        List<Employee> lst = new ArrayList<Employee>();
	        Employee empl = new Employee("Pini", "ADRM");
	        lst.add(empl);
	        empl = new Employee("Assaf", "ADOM");
	        lst.add(empl);
	 
	        CompanyDB.put("AD", lst);
	 
	        lst = new ArrayList<Employee>();
	        empl = new Employee("Inna", "ADLM");
	        lst.add(empl);
	        empl = new Employee("Susan", "ADCM");
	        lst.add(empl);
	 
	        CompanyDB.put("CD", lst);
	 
	    }
	 
	    @RequestMapping(value = "/getEmployeeDetailsForDepart/{depart}", method = RequestMethod.GET)
	    public List<Employee> getEmployees(@PathVariable String depart) {
	        System.out.println("Getting Employee details for " + depart);
	 
	        List<Employee> emplList = CompanyDB.get(depart);
	        if (emplList == null) {
	        	emplList = new ArrayList<Employee>();
	        	Employee empl = new Employee("Not Found", "N/A");
	        	emplList.add(empl);
	        }
	        return emplList;
	    }

}
