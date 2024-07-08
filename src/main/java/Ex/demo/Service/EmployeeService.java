package Ex.demo.Service;

import Ex.demo.Dto.EmployeeDto;
import Ex.demo.Model.Employee;
import Ex.demo.Model.Position;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface EmployeeService  {
    public Employee finById(int id);
    Page<Employee> findAll(Pageable pageable);
    public Employee Insert(EmployeeDto employee, int de, int pos);
    public Employee Update(Employee employee);
    public String Delete(Employee employee);
}
