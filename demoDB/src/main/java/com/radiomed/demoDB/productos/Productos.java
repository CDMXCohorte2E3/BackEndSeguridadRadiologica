package com.radiomed.demoDB.productos;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Productos { //Plain Old Java Object "POJO"
    @Basic(optional = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproducto", unique =true, nullable = false)
    private long id;
    @Column(name = "nombre", nullable = false)
    private String title;
    @Column(name = "marca", nullable = false)
    private String brand;
    @Column (name = "modelo", nullable = false)
    private String model;
    @Column (name = "precio", nullable = false)
    private String price;
    @Column (name = "descripcion", nullable = false)
    private String description;
    @Column (name = "status", nullable = false)
    private boolean status;
    @Column (name = "imagen", nullable = false)
    private String image;

    public Productos(long id, String title, String brand, String model, String price, String description, boolean status, String image) {
        this.id = id;
        this.title = title;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.description = description;
        this.status = status;
        this.image = image;
    }//constructor

    //Necesario
    public Productos(){}//default constructor

    public long getId() {
        return id;
    }//getId

    public void setId(long id) {
        this.id = id;
    }//setId

    public String getTitle() {
        return title;
    }//getTitle

    public void setTitle(String title) {
        this.title = title;
    }//setTitle

    public String getBrand() {
        return brand;
    }//getBrand

    public void setBrand(String brand) {
        this.brand = brand;
    }//setBrand

    public String getModel() {
        return model;
    }//getModel

    public void setModel(String model) {
        this.model = model;
    }//setModel

    public String getPrice() {
        return price;
    }//getPrice

    public void setPrice(String price) {
        this.price = price;
    }//setPrice

    public String getDescription() {
        return description;
    }//getDescription

    public void setDescription(String description) {
        this.description = description;
    }//setDescrption

    public boolean isStatus() {
        return status;
    }//isStatus

    public void setStatus(boolean status) {
        this.status = status;
    }//setStatus

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", image='" + image + '\'' +
                '}';
    }
}
