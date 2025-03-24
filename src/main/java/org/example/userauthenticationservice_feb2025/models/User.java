package org.example.userauthenticationservice_feb2025.models;

public class User extends BaseModel{
    Long id;
    String username;
    String password;

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
