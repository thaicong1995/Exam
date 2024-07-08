package Ex.demo.Service.Imp;

import Ex.demo.Dto.EmployeeDto;
import Ex.demo.Model.Department;
import Ex.demo.Model.Employee;
import Ex.demo.Model.Position;
import Ex.demo.Repo.DepartmentRepo;
import Ex.demo.Repo.EmployeeRepo;
import Ex.demo.Repo.PositionRepo;
import Ex.demo.Service.EmployeeService;
import Ex.demo.Service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
@Service
public class EmployeeImpl implements EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    DepartmentRepo departmentRepo;
    @Autowired
    PositionRepo positionRepo;
    @Override
    public Employee finById(int id) {
        return null;
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepo.findAll(pageable);
    }
    @Override
    public Employee Insert(EmployeeDto employee, int de, int pos) {
        Department department = departmentRepo.findById(de).orElseThrow(null);
        Position position = positionRepo.findById(pos).orElseThrow(null);
        Employee employee1 = new Employee();
        employee1.setId(employee.getId());
        employee1.setName(employee.getName());
        employee1.setSalary(employee.getSalary());
        employee1.setDepartment(department);
        employee1.setPosition(position);
        return  employeeRepo.save(employee1);
    }

    @Override
    public Employee Update(Employee employee) {
        return null;
    }

    @Override
    public String Delete(Employee employee) {
        return "";
    }
}
