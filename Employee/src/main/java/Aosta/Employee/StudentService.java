package Aosta.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudent(){
		List<Student> student=new ArrayList<>();
		studentRepository.findAll().forEach(student::add);
		return student;
	}
	
	public Student getStudent(long id) {
		return studentRepository.findById(id);
	}
	
	public List<Student> findByAgeLessThanEqual(long age) {
		List<Student> student=new ArrayList<>();
		studentRepository.findByAgeLessThanEqual(age).forEach(student::add);
		return student;
	}
	
	public void addStudent(Student student )
	{
		studentRepository.save(student);
	}
}
