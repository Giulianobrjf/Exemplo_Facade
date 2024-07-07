package org.example;

public class VAR extends Comissao_Arbitragem{

    private static VAR var = new VAR();

    private VAR() {};

    public static VAR getInstancia() {
        return var;
    }
}
