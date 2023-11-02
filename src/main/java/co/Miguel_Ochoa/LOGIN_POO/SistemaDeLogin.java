package co.Miguel_Ochoa.LOGIN_POO;

public class SistemaDeLogin {
    private Usuario usuario;

    public SistemaDeLogin(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean iniciarSesion(String username, String password) {
        return usuario.verificarCredenciales(username, password);
    }
}