package Aosta.Employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DesignationService {

	@Autowired
	private DesignationRepository designationRepository;
	
	public List<Designation> getAllDesignation()
	{
		List<Designation> designations=new ArrayList<>();
		designationRepository.findAll().forEach(designations::add);
		return designations;
	}
	
}
