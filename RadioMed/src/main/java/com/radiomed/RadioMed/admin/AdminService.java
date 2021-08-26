package com.radiomed.RadioMed.admin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {

    public final ArrayList<Admin> lista = new ArrayList<Admin>();

    public AdminService(){
        lista.add(new Admin( "Contacto", "radiomed.contacto@gmail.com", "RadioMed_01"));
        lista.add(new Admin( "Asesores", "radiomed.asesores@gmail.com", "RadioMed_01"));

    }//constructor

    public List<Admin> getAdmins(){
        return lista;
    }//getAdmins

    public Admin getAdmin(Long adminId){
        return lista.get(adminId.intValue()-1);
    }//getAdmin

    public void deleteAdmin(Long adminId){
        if(adminId<=lista.size()){
            lista.remove(adminId.intValue()-1);
        }//if
    }//deleteAdmin

    public void addAdmin(Admin admin){
        lista.add(admin);
    }//addAdmin

    public void updateAdmin(Long adminId, String name, String email, String password) {
        if (adminId<= lista.size()) {
            Admin tmpAdmin = lista.get(adminId.intValue()-1);
            if (name != null) tmpAdmin.setName(name);
            if (email != null) tmpAdmin.setEmail(email);
            if (password != null) tmpAdmin.setPassword(password);
        }//if
    }// updateAdmin


}//AdminService
