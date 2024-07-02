package com.mycompany.torredehenoi;

public class TorreDeHenoi {

    public static void main(String[] args) {
        int numDisks = 6;
        CalcJogadas movimentos = new CalcJogadas(numDisks);
        movimentos.solucao();
        System.out.println("Total de movimentos: " + movimentos.movimentos());
    }
}
