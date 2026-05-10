package model;

public class Usuario extends Pessoa {

    private String login;
    private String senha;

    public Usuario(long id, String nome, String contato,
                   String login, String senha) {

        super(id, nome, contato);

        this.login = login;
        this.senha = senha;
    }

    public boolean autenticar(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }
}