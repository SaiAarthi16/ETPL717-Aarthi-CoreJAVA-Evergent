package com.evergent.corejava.aarthi.application6;
import java.util.HashSet;
import java.util.Set;
public class EmployeeImpl implements EmployeeInterface{
	static Set<Employee> empSet=new HashSet<Employee>();
	@Override
	public String addEmployee(Employee e) {
		empSet.add(e);
		return "Employee details are added!! :)";
	}

	@Override
	public void searchByEmpId(String isId) {
		boolean f=false;

		if (empSet.size() > 0) {
		    for (Employee emp : empSet) {
		        if (emp.getIsId().equals(isId)) {
		            System.out.println(emp.getIsId() + " " + emp.getEmployeeName() + " " + emp.getDesignation());
		            f = true;
		            break;
		        }
		    }
		}
		if (!f) {
		    System.out.println("No Employee with Id " + isId + " found.");
		}
		
	}
	@Override
	public void getAllEmployees() {
		if (empSet.size() > 0) {
		    for (Employee emp : empSet) {
		    	System.out.println(emp.getIsId() + "---> " + emp.getEmployeeName() + "---> " + emp.getDesignation());
		    }
	}
		else
			System.out.println("No Employees are found");
	
	}
}
