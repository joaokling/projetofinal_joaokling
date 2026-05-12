package model;

public class Relatorio {

    private long id;
    private String descricao;

    public Relatorio(long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public void gerar() {
        System.out.println("Relatório: " + descricao);
    }
}
