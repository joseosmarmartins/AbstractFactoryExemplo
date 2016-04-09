package com.company;

public class AulaNormalFactory extends AulaFactory {

    @Override
    public Conteudo montaConteudo() {
        return new Conteudo("Introdução à Abstract Factory.");
    }
}
