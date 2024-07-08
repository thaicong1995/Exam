package Ex.demo.Controller;

import Ex.demo.Model.Department;
import Ex.demo.Model.Position;
import Ex.demo.Repo.PositionRepo;
import Ex.demo.Service.DepartmentService;
import Ex.demo.Service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/position")
public class PositionController {
    @Autowired
    private PositionService positionService;
    @PostMapping
    public ResponseEntity<Position> DoCreate(@RequestBody Position position) {
        Position p = positionService.Insert(position);
        return ResponseEntity.ok(p);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Position> FinbyId(@PathVariable int id) {
        Position p = positionService.finById(id);
        if (p != null) {
            return ResponseEntity.ok(p);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Position>> FindAll() {
        List<Position> p = positionService.findAll();
        return ResponseEntity.ok(p);
    }

    // Update a Department
    @PutMapping("/{id}")
    public ResponseEntity<Position> DoUpdate(@PathVariable int id, @RequestBody Position position) {
        position.setId(id);
        Position p = positionService.Update(position);
        if (p != null) {
            return ResponseEntity.ok(p);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> DoDelete(@PathVariable int id) {
        Position p = positionService.finById(id);
        if (p != null) {
            positionService.Delete(p);
            return ResponseEntity.ok("Deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
