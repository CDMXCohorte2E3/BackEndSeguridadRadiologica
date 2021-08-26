package com.radiomed.RadioMed.Usuarios;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuariosService {
    public final ArrayList<Usuarios> lista = new ArrayList<Usuarios>();
    public UsuariosService(){
        lista.add(new Usuarios( "Bueno", "Rivero", "5578692514","chars@gmail.com", "Equipo1."));
        lista.add(new Usuarios( "Bravo", "Gomez", "5578692514","abravo@gmail.com", "Equipo2."));

    }//constructor

    public List<Usuarios> getUsuarios(){
        return lista;
    }//getUsuarios

    public Usuarios getUsuario(Long usuarioId){
        return lista.get(usuarioId.intValue()-1);
    }//getEmployee

    public void deleteUsuario(Long usuarioId){
        if(usuarioId<=lista.size()){
            lista.remove(usuarioId.intValue()-1);
        }//if
    }//getUsuario

    public void addUsuario(Usuarios usuarios){
        lista.add(usuarios);
    }//addUsuarios

    public void updateUsuario(Long usuarioId, String name, String lastName, String phone) {
        if (usuarioId<= lista.size()) {
            Usuarios tmpUsr = lista.get(usuarioId.intValue()-1);
            if (name != null) tmpUsr.setName(name);
            if (lastName != null) tmpUsr.setLastName(lastName);
            if (phone != null) tmpUsr.setPhone(phone);
        }//if
    }// updateEmployee

}//UsuariosService
