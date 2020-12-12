package br.com.pi.model;

public class PessoaModel {
    private int pessoa_idem;
    private String pessoa_nome;
    private String pessoa_telefone;
    private String pessoa_email;
    private EnderecoModel pessoa_endereco;

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

    public EnderecoModel getPessoa_endereco() {
        return pessoa_endereco;
    }

    public void setPessoa_endereco(EnderecoModel pessoa_endereco) {
        this.pessoa_endereco = pessoa_endereco;
    }

    @Override
    public String toString() {
        return pessoa_nome;
    }
}
