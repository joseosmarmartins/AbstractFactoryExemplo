package com.company;

public class AulaRevisaoFactory extends AulaFactory {

    @Override
    public Conteudo montaConteudo() {
        return new Conteudo("Revis�o para a prova sobre projeto Java com implementa��o do padr�o de projetos Abstract Factory");
    }
}
