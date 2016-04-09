package com.company;

public class Main {

    public static void main(String[] args) {
        Aula aulaNormal = montaAula(EnumTipoAula.NORMAL);
        Aula aulaRevisao = montaAula(EnumTipoAula.REVISAO);
        Aula aulaProva = montaAula(EnumTipoAula.PROVA);

        System.out.println("Aula normal de " + aulaNormal.getDisciplina().getDescricao() + " sobre " + aulaNormal.getConteudo().getDescricao() +
                " E aulas de " + aulaRevisao.getConteudo().getDescricao() + ", e " + aulaProva.getConteudo().getDescricao() + ", montadas com sucesso!");
    }

    private static Aula montaAula(EnumTipoAula tipoAula) {
        try {
            if (tipoAula != null) {
                AulaFactory aulaFactory;

                Aula aula = new Aula();

                if (tipoAula.equals(EnumTipoAula.NORMAL)) {
                    aulaFactory = new AulaNormalFactory();
                } else if (tipoAula.equals(EnumTipoAula.REVISAO)) {
                    aulaFactory = new AulaRevisaoFactory();
                } else if (tipoAula.equals(EnumTipoAula.PROVA)) {
                    aulaFactory = new AulaProvaFactory();
                } else {
                    aulaFactory = null;
                }

                aula.setDisciplina(new Disciplina("Padrões de Projeto"));
                if (aulaFactory != null) {
                    aula.setConteudo(aulaFactory.montaConteudo());
                }

                return aula;
            } else {
                throw new Exception("Tipo de aula deve ser informado");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
