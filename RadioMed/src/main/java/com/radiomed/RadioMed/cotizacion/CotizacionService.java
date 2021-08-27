package com.radiomed.RadioMed.cotizacion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CotizacionService {

    public final ArrayList<Cotizacion> lista = new ArrayList<>();

    public CotizacionService() {
        lista.add(new Cotizacion("2021-08-23 12:37:07", "Fabiola", "Sanchez", "americasanchezleon@gmail.com", "Mi casa", "5624821045", "SALA941009000", "Generation"));
    }//constructor

    public List<Cotizacion> getCotizaciones() {
        return lista;
    }//getCotizaciones

    public Cotizacion getCotizacion(Long cotizacionId){
        return lista.get(cotizacionId.intValue()-1);
    }//getCotizacion

    public void deleteCotizacion(Long cotizacionId){
        if(cotizacionId<=lista.size()){
            lista.remove(cotizacionId.intValue()-1);
        }//if
    }//deleteCotizacion

    public void addCotizacion(Cotizacion cotizacion) {
        lista.add(cotizacion);
    }//addOrden

    public void updateCotizacion(Long cotizacionId, String fecha, String name, String lastName, String direccion,
                                 String email, String telefono, String razonSocial, String empresa) {
        if (cotizacionId <= lista.size()){
            Cotizacion tmpCotizacion = lista.get(cotizacionId.intValue()-1);
            if(fecha != null) tmpCotizacion.setFecha(fecha);
            if(name != null) tmpCotizacion.setName(name);
            if(lastName != null) tmpCotizacion.setLastName(lastName);
            if(direccion != null) tmpCotizacion.setFecha(direccion);
            if(email != null) tmpCotizacion.setEmail(email);
            if(telefono != null) tmpCotizacion.setTelefono(telefono);
            if(razonSocial != null) tmpCotizacion.setRazonSocial(razonSocial);
            if(empresa != null) tmpCotizacion.setEmpresa(empresa);
        }//if
    }//updateOrden

}//CotizacionService
