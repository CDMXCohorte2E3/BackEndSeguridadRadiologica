package com.radiomed.RadioMed.Usuarios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path="api/usuarios")
public class UsuariosController {
    private final UsuariosService usuariosService;

    @Autowired
    public UsuariosController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }//constructor

    @GetMapping
    public List<Usuarios> getUsuarios(){
        return usuariosService.getUsuarios();
    }//getEmployees

    //api/usuarios/1
    @GetMapping(path="{usuarioId}")
    public Usuarios getUsuario(@PathVariable("usuarioId")
                                        Long usuarioId){
        return usuariosService.getUsuario(usuarioId);
    }//getEmployee

    //api/employee/1
    @DeleteMapping(path="{usuarioId}")
    public void deleteUsuario(@PathVariable("usuarioId")
                                       Long usuarioId){
        usuariosService.deleteUsuario(usuarioId);
    }//deleteEmployee

    @PostMapping
    public void addUsuario(@RequestBody Usuarios usuarios){
        usuariosService.addUsuario(usuarios);
    }//addUsuario

    @PutMapping(path="{usuarioId}")
    public void updateUsuario(@PathVariable("usuarioId") Long usuarioId,
                              @RequestParam(required=false)String name,
                              @RequestParam (required=false)String lastName ,
                              @RequestParam (required=false)String phone){
        usuariosService.updateUsuario(usuarioId,name,lastName,phone);
    }//updateUsuarios

}//usuariosController
