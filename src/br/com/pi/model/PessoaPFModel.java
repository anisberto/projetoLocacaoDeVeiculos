package br.com.pi.model;

public class PessoaPFModel extends PessoaModel {
    private int pessoa_pf_idem;
    private String pessoa_pf_cpf;
    private String pessoa_pf_rg;
    private PessoaModel pessoaModel;

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

    public PessoaModel getPessoa() {
        return pessoaModel;
    }

    public void setPessoa(PessoaModel pessoaModel) {
        this.pessoaModel = pessoaModel;
    }

    @Override
    public String toString() {
        return "PessoaPFModel{" +
                "pessoa_pf_idem=" + pessoa_pf_idem +
                ", pessoa_pf_cpf='" + pessoa_pf_cpf + '\'' +
                ", pessoa_pf_rg='" + pessoa_pf_rg + '\'' +
                ", pessoaModel=" + pessoaModel +
                '}';
    }
}
