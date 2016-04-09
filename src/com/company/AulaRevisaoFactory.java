package com.company;

public class AulaRevisaoFactory extends AulaFactory {

    @Override
    public Conteudo montaConteudo() {
        return new Conteudo("Revisão para a prova sobre projeto Java com implementação do padrão de projetos Abstract Factory");
    }
}
