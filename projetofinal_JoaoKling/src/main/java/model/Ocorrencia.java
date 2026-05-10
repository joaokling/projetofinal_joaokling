package model;

import java.util.ArrayList;

public class Ocorrencia {

    private long id;
    private String tipo;
    private String local;
    private String status;

    private Usuario usuario;
    private Relatorio relatorio;

    private ArrayList<Equipe> equipes;
    private ArrayList<Viatura> viaturas;

    public Ocorrencia(long id, String tipo, String local,
                      String status, Usuario usuario) {

        this.id = id;
        this.tipo = tipo;
        this.local = local;
        this.status = status;
        this.usuario = usuario;

        equipes = new ArrayList<>();
        viaturas = new ArrayList<>();
    }

    public void adicionarEquipe(Equipe e) {
        equipes.add(e);
    }

    public void adicionarViatura(Viatura v) {
        viaturas.add(v);
    }

    public void finalizar(String descricaoRelatorio) {
        this.relatorio = new Relatorio(1, descricaoRelatorio);
    }
}