package com.radiomed.RadioMed.cotizacion;

import com.radiomed.RadioMed.orden.Orden;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CotizacionService {

    public final ArrayList<Orden> lista = new ArrayList<>();

    public CotizacionService() {
        lista.add(new Cotizacion("2021-08-23 12:37:07", "Fabiola", "Sanchez", "americasanchezleon@gmail.com", "Mi casa", "5624821045", "SALA941009000", "Generation");
    }//constructor

    public List<Orden> getCotizacion() {
        return lista;
    }//getCotizacion

    public void deleteCotizacion(Long cotizacionId) {
        if (cotizacionId <= lista.size()) {
            lista.remove(cotizacionId.intValue() - 1);
        }//if
    }//deleteOrden

    public void addCotizacion(Cotizacion cotizacion) {
        lista.add(cotizacion);
    }//addOrden

        }//if
    }//updateOrden

}}//CotizacionService
