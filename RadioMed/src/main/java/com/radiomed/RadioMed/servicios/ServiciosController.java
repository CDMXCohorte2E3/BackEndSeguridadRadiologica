package com.radiomed.RadioMed.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/servicios")
public class ServiciosController {

    private final ServiciosServices objServiciosSrv;

    @Autowired
    public ServiciosController(ServiciosServices arg_srvSrv){
        this.objServiciosSrv = arg_srvSrv;
    }

    @GetMapping
    public List<Servicios> getServicios(){
        return objServiciosSrv.getServicios() ;
    }

    @GetMapping(path="{servicioID}")
    public Servicios getServicio(@PathVariable("servicioID")
                                 Long arg_servicioID){
        return objServiciosSrv.getServicio(arg_servicioID);
    }

    @DeleteMapping(path="{servicioID}")
    public void deleteServicio(@PathVariable("servicioID")
                               Long arg_servicioID){
        objServiciosSrv.deleteServicio(arg_servicioID);
    }

    @PostMapping
    public void addServicio(@RequestBody Servicios arg_servicio){
        objServiciosSrv.addServicio(arg_servicio);
    }

    @PutMapping(path="{servicioID}")
    public void updateServicio(@PathVariable("servicioID") Long arg_srvID,
                               @RequestParam(required = false)String titulo,
                               @RequestParam(required = false)String parrafo1,
                               @RequestParam(required = false)String parrafo2,
                               @RequestParam(required = false)String parrafo3,
                               @RequestParam(required = false)String parrafoBlack){
        objServiciosSrv.updateServicio(arg_srvID,titulo,parrafo1,parrafo2,parrafo3,parrafoBlack);
    }

}
