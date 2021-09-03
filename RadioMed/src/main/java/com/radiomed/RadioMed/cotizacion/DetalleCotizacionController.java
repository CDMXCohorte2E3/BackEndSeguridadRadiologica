package com.radiomed.RadioMed.cotizacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/detalleCotizacion")

public class DetalleCotizacionController {
    private final DetalleCotizacionService detalleCotizacionService;

    @Autowired
    public DetalleCotizacionController(DetalleCotizacionService detalleCotizacionService){
        this.detalleCotizacionService = detalleCotizacionService;
    }//constructor


    @GetMapping
    public List<DetalleCotizacion> getDetalleCotizaciones(){
        return detalleCotizacionService.getDetalleCotizaciones();
    }//getDetalleCotizaciones

    @GetMapping(path = "{detalleCotizacionId}")
    public Cotizacion getDetalleCotizacion(@PathVariable("detalleCotizacionId") Long detalleCotizacionId){
        return detalleCotizacionService.getDetalleCotizacion(detalleCotizacionId);
    }//getCotizacion

    @DeleteMapping(path= "{detalleCotizacionId}")
    public void deleteDetalleCotizacion(@PathVariable("detalleCotizacionId") Long detalleCotizacionId){
        detalleCotizacionService.deleteDetalleCotizacion(detalleCotizacionId);
    }//deleteCotizacion

    @PostMapping
    public void addDetalleCotizacion(@RequestBody DetalleCotizacion detalleCotizacion){
        detalleCotizacionService.addDetalleCotizacion(detalleCotizacion);
    }//addCotizacion


    @PutMapping("{detalleCotizacionId}")
    public void updateDetalleCotizacion(@PathVariable("detalleCotizacionId") Long detalleCotizacionId,
                                 @RequestParam(required = false) int idServicio) {

       DetalleCotizacionService.updateDetalleCotizacion(detalleCotizacionId, idServicio);
    }//updateDetalleCotizacion

}//DetalleCotizacionController
