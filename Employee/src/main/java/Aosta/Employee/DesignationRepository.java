package Aosta.Employee;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DesignationRepository extends CrudRepository<Designation,String> {

}
