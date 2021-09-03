package com.radiomed.demoDB.JwtFilter;

public class LoginData {
    private final String email;
    private final String password;

    public LoginData(String email, String password) {
        this.email = email;
        this.password = password;
    }//constructor

    public String getEmail() {
        return email;
    }//getUsername

    public String getPassword() {
        return password;
    }//getPassword
}//class loginData
