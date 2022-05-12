package co.edu.umanizales.battleship.controller;

import co.edu.umanizales.battleship.model.NodeDE;
import co.edu.umanizales.battleship.model.ShipDistribution;
import co.edu.umanizales.battleship.model.Ship;
import co.edu.umanizales.battleship.service.ListDEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "listde")
public class ListDEController {
    @Autowired
    private ListDEService listDEService;

    @PostMapping
    public String add(@RequestBody Ship ship)
    {
        return listDEService.add(new ShipDistribution(ship));
    }

    @PostMapping(path = "/tostart")
    public String addToStart(@RequestBody Ship ship)
    {
        return listDEService.addToStart(new ShipDistribution(ship));
    }

    @GetMapping
    public List<ShipDistribution> listAll()
    {
        return listDEService.listNodes();
    }
}