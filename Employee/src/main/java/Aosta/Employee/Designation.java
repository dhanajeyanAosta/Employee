package Aosta.Employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;

@Entity
public class Designation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
    private long id;
    
    @Column(name="Designation")
    private String name;
    
    @Column(name="Active")
    private long active;

    public Designation()
    {
        super();
    }
    public Designation(long id, String name, long active)
    {
        super();
        this.id = id;
        this.name = name;
        this.active = active;
    }
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getActive() {
		return active;
	}
	public void setActive(long active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "Designation [id=" + id + ", name=" + name + ", active=" + active + "]";
	}
    
    
}
