package co.edu.umanizales.battleship.controller;

import co.edu.umanizales.battleship.model.NodeDE;
import co.edu.umanizales.battleship.model.Ship;
import co.edu.umanizales.battleship.model.ShipDistribution;
import co.edu.umanizales.battleship.service.ListDEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/listde")
public class ListDEController
{
    @Autowired
    private ListDEService listDeService;

    @GetMapping
    public List<ShipDistribution> getAllLinked()
    {
        return listDeService.getAllLinked();
    }

    @PostMapping
    public String createShip(@RequestBody Ship ship)
    {
        return listDeService.add(new ShipDistribution(ship));
    }

    @PostMapping(path="/tostart")
    public String createShipToStart(@RequestBody Ship ship){
        return listDeService.addToFirst(new ShipDistribution(ship));
    }

}
