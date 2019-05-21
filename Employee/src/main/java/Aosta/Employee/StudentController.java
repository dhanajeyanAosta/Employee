package Aosta.Employee;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	 
	@RequestMapping(method = RequestMethod.GET,value =  "/students")
	public List<Student> getAllStudent()
	{
		return studentService.getAllStudent();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/students/{id}")
	public Student getStudent(long id)
	{
		return studentService.getStudent(id);
	}
	
	@RequestMapping(method = RequestMethod.GET,value =  "/students/ageLessThanEqual/{age}")
	public List<Student> getStudentAgeLessThanEqual(@PathVariable long age)
	{
		return studentService.findByAgeLessThanEqual(age);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/students")
	public void addStudent(@RequestBody Student student)
	{
		studentService.addStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/students")
	public void updateStudent(@RequestBody Student student)
	{
		studentService.addStudent(student);
	}
}
