package Aosta.Employee;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iMast_Department_id;
	private String cDepartment;
	private Integer bActive;
	
	public Department() {
		
	}
	
	public Department(Integer iMast_Department_id, String cDepartment, Integer bActive) {
		super();
		this.iMast_Department_id = iMast_Department_id;
		this.cDepartment = cDepartment;
		this.bActive = bActive;
	}
	public Integer getiMast_Department_id() {
		return iMast_Department_id;
	}
	public void setiMast_Department_id(Integer iMast_Department_id) {
		this.iMast_Department_id = iMast_Department_id;
	}
	public String getcDepartment() {
		return cDepartment;
	}
	public void setcDepartment(String cDepartment) {
		this.cDepartment = cDepartment;
	}
	public Integer getbActive() {
		return bActive;
	}
	public void setbActive(Integer bActive) {
		this.bActive = bActive;
	}
	 

	@Override
	public String toString() {
		return "Department [iMast_Department_id=" + iMast_Department_id + ", cDepartment=" + cDepartment + ", bActive="
				+ bActive + "]";
	}
	
}
