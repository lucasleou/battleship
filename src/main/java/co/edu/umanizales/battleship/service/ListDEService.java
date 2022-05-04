package co.edu.umanizales.battleship.service;

import co.edu.umanizales.battleship.model.ListDE;
import co.edu.umanizales.battleship.model.NodeDE;
import co.edu.umanizales.battleship.model.ShipDistribution;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ListDEService
{
    private ListDE list = new ListDE();

    public List<ShipDistribution> getAllLinked() {
        return this.list.list();
    }

    public String add(ShipDistribution shipDistribution) {
        this.list.add(shipDistribution);
        return "Adicionado con éxito";
    }

    public String addToFirst(ShipDistribution shipDistribution) {
        this.list.addToFirst(shipDistribution);
        return "Adicionado con éxito";
    }
}