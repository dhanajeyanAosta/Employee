package Aosta.Employee;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Aosta.Employee.Department;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import javax.persistence.Query;

@Service
public class DepartmentService {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
	EntityManager entityManager = emfactory.createEntityManager( );
	
	//@Autowired
	//private DepartmentRepository departmentRepository;
	 
	public List<Department> getAllDepartment(){
		 Query query = entityManager.createQuery("Select iMast_Department_id ,cDepartment ,bActive from Department");
		 List<Department> list=query.getResultList();
		 return list;
		
		//return departmentRepository.findAll();
	}
	
	public Department getDepartment(Integer id){
		return entityManager.find(Department.class, id);
	}
	
 
}
