package Ex.demo.Controller;

import Ex.demo.Dto.EmployeeDto;
import Ex.demo.Model.Department;
import Ex.demo.Model.Employee;
import Ex.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> DoCreate(@RequestBody EmployeeDto employee, @RequestParam int de, @RequestParam int en ) {
        Employee e = employeeService.Insert(employee, de, en);
        return ResponseEntity.ok(e);
    }

    @GetMapping("/all")
    public ResponseEntity<Page<Employee>> getAllEmployees(@RequestParam(defaultValue = "0") int page,
                                                          @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Employee> employees = employeeService.findAll(pageable);
        return ResponseEntity.ok(employees);
    }

}
