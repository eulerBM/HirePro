package com.ex.back_end.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Table
@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPrivate;

    @Column(nullable = false)
    private UUID idPublic;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 250)
    private String email;

    @Column(nullable = false, length = 250)
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    @PrePersist
    public void generateIdPublic(){

        if (idPublic == null){
            idPublic = UUID.randomUUID();
        }
    }

    public long getIdPrivate() {
        return idPrivate;
    }

    public UUID getIdPublic() {
        return idPublic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
