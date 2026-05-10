package model;

public class Bombeiro extends Pessoa {

    private String nomeGuerra;
    private String patente;
    private String matricula;

    public Bombeiro(long id, String nome, String contato,
                     String nomeGuerra, String patente, String matricula) {

        super(id, nome, contato);

        this.nomeGuerra = nomeGuerra;
        this.patente = patente;
        this.matricula = matricula;
    }

    public String getNomeGuerra() {
        return nomeGuerra;
    }
}