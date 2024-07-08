package Ex.demo.Service;

import Ex.demo.Model.Employee;
import Ex.demo.Model.Position;

import java.util.List;

public interface EmployeeService {
    public Employee finById(int id);
    public List<Employee> findAll();
    public Employee Insert(Employee employee);
    public Employee Update(Employee employee);
    public String Delete(Employee employee);
}
