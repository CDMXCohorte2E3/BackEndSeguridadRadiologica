package com.radiomed.RadioMed.servicios;

public class Servicios {

    private String titulo;
    private String parrafo1;
    private String parrafo2;
    private String parrafo3;
    private String parrafoBlack;

    public Servicios(String titulo, String parrafo1, String parrafo2, String parrafo3, String parrafoBlack) {
        this.titulo = titulo;
        this.parrafo1 = parrafo1;
        this.parrafo2 = parrafo2;
        this.parrafo3 = parrafo3;
        this.parrafoBlack = parrafoBlack;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getParrafo1() {
        return parrafo1;
    }

    public void setParrafo1(String parrafo1) {
        this.parrafo1 = parrafo1;
    }

    public String getParrafo2() {
        return parrafo2;
    }

    public void setParrafo2(String parrafo2) {
        this.parrafo2 = parrafo2;
    }

    public String getParrafo3() {
        return parrafo3;
    }

    public void setParrafo3(String parrafo3) {
        this.parrafo3 = parrafo3;
    }

    public String getParrafoBlack() {
        return parrafoBlack;
    }

    public void setParrafoBlack(String parrafoBlack) {
        this.parrafoBlack = parrafoBlack;
    }

    @Override
    public String toString() {
        return "Servicios{" +
                "titulo='" + titulo + '\'' +
                ", parrafo1='" + parrafo1 + '\'' +
                ", parrafo2='" + parrafo2 + '\'' +
                ", parrafo3='" + parrafo3 + '\'' +
                ", parrafoBlack='" + parrafoBlack + '\'' +
                '}';
    }
}
