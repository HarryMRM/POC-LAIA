package org.laia;

public class Chat {
    private String mensaje;

    public Chat() {
        mensaje = "";
    }

    public void escribirMensaje(String mensaje) {
        this.mensaje = mensaje;
        System.out.println("Usuario: " + mensaje);
    }
}
