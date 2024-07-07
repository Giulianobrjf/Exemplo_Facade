package org.example;

public class JogadorFacade {
    public static boolean verificarLances(Jogador jogador) {
        if (VAR.getInstancia().verificarLanceDoJogador(jogador)) {
            return false;
        }
        if (Arbitro.getInstancia().verificarLanceDoJogador(jogador)) {
            return false;
        }
        if (Bandeirinha.getInstancia().verificarLanceDoJogador(jogador)) {
            return false;
        }
        return true;
    }
}
