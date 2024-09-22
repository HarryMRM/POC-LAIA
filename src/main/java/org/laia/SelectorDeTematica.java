package org.laia;

public class SelectorDeTematica {
    private String tematica;

    public SelectorDeTematica() {
        tematica = "";
    }

    public String cambiarTematica(String tematica) {
        this.tematica = tematica;
        return "(" + tematica + " es la nueva temática)";
    }
}
