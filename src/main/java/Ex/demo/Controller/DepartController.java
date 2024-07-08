package Ex.demo.Controller;

import Ex.demo.Model.Department;
import Ex.demo.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping
    public ResponseEntity<Department> DoCreate(@RequestBody Department department) {
        Department savedDepartment = departmentService.Insert(department);
        return ResponseEntity.ok(savedDepartment);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Department> FinbyId(@PathVariable int id) {
        Department department = departmentService.finById(id);
        if (department != null) {
            return ResponseEntity.ok(department);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Department>> FindAll() {
        List<Department> departments = departmentService.findAll();
        return ResponseEntity.ok(departments);
    }

    // Update a Department
    @PutMapping("/{id}")
    public ResponseEntity<Department> DoUpdate(@PathVariable int id, @RequestBody Department departmentDetails) {
        departmentDetails.setId(id);
        Department updatedDepartment = departmentService.Update(departmentDetails);
        if (updatedDepartment != null) {
            return ResponseEntity.ok(updatedDepartment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> DoDelete(@PathVariable int id) {
        Department department = departmentService.finById(id);
        if (department != null) {
            departmentService.Delete(department);
            return ResponseEntity.ok("Deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
