package model;

public class Ocorrencia {

    private long id;
    private String tipo;
    private String local;
    private String status;

    private Usuario usuario;
    private Relatorio relatorio;

    public Ocorrencia(long id, String tipo, String local, String status, Usuario usuario) {
        this.id = id;
        this.tipo = tipo;
        this.local = local;
        this.status = status;
        this.usuario = usuario;
    }

    public void finalizar() {
        status = "Finalizada";
    }
}
