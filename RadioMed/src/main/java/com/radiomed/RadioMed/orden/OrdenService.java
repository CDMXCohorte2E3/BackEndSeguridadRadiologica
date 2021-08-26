package com.radiomed.RadioMed.orden;

import com.radiomed.RadioMed.admin.Admin;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdenService {
    public final ArrayList<Orden> lista = new ArrayList<>();

    public OrdenService(){
        lista.add(new Orden(1, 2, 4, "25/08/2021"));
        lista.add(new Orden(4, 1, 7, "22/08/2021"));
    }//constructor

    public List<Orden> getOrdenes(){
        return lista;
    }//getOrdenes

    public Orden getOrden(Long ordenId){
        return lista.get(ordenId.intValue()-1);
    }//getOrden

    public void deleteOrden(Long ordenId){
        if(ordenId<=lista.size()){
            lista.remove(ordenId.intValue()-1);
        }//if
    }//deleteOrden

    public void addOrden(Orden orden){
        lista.add(orden);
    }//addOrden

    public void updateOrden(Long ordenId, long idUsuario, long cantidad, long idProducto, String fecha){
        if (ordenId <= lista.size()){
            Orden tmpOrden = lista.get(ordenId.intValue()-1);
            if(idUsuario != 0) tmpOrden.setIdUsuario(idUsuario);
            if(cantidad != 0) tmpOrden.setCantidad(cantidad);
            if(idProducto != 0) tmpOrden.setIdProducto(idProducto);
            if(fecha != null) tmpOrden.setFecha(fecha);

        }//if
    }//updateOrden

}//OrdenService
