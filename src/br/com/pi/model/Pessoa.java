package br.com.pi.model;

public class Pessoa {
    private int pessoa_idem;
    private String pessoa_nome;
    private String pessoa_telefone;
    private String pessoa_email;

    public int getPessoa_idem() {
        return pessoa_idem;
    }

    public void setPessoa_idem(int pessoa_idem) {
        this.pessoa_idem = pessoa_idem;
    }

    public String getPessoa_nome() {
        return pessoa_nome;
    }

    public void setPessoa_nome(String pessoa_nome) {
        this.pessoa_nome = pessoa_nome;
    }

    public String getPessoa_telefone() {
        return pessoa_telefone;
    }

    public void setPessoa_telefone(String pessoa_telefone) {
        this.pessoa_telefone = pessoa_telefone;
    }

    public String getPessoa_email() {
        return pessoa_email;
    }

    public void setPessoa_email(String pessoa_email) {
        this.pessoa_email = pessoa_email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "pessoa_idem=" + pessoa_idem +
                ", pessoa_nome='" + pessoa_nome + '\'' +
                ", pessoa_telefone='" + pessoa_telefone + '\'' +
                ", pessoa_email='" + pessoa_email + '\'' +
                '}';
    }
}
