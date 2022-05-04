package co.edu.umanizales.battleship.controller;

import co.edu.umanizales.battleship.model.NodeDE;
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
    public String createPet(@RequestBody ShipDistribution shipDistribution)
    {
        return listDeService.add(shipDistribution);
    }

    @PostMapping(path="/tostart")
    public String createPetToStart(@RequestBody ShipDistribution shipDistribution){
        return listDeService.addToFirst(shipDistribution);
    }
}
