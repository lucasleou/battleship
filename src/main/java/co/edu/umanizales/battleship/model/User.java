package co.edu.umanizales.battleship.model;

import lombok.Data;

@Data
public class User {
    private int id;
    private String email;
    private String password;
    private TypeUser typeUser;

    public User(String email, String password, TypeUser typeUser) {
        this.email = email;
        this.password = password;
        this.typeUser = typeUser;
    }
}