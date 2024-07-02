package com.mycompany.torredehenoi;

import java.util.Stack;

public class CalcJogadas {

    public Stack pilha1;
    public Stack pilha2;
    public int numeroDeMovimentos;

    public CalcJogadas(int n) {
        pilha1 = new Stack();
        pilha2 = new Stack();
        numeroDeMovimentos = 0;
        for (int i = n; i > 0; i--) {
            pilha1.push(i);
        }
    }

    public void solucao() {
        moveDisco(pilha1.size(), pilha1, pilha2);
    }

    public void moveDisco(int n, Stack pilha1, Stack pilha2) {
        if (n > 0) {
            moveDisco(n - 1, pilha1, pilha2);
            moveDisk(pilha1, pilha2);
            moveDisco(n - 1, pilha2, pilha1);
        }
    }

    public void moveDisk(Stack pilha1, Stack pilha2 ) {
        pilha2.push(pilha1.pop());
        numeroDeMovimentos++;
    }

    public int movimentos() {
        return numeroDeMovimentos;
    }
}