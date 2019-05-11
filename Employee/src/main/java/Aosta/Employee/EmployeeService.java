package Aosta.Employee;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
@Service
public class EmployeeService {

	private List<Employee> employees = new ArrayList<>(Arrays.asList(
			new Employee("1","Ram","Development"),
			new Employee("2","Kumar","QA"),
			new Employee("3","Raj","Development")
			));
	
	public List<Employee> getAllEmployees(){
		return employees;
	}
	
	public Employee getEmployee(String id){
		return employees.stream().filter(e->e.getId().equals(id)).findFirst().get();
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
}
