package org.example;

import java.util.ArrayList;
import java.util.List;

public class Comissao_Arbitragem {
    private List<Jogador> jogadoresComLancesEmRevisao = new ArrayList<>();

    public void addJogadorComLanceRevisao(Jogador jogador) {
        this.jogadoresComLancesEmRevisao.add(jogador);
    }
    public boolean verificarLanceDoJogador(Jogador jogador) {
        return this.jogadoresComLancesEmRevisao.contains(jogador);
    }
}
