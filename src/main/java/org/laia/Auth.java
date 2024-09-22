package org.laia;

public class Auth {
    private String usuario;
    private String password;

    public Auth() {
        usuario ="";
        password = "";
    }

    public void iniciarSesion(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
        System.out.println(usuario + " ha iniciado sesión.");
    }

    public boolean validarAdmin(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
        System.out.println(usuario + " está validando como administrador.");
        return usuario.equals("admin") && password.equals("adminpass");
    }
}
