package Ex.demo.Service.Imp;

import Ex.demo.Model.Department;
import Ex.demo.Model.Position;
import Ex.demo.Repo.DepartmentRepo;
import Ex.demo.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentImpl implements DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;


    @Override
    public Department finById(int id) {
        Optional<Department> department = departmentRepo.findById(id);
        return department.orElse(null);
    }

    @Override
    public List<Department> findAll() {
        return departmentRepo.findAll();
    }

    @Override
    public Department Insert(Department department) {
        return departmentRepo.save(department);
    }


    @Override
    public Department Update(Department department) {
        if (departmentRepo.existsById(department.getId())) {
            return departmentRepo.save(department);
        }
        return null;
    }

    @Override
    public String Delete(Department department) {
        if (departmentRepo.existsById(department.getId())) {
            departmentRepo.deleteById(department.getId());
            return "Deleted successfully";
        }
        return "Department not found";
    }


}
