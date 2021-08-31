package com.radiomed.demoDB.JwtFilter;

public class LoginData {
    private final String username;
    private final String password;

    public LoginData(String username, String password) {
        this.username = username;
        this.password = password;
    }//constructor

    public String getUsername() {
        return username;
    }//getUsername

    public String getPassword() {
        return password;
    }//getPassword
}//class loginData
