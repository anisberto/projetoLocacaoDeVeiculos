package br.com.pi.model;

public class PessoaPF extends Pessoa {
    private int pessoa_pf_idem;
    private String pessoa_pf_cpf;
    private String pessoa_pf_rg;
    private Pessoa pessoa;

    public int getPessoa_pf_idem() {
        return pessoa_pf_idem;
    }

    public void setPessoa_pf_idem(int pessoa_pf_idem) {
        this.pessoa_pf_idem = pessoa_pf_idem;
    }

    public String getPessoa_pf_cpf() {
        return pessoa_pf_cpf;
    }

    public void setPessoa_pf_cpf(String pessoa_pf_cpf) {
        this.pessoa_pf_cpf = pessoa_pf_cpf;
    }

    public String getPessoa_pf_rg() {
        return pessoa_pf_rg;
    }

    public void setPessoa_pf_rg(String pessoa_pf_rg) {
        this.pessoa_pf_rg = pessoa_pf_rg;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "PessoaPF{" +
                "pessoa_pf_idem=" + pessoa_pf_idem +
                ", pessoa_pf_cpf='" + pessoa_pf_cpf + '\'' +
                ", pessoa_pf_rg='" + pessoa_pf_rg + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}
