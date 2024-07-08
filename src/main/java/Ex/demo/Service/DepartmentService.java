package Ex.demo.Service;

import Ex.demo.Model.Department;
import Ex.demo.Model.Employee;
import Ex.demo.Model.Position;

import java.util.List;

public interface DepartmentService {
    public Department finById(int id);
    public List<Department> findAll();
    public Department Insert(Department department);
    public Department Update(Department department);
    public String Delete(Department department);

}
