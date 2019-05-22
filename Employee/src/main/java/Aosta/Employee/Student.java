package Aosta.Employee;
 
 import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
public class Student {
  

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="ID")
	    private long studentId;
	    
	    @Column(name="NAME" ,nullable = false,columnDefinition = "VARCHAR(100)")
	    @NotEmpty(message = "Name is mandatory")
	    private String name;
	    
	    @Column(name="AGE",nullable = false,length = 3)
	    @NotNull(message = "Age is mandatory")
	    private long age;

	    public Student()
	    {
	        super();
	    }
	    public Student(long studentId, String name, long age)
	    {
	        super();
	        this.studentId = studentId;
	        this.name = name;
	        this.age = age;
	    }
	    
	    public long getstudentId()
	    {
	        return studentId;
	    }
	    public void setstudentId(long studentId)
	    {
	        this.studentId = studentId;
	    }
	    public String getName()
	    {
	        return name;
	    }
	    public void setName(String name)
	    {
	        this.name = name;
	    }
	    public long getAge()
	    {
	        return age;
	    }
	    public void setAge(Integer age)
	    {
	        this.age = age;
	    }
	    
	    @Override
	    public String toString()
	    {
	        return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + "]";
	    }
}
