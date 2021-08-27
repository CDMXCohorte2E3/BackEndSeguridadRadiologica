package com.radiomed.demoDB.admin;

import javax.persistence.*;

@Entity
@Table(name="admin")
public class admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name="idadministrador", unique = true, nullable = false)
    private Long id;
    @Column(name="Nombre", nullable = false)
    private String username;
    @Column(name="Apellidos", nullable = false)
    private String lastname;
    @Column(name="Email", nullable = false)
    private String email;
    @Column(name="Contrasena", nullable = false)
    private String password;

    public admin(Long id, String username, String lastname, String email, String password) {
        this.id = id;
        this.username = username;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }//constructor

    public Long getId() {
        return id;
    }//getId

    public void setId(Long id) {
        this.id = id;
    }//setId

    public String getUsername() {
        return username;
    }//getUsername

    public void setUsername(String username) {
        this.username = username;
    }//setUsername

    public String getLastname() {
        return lastname;
    }//getLastname

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }//setLastname

    public String getEmail() {
        return email;
    }//getEmail

    public void setEmail(String email) {
        this.email = email;
    }//setEmail

    public String getPassword() {
        return password;
    }//getPassword

    public void setPassword(String password) {
        this.password = password;
    }//setPassword

    public admin (){}//default constructor

}//class user
