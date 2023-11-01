package org.LOGIN_POO;

public class Usuario {
    private String username;
    private String password;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean verificarCredenciales(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}
