package com.company;

public class AulaProvaFactory extends AulaFactory {

    @Override
    public Conteudo montaConteudo() {
        return new Conteudo("Prova implementa��o de projeto com Abstract Factory.");
    }
}
