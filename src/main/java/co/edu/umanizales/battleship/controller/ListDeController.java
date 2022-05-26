package co.edu.umanizales.battleship.controller;

import co.edu.umanizales.battleship.model.GenericResponse;
import co.edu.umanizales.battleship.model.Ship;
import co.edu.umanizales.battleship.model.ShipDistribution;
import co.edu.umanizales.battleship.service.ListDeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "listde")
public class ListDeController {
    @Autowired
    private ListDeService listDeService;

    @PostMapping
    public ResponseEntity<GenericResponse> add(@RequestBody Ship ship)
    {
        return new ResponseEntity<>
                (new GenericResponse(200, listDeService.add(new ShipDistribution(ship)),null),HttpStatus.OK);
    }

    @PostMapping("/tostart")
    public ResponseEntity<GenericResponse> addToStart(@RequestBody Ship ship)
    {
        return new ResponseEntity<>
                (new GenericResponse(200, listDeService.addToStart(new ShipDistribution(ship)),null),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<GenericResponse> listAll()
    {
        return new ResponseEntity<>
                (new GenericResponse(200, listDeService.listNodes(),null),HttpStatus.OK);
    }
}