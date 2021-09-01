package com.radiomed.demoDB.usuarios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path="api/usuarios/")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})

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
    @GetMapping(path="{idusuario}")
    public Usuarios getUsuario(@PathVariable("idusuario")
                                        Long usuarioId){
        return usuariosService.getUsuario(usuarioId);
    }//getEmployee

    //api/employee/1
    @DeleteMapping(path="{idusuario}")
    public void deleteUsuario(@PathVariable("idusuario")
                                       Long usuarioId){
        usuariosService.deleteUsuario(usuarioId);
    }//deleteEmployee

    @PostMapping
    public void addUsuario(@RequestBody Usuarios usuario){
        usuariosService.addUsuario(usuario);
    }//addUsuario

    @PutMapping(path="{idusuario}")
    public void updateUsuario(@PathVariable("idusuario") Long usuarioId,
                              @RequestParam String oldPassword,
                              @RequestParam String newPassword){
        usuariosService.updateUsuario(usuarioId, oldPassword, newPassword);
    }//updateUsuarios



}//usuariosController
