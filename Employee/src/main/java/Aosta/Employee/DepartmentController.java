package Aosta.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
 

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(method = RequestMethod.GET,value ="/departments")
	public List<Department> getAllDepartment()
	{		
		return departmentService.getAllDepartment();
	}
	
	@RequestMapping(method = RequestMethod.GET,value ="/departments/{id}")
	public Department getDepartment(@PathVariable Integer id )
	{		
		return departmentService.getDepartment(id);
	}
}
