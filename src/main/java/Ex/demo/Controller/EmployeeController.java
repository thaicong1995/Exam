package Ex.demo.Controller;

import Ex.demo.Model.Department;
import Ex.demo.Model.Employee;
import Ex.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/position")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> DoCreate(@RequestBody Employee employee) {
        Employee e = employeeService.Insert(employee);
        return ResponseEntity.ok(e);
    }


}
