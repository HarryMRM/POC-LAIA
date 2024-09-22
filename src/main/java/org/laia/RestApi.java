package org.laia;

public class RestApi {
    public RestApi() {}

    public void enviarPeticionHttp(String tipo) {
        System.out.println("Enviando petición HTTP: " + tipo);
    }

    public void enviarRespuestaHttp(String respuesta) {
        System.out.println("Respuesta del sistema: " + respuesta);
    }
}
