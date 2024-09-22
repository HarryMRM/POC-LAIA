package org.laia;

public class Modelo {
    public Modelo() {}
    public String enviarRespuesta(String mensaje) {
        System.out.println("Modelo procesando el mensaje: " + mensaje);
        return "Respuesta de IA a: " + mensaje;
    }
}
