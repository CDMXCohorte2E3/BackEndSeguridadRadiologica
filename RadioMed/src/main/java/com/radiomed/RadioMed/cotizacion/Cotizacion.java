package com.radiomed.RadioMed.cotizacion;

public class Cotizacion {
    private String fecha;
    private String name;
    private String lastName;
    private String direccion;
    private String email;
    private String telefono;
    private String razonSocial;
    private String empresa;

    public Cotizacion(String fecha, String name, String lastName, String direccion, String email, String telefono, String razonSocial, String empresa) {
        this.fecha = fecha;
        this.name = name;
        this.lastName = lastName;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.razonSocial = razonSocial;
        this.empresa = empresa;
    }//constructor

    public String getFecha() {
        return fecha;
    }//getFecha

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }//setFecha

    public String getName() {
        return name;
    }//getName

    public void setName(String name) {
        this.name = name;
    }//setName

    public String getLastName() {
        return lastName;
    }//getLastName

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }//setLastName

    public String getDireccion() {
        return direccion;
    }//getDireccion

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }//setDireccion

    public String getEmail() {
        return email;
    }//getEmail

    public void setEmail(String email) {
        this.email = email;
    }//setEmail

    public String getTelefono() {
        return telefono;
    }//getTelefono

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }//setTelefono

    public String getRazonSocial() {
        return razonSocial;
    }//getRazonSocial

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }//setRazonSocial

    public String getEmpresa() {
        return empresa;
    }//getEmpresa

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }//setEmpresa


    @Override
    public String toString() {
        return "Cotizacion{" +
                "fecha='" + fecha + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", empresa='" + empresa + '\'' +
                '}';
    }//toString

    /*
    public class DetalleCotizacion {
        public Long  detalleCotizacionId;
        public Long cotizacionId;
        public Long idServicio;
  }//DetalleCotizacion
     */





}//class Cotizacion
