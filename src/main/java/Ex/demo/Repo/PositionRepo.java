package Ex.demo.Repo;

import Ex.demo.Model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PositionRepo extends JpaRepository<Position, Integer> {
}
