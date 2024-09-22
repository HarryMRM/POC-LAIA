package org.laia;

public class Frontend {
    public Auth auth;
    public Chat chat;
    public SelectorDeTematica selectorDeTematica;
    public Frontend() {
        this.auth = new Auth();
        this.chat = new Chat();
        this.selectorDeTematica = new SelectorDeTematica();
    }
}
