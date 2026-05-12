package model;

public class Equipe {

    private long id;
    private Bombeiro bombeiro;

    public Equipe(long id) {
        this.id = id;
    }

    public void adicionarBombeiro(Bombeiro bombeiro) {
        this.bombeiro = bombeiro;
    }
}
