package com.radiomed.RadioMed.cotizacion;


import com.radiomed.RadioMed.orden.Orden;
import com.radiomed.RadioMed.orden.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping(path= "{cotizacionId}")
    public void deleteCotizacion(@PathVariable("cotizacionId") Long cotizacionId){
        cotizacionService.deleteCotizacion(cotizacionId);
    }//deleteCotizacion

    @PostMapping
    public void addCotizacion(@RequestBody Cotizacion cotizacion){
        cotizacionService.addCotizacion(cotizacion);
    }//addCotizacion


    @PutMapping("{cotizacionId}")
    public void updateCotizacion(@PathVariable("cotizacionId") Long cotizacionId,
                            @RequestParam(required = false) String fecha,
                            @RequestParam(required = false) String name,
                            @RequestParam(required = false) String lastName,
                            @RequestParam(required = false) String direccion,
                            @RequestParam(required = false) String email,
                            @RequestParam(required = false) String telefono,
                            @RequestParam(required = false) String razonSocial,
                            @RequestParam(required = false) String empresa){

        cotizacionService.updateCotizacion(cotizacionId, fecha, name, lastName, direccion, email, telefono, razonSocial, empresa );
    }//updateCotizacion


}//class CotizacionController



