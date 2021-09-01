package com.radiomed.demoDB.controller;


import com.radiomed.demoDB.JwtFilter.LoginData;
import com.radiomed.demoDB.JwtFilter.Token;
import com.radiomed.demoDB.usuarios.Usuarios;
import com.radiomed.demoDB.usuarios.UsuariosRepository;
import com.radiomed.demoDB.usuarios.UsuariosService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

@RestController
public class AuthController {

    public final UsuariosRepository usuariosRepository;

    private final UsuariosService usuariosService;

    public AuthController(UsuariosRepository usuariosRepository, UsuariosService usuariosService) {
        this.usuariosRepository = usuariosRepository;
        this.usuariosService = usuariosService;
    }//constructor

    @PostMapping("/login")
    public Token login(@RequestBody LoginData data) throws ServletException {
        Optional<Usuarios> validateEmail = usuariosRepository.findUserByEmail(data.getEmail());

        if(validateEmail.isPresent() ){
            System.out.println(validateEmail);
        }
        throw new IllegalStateException("Invalid login. Please check your credentials.");
//        Optional<LoginData> validatePassword = usuariosRepository.findUserByE(data.getEmail());

        //        if () &&

//                (data.getPassword().equals("RadioMed_03"))) {
//
//            return new Token(generateToken(data.getUsername()));
//        }//if



    }//login

    private String generateToken( String email)  {
        Calendar calendar = Calendar.getInstance();
        calendar.add( Calendar.MINUTE, 50 );
        String secret = "this-secret-is-not-very-secret-99";

        return Jwts.builder().setSubject( email ).claim( "role", "user" ).setIssuedAt( new Date() ).setExpiration(
                calendar.getTime() ).signWith( SignatureAlgorithm.HS256, secret ).compact();
    }//generateToken


}//class