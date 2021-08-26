package com.radiomed.RadioMed.cotizacion;


import com.radiomed.RadioMed.orden.Orden;
import com.radiomed.RadioMed.orden.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/cotizacion")
public class CotizacionController {
    private final CotizacionService cotizacionService;

    @Autowired
    public CotizacionController(CotizacionService cotizacionService){
        this.cotizacionService = cotizacionService;
    }//constructor

    @GetMapping
    public List<Cotizacion> getCotizaciones(){
        return cotizacionService.getCotizaciones();
    }//getCotizaciones

    @GetMapping(path = "{cotizacionId}")
    public Cotizacion getCotizacion(@PathVariable("cotizacionId") Long cotizacionId){
        return cotizacionService.getCotizacion(cotizacionId);
    }//getCotizacion


}//class CotizacionController



