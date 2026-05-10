package model;

import java.util.ArrayList;

public class Equipe {

    private long id;
    private ArrayList<Bombeiro> bombeiros;

    public Equipe(long id) {
        this.id = id;
        this.bombeiros = new ArrayList<>();
    }

    public void adicionarBombeiro(Bombeiro b) {
        bombeiros.add(b);
    }
}