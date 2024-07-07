package org.example;

public class Arbitro extends Comissao_Arbitragem{
    private static Arbitro arbitro = new Arbitro();

    private Arbitro() {};

    public static Arbitro getInstancia() {
        return arbitro;
    }
}
