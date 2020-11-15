package br.com.pi.model;

public class PessoaPJ extends Pessoa{
    private String pessoa_pj_cnpj;
    private String pessoa_pj_nomeFantasia;
    private String pessoa_pj_razaoSocial;
    private Pessoa pessoa;

    public String getPessoa_pj_cnpj() {
        return pessoa_pj_cnpj;
    }

    public void setPessoa_pj_cnpj(String pessoa_pj_cnpj) {
        this.pessoa_pj_cnpj = pessoa_pj_cnpj;
    }

    public String getPessoa_pj_nomeFantasia() {
        return pessoa_pj_nomeFantasia;
    }

    public void setPessoa_pj_nomeFantasia(String pessoa_pj_nomeFantasia) {
        this.pessoa_pj_nomeFantasia = pessoa_pj_nomeFantasia;
    }

    public String getPessoa_pj_razaoSocial() {
        return pessoa_pj_razaoSocial;
    }

    public void setPessoa_pj_razaoSocial(String pessoa_pj_razaoSocial) {
        this.pessoa_pj_razaoSocial = pessoa_pj_razaoSocial;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "PessoaPJ{" +
                "pessoa_pj_cnpj='" + pessoa_pj_cnpj + '\'' +
                ", pessoa_pj_nomeFantasia='" + pessoa_pj_nomeFantasia + '\'' +
                ", pessoa_pj_razaoSocial='" + pessoa_pj_razaoSocial + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}
