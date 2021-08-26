package com.radiomed.RadioMed.orden;

public class Orden {
    private long idUsuario;
    private long cantidad;
    private long idProducto;
    private String fecha;

    public Orden(long idUsuario, long cantidad, long idProducto, String fecha) {
        this.idUsuario = idUsuario;
        this.cantidad = cantidad;
        this.idProducto = idProducto;
        this.fecha = fecha;
    }//constructor

    public long getIdUsuario() {
        return idUsuario;
    }//getIdUsuario

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }//setIdUsuario

    public long getCantidad() {
        return cantidad;
    }//getCantidad

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }//setCantidad

    public long getIdProducto() {
        return idProducto;
    }//getIdProducto

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }//setIdProducto

    public String getFecha() {
        return fecha;
    }//getFecha

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }//setFecha

    @Override
    public String toString() {
        return "Orden{" +
                "idUsuario=" + idUsuario +
                ", cantidad=" + cantidad +
                ", idProducto=" + idProducto +
                ", fecha='" + fecha + '\'' +
                '}';
    }//toString
}//Orden
