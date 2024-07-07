package org.example;

public class Jogador {
    public boolean realizarLance() {
        return JogadorFacade.verificarLances(this);
    }
}
