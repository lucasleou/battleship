package co.edu.umanizales.battleship.controller;

import co.edu.umanizales.battleship.model.GenericResponse;
import co.edu.umanizales.battleship.model.PlayerDTO;
import co.edu.umanizales.battleship.model.UserDTO;
import co.edu.umanizales.battleship.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<GenericResponse> getUsers()
    {
        return new ResponseEntity<GenericResponse>(
                new GenericResponse(200,userService.listUsers(),null),HttpStatus.OK
        );
    }

    @PostMapping
    public ResponseEntity<GenericResponse> createPlayer(@RequestBody @Valid PlayerDTO player)
    {
        return new ResponseEntity<GenericResponse>(
                new GenericResponse(200,userService.createPlayer(player.getPlayer(), player.getNumPlayer()),
                        null),
                HttpStatus.OK
        );
    }
}