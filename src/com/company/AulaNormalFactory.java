package com.company;

public class AulaNormalFactory extends AulaFactory {

    @Override
    public Conteudo montaConteudo() {
        return new Conteudo("Introdu��o � Abstract Factory.");
    }
}
