package Aosta.Employee;
 

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import Aosta.Employee.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

	List<Department> findAll();
}
