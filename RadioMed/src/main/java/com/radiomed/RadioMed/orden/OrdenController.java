package com.radiomed.RadioMed.orden;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/orden")
public class OrdenController {
    private final OrdenService ordenService;

    @Autowired
    public OrdenController(OrdenService ordenService){
        this.ordenService = ordenService;
    }//constructor

    @GetMapping
    public List<Orden> getOrdenes(){
        return ordenService.getOrdenes();
    }//getOrdenes

    @GetMapping(path = "{ordenId}")
    public Orden getOrden(@PathVariable("ordenId") Long ordenId){
        return ordenService.getOrden(ordenId);
    }//getOrden

    @DeleteMapping(path= "{ordenId}")
    public void deleteOrden(@PathVariable("ordenId") Long ordenId){
        ordenService.deleteOrden(ordenId);
    }//deleteOrden

    @PostMapping
    public void addOrden(@RequestBody Orden orden){
        ordenService.addOrden(orden);
    }//addOrden

    @PutMapping("{ordenId}")
    public void updateOrden(@PathVariable("ordenId") Long ordenId, @RequestParam(required = false) long idUsuario, @RequestParam(required = false) long cantidad, @RequestParam(required = false) long idProducto, @RequestParam(required = false) String fecha){
        ordenService.updateOrden(ordenId, idUsuario, cantidad, idProducto, fecha);

    }//updateOrden

}//OrdenController
