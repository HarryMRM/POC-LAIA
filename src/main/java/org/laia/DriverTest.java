package org.laia;

public class DriverTest {
    private Frontend frontend;
    private Backend backend;
    private Llama llama;

    public DriverTest() {
        this.frontend = new Frontend();
        this.backend = new Backend();
        this.llama = new Llama();
    }

    public void simularInteraccionUsuario() {
        frontend.auth.iniciarSesion("Selene Delgado Lopez", "password");
        frontend.chat.escribirMensaje("Hola");
        backend.restApi.enviarPeticionHttp("mensaje");
        backend.restApi.enviarRespuestaHttp(llama.modelo.enviarRespuesta("Hola desde Llama"));
    }

    public void simularCambioTematica() {
        if (frontend.auth.validarAdmin("admin", "adminpass")) {
            String nuevaTematica = frontend.selectorDeTematica.cambiarTematica("Computación");
            backend.restApi.enviarRespuestaHttp(nuevaTematica);
        }
    }
}
