package Ex.demo.Service.Imp;

import Ex.demo.Model.Department;
import Ex.demo.Model.Position;
import Ex.demo.Repo.PositionRepo;
import Ex.demo.Service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PositionImpl implements PositionService {
    @Autowired
    PositionRepo positionRepo;
    @Override
    public Position finById(int id) {
        Optional<Position> position = positionRepo.findById(id);
        return position.orElse(null);
    }

    @Override
    public List<Position> findAll() {
        return positionRepo.findAll();
    }

    @Override
    public Position Insert(Position position) {
        return positionRepo.save(position);
    }

    @Override
    public Position Update(Position position) {
        if (positionRepo.existsById(position.getId())) {
            return positionRepo.save(position);
        }
        return null;
    }

    @Override
    public String Delete(Position position) {
        if (positionRepo.existsById(position.getId())) {
            positionRepo.deleteById(position.getId());
            return "Deleted successfully";
        }
        return "Department not found";
    }
}
