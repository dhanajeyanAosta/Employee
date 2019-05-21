package Aosta.Employee;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@RequestMapping(method = RequestMethod.GET,value ="/employees")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(method = RequestMethod.GET,value ="/employees/{id}")
	public Employee getAllEmployee(@PathVariable String id)
	{
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/employees")
	public void addAllEmployee(@RequestBody Employee employee)
	{
		employeeService.addEmployee(employee);
	}
	
}
