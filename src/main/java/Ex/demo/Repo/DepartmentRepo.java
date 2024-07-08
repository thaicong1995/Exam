package Ex.demo.Repo;

import Ex.demo.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
}
