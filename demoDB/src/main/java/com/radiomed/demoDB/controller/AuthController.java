package com.radiomed.demoDB.controller;


import com.radiomed.demoDB.JwtFilter.LoginData;
import com.radiomed.demoDB.JwtFilter.Token;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import java.util.Calendar;
import java.util.Date;

@RestController
public class AuthController {

    @PostMapping("/login")
    public Token login(@RequestBody LoginData data) throws ServletException {
        if ((data.getUsername().equals("Fabiola")) &&
                (data.getPassword().equals("RadioMed_03"))) {

            return new Token(generateToken(data.getUsername()));
        }//if

        throw new ServletException("Invalid login. Please check your credentials.");

    }//login

    private String generateToken( String email)  {
        Calendar calendar = Calendar.getInstance();
        calendar.add( Calendar.MINUTE, 50 );
        String secret = "this-secret-is-not-very-secret-99";

        return Jwts.builder().setSubject( email ).claim( "role", "user" ).setIssuedAt( new Date() ).setExpiration(
                calendar.getTime() ).signWith( SignatureAlgorithm.HS256, secret ).compact();
    }//generateToken


}//class