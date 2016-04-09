package com.company;

public class AulaProvaFactory extends AulaFactory {

    @Override
    public Conteudo montaConteudo() {
        return new Conteudo("Prova implementação de projeto com Abstract Factory.");
    }
}
