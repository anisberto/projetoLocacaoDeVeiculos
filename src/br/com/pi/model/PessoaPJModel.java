package br.com.pi.model;

public class PessoaPJModel extends PessoaModel {

    private int pessoa_pj_idem;
    private String pessoa_pj_cnpj;
    private String pessoa_pj_nomeFantasia;
    private String pessoa_pj_razaoSocial;
    private PessoaModel pessoaModel;

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


    public void setPessoa_pj_idem(int pessoa_pj_idem) {
        this.pessoa_pj_idem = pessoa_pj_idem;
    }

    public int getPessoa_pj_idem() {
        return pessoa_pj_idem;
    }

    public PessoaModel getPessoaModel() {
        return pessoaModel;
    }

    public void setPessoaModel(PessoaModel pessoaModel) {
        this.pessoaModel = pessoaModel;
    }
    


    @Override
    public String toString() {
        return pessoa_pj_nomeFantasia;
    }

}
