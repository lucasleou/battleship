package co.edu.umanizales.battleship.model;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Coordenate
{
    public class Coordinate {
        private int x;
        private int y;
        private boolean state;
    }
}
