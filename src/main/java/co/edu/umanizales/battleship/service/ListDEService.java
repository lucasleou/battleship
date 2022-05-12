package co.edu.umanizales.battleship.service;

import co.edu.umanizales.battleship.model.ListDE;
import co.edu.umanizales.battleship.model.ShipDistribution;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListDEService {
    private ListDE listDE;

    public ListDEService() {
        listDE = new ListDE();
    }

    public String add(ShipDistribution shipDistribution){
        listDE.add(shipDistribution);
        return "Adicionado exitosamente";
    }

    public String addToStart(ShipDistribution shipDistribution){
        listDE.addToStart(shipDistribution);
        return "Adicionado exitosamente";
    }

    public List<ShipDistribution> listNodes(){
        return listDE.listNodes();
    }
}