package org.example;

public class Bandeirinha extends Comissao_Arbitragem{

    private static Bandeirinha bandeirinha = new Bandeirinha();

    private Bandeirinha() {};

    public static Bandeirinha getInstancia() {
        return bandeirinha;
    }
}
