package com.company;

public enum EnumTipoAula {

    NORMAL("Normal"),
    REVISAO("Revis�o"),
    PROVA("Prova");

    private String descricao;

    EnumTipoAula(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
