package com.radiomed.RadioMed.cotizacion;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class DetalleCotizacionService {

    public static final ArrayList<DetalleCotizacion> lista = new ArrayList<>();

    public DetalleCotizacionService() {
        lista.add(new DetalleCotizacion("2021-08-23 12:37:07", "Fabiola", "Sanchez", "americasanchezleon@gmail.com", "Mi casa", "5624821045", "SALA941009000", "Generation", 4));
    }//constructor

    public List<DetalleCotizacion> getDetalleCotizaciones() {
        return lista;
    }//getDetalleCotizaciones

    public DetalleCotizacion getDetalleCotizacion(Long detalleCotizacionId){
        return lista.get(detalleCotizacionId.intValue()-1);
    }//getCotizacion

    public void deleteDetalleCotizacion(Long detalleCotizacionId){
        if(detalleCotizacionId<=lista.size()){
            lista.remove(detalleCotizacionId.intValue()-1);
        }//if
    }//deleteDetalleCotizacion

    public void addDetalleCotizacion(DetalleCotizacion detalleCotizacion) {
        lista.add(detalleCotizacion);
    }//addDetalleCotizacion

    public static void updateDetalleCotizacion(Long detalleCotizacionId, int idServicio) {
        if (detalleCotizacionId <= lista.size()){
            DetalleCotizacion tmpDetalleCotizacion = lista.get(detalleCotizacionId.intValue()-1);
            tmpDetalleCotizacion.setIdServicio(idServicio);

        }//if
    }//updateDetalleCotizacion

}//DetalleCotizacionService
