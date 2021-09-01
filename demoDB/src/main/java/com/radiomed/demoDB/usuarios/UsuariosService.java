package com.radiomed.demoDB.usuarios;

import com.radiomed.demoDB.JwtFilter.LoginData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService {
    public final UsuariosRepository usuariosRepository;

    @Autowired
    public UsuariosService(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }//constructor

    public List<Usuarios> getUsuarios(){
        return usuariosRepository.findAll();
    }//getUsuarios

    public Usuarios getUsuario(Long usuarioId){
        return usuariosRepository.findById(usuarioId).orElseThrow(
                () -> new IllegalStateException("User does not exist" + usuarioId)
        );
    }//getUsuario

    public void deleteUsuario(Long usuarioId){
        if(usuariosRepository.existsById(usuarioId)){
            usuariosRepository.deleteById(usuarioId);
        }else{
            throw new IllegalStateException("User does not exist" + usuarioId);
        }
    }//deleteUsuario

    public void addUsuario(Usuarios usuarios){
        Optional<Usuarios> userByEmail = usuariosRepository.findUserByEmail(usuarios.getEmail());
        if(userByEmail.isPresent()){
            throw new IllegalStateException("Email already registered");
        }//if
        usuariosRepository.save(usuarios);
    }//addUsuarios

    public List validateUsuario(LoginData usuarios) {
        Optional<Usuarios> validateEmail = usuariosRepository.findUserByEmail(usuarios.getEmail());
        if(validateEmail.isPresent() ){
            System.out.println(validateEmail);
            String password = usuarios.getPassword();
            System.out.println(password);
           return validateEmail.get();
        }else{
            throw new IllegalStateException("Invalid login. Please check your credentials.");
        }//else

    }//validateUsuario

    public void updateUsuario(Long userId, String oldPassword, String newPassword) {
        if (! usuariosRepository.existsById(userId)) {
            throw new IllegalStateException("User does not exist " + userId);
        }//if ! exists
        Usuarios usuario = usuariosRepository.getById(userId);
        if (! usuario.getPassword().equals(oldPassword)) {
            throw new IllegalStateException("Password does not match " + userId);
        }//if ! exists
        if (newPassword!=null && newPassword.length()>=4 &&
                (! usuario.getPassword().equals(newPassword)) &&
                (usuario.getPassword().equals(oldPassword)) ) {
            usuario.setPassword(newPassword);

            usuariosRepository.save(usuario);
        }//if
    }// updateUsuario

}//UsuariosService
