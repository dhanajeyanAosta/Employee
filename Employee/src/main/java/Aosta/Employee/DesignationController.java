package Aosta.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesignationController {

	@Autowired
	private DesignationService designationService; 
	
	@RequestMapping(method = RequestMethod.GET,value ="/designations")
	public List<Designation> getAllDesignation()
	{
		return designationService.getAllDesignation();
	}
	
	/*@RequestMapping("/designations/{id}")
	public Designation getDesignation(@PathVariable String id)
	{
		return designationService.getDesignation(id);
	}*/
}
