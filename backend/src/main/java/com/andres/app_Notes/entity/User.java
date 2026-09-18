package com.andres.app_Notes.entity;
import jakarta.persistence.*;


@Entity
@Table(name="user")
public class User {

    public User(String name, String email , String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_name" , length = 255 , nullable = false , updatable = false)
    private String name;

    @Column(name = "user_email", length = 255, nullable = false , updatable = false)
    private String email;

    @Column(name = "user_password", length = 8, nullable = false, updatable = true)
    private String password;


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
