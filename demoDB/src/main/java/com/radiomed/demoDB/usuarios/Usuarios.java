package com.radiomed.demoDB.usuarios;


import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name="idusuario", unique = true, nullable = false)
    private Long id;
    @Column(name="Nombre", nullable = false)
    private String name;
    @Column(name="Apellidos", nullable = false)
    private String lastName;
    @Column(name="Email", nullable = false)
    private String email;
    @Column(name = "Telefono", nullable = false)
    private String phone;
    @Column(name="Contrasena", nullable = false)
    private String password;

    public Usuarios(){}//default

    public Usuarios(Long id, String name, String lastName, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }//constructor

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Usuarios{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }//toString
}//class Usuarios
