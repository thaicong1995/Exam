package Ex.demo.Service.Imp;

import Ex.demo.Model.Employee;
import Ex.demo.Model.Position;
import Ex.demo.Repo.EmployeeRepo;
import Ex.demo.Repo.PositionRepo;
import Ex.demo.Service.EmployeeService;
import Ex.demo.Service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeImpl implements EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public Employee finById(int id) {
        return null;
    }

    @Override
    public List<Employee> findAll() {
        return List.of();
    }

    @Override
    public Employee Insert(Employee employee) {
        return employeeRepo.save(employee);
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
