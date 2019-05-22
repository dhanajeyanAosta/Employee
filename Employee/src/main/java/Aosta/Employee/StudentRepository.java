package Aosta.Employee;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StudentRepository extends CrudRepository<Student, Long> 
{
    public Student findByStudentId(long StudentId);

    //@Query("select s from Student s where s.age <= ?")
    public List<Student> findByAgeLessThanEqual (long age);
}