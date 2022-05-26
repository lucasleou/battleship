package co.edu.umanizales.battleship.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Coordenate {
    private int x;
    private int y;
    private boolean estate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordenate that = (Coordenate) o;
        return x == that.x && y == that.y;
    }
}