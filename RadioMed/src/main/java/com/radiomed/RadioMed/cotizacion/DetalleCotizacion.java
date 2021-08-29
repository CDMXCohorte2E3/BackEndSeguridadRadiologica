package com.radiomed.RadioMed.cotizacion;

public class DetalleCotizacion extends Cotizacion{
    private int idServicio;


    public DetalleCotizacion(String fecha, String name, String lastName, String direccion, String email, String telefono, String razonSocial, String empresa, int idServicio) {
        super(fecha, name, lastName, direccion, email, telefono, razonSocial, empresa);
        this.idServicio = idServicio;
    }//constructor

    public int getIdServicio() {
        return idServicio;
    }//getIdServicio

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }//setIdServicio

    @Override
    public String toString() {
        return "DetalleCotizacion{" +
                "idServicio=" + idServicio +
                '}';
    }//toString
}//class DetalleCotizacion
