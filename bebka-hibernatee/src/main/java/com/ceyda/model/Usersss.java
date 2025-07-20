package com.ceyda.model;


import jakarta.persistence.*;

@Entity
@Table(name="Usersss")
public class Usersss {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    public String name;
    public String email;

    public Usersss(){

    }

    public Usersss(String name, String email){
        this.name=name;
        this.email=email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
}
