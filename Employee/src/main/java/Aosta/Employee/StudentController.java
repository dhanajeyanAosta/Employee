package Aosta.Employee;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

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
	public ResponseEntity<Student> getStudent(@PathVariable long id)
	{
		Student student=studentService.getStudent(id);
	     
	    if(student == null) {
	         throw new RecordNotFoundException("Invalid employee id : " + id);
	    }
	    
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET,value =  "/students/ageLessThanEqual/{age}")
	public List<Student> getStudentAgeLessThanEqual(@PathVariable long age)
	{
		List<Student> students=studentService.findByAgeLessThanEqual(age);

		if(students.isEmpty()) {
	         throw new RecordNotFoundException("Invalid Age Filter : " + age);
	    }
		return students;
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/students")
	public ResponseEntity<Student> addStudent(@Valid @RequestBody Student student)
	{
		studentService.addStudent(student);
		return new ResponseEntity<Student>(student, HttpStatus.OK);	
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/students")
	public ResponseEntity<Student> updateStudent(@Valid @RequestBody Student student)
	{
		studentService.addStudent(student);
		return new ResponseEntity<Student>(student, HttpStatus.OK);	
	}
}
