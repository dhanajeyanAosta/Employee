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
	
	public Student getStudent(long Id) {
		return studentRepository.findByStudentId(Id);
	}
	
	public List<Student> findByAgeLessThanEqual(long age) {
		List<Student> student=new ArrayList<>();
		studentRepository.findByAgeLessThanEqual(age).stream().forEach(student::add);
		return student;
	}
	
	public void addStudent(Student student )
	{
		studentRepository.save(student);
	}
}
