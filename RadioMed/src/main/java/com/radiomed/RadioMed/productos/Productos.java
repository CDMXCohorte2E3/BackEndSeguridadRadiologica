package com.radiomed.RadioMed.productos;

public class Productos {
   private String title;
   private String brand;
   private String model;
   private String price;
   private String description;
   private boolean status;

   public Productos(String title, String brand, String model, String price, String description, boolean status) {
      this.title = title;
      this.brand = brand;
      this.model = model;
      this.price = price;
      this.description = description;
      this.status = status;
   }//constructor

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
   }//setDescription

   public boolean isStatus() {
      return status;
   }//isStatus

   public void setStatus(boolean status) {
      this.status = status;
   }//setStatus

   @Override
   public String toString() {
      return "Productos{" +
              "title='" + title + '\'' +
              ", brand='" + brand + '\'' +
              ", model='" + model + '\'' +
              ", price='" + price + '\'' +
              ", description='" + description + '\'' +
              ", status=" + status +
              '}';
   }//toString

}//Class Productos
