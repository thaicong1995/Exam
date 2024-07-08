package Ex.demo.Service;

import Ex.demo.Model.Position;

import java.util.List;

public interface PositionService {
    public Position finById(int id);
    public List<Position> findAll();
    public Position Insert(Position position);
    public Position Update(Position position);
    public String Delete(Position position);

}
