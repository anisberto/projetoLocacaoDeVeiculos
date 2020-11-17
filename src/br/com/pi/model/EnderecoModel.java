package br.com.pi.model;

public class EnderecoModel {

    private int endereco_idem;
    private String endereco_cep;
    private String enrederco_cidade;
    private String endereco_bairro;
    private String endereco_rua;
    private String endereco_numero;
    private String endereco_complemento;
    private PessoaModel endereco_pessoa;
    private MotoristaModel endereco_motorista;

    public int getEndereco_idem() {
        return endereco_idem;
    }

    public void setEndereco_idem(int endereco_idem) {
        this.endereco_idem = endereco_idem;
    }

    public String getEndereco_cep() {
        return endereco_cep;
    }

    public void setEndereco_cep(String endereco_cep) {
        this.endereco_cep = endereco_cep;
    }

    public String getEnrederco_cidade() {
        return enrederco_cidade;
    }

    public void setEnrederco_cidade(String enrederco_cidade) {
        this.enrederco_cidade = enrederco_cidade;
    }

    public String getEndereco_bairro() {
        return endereco_bairro;
    }

    public void setEndereco_bairro(String endereco_bairro) {
        this.endereco_bairro = endereco_bairro;
    }

    public String getEndereco_rua() {
        return endereco_rua;
    }

    public void setEndereco_rua(String endereco_rua) {
        this.endereco_rua = endereco_rua;
    }

    public String getEndereco_numero() {
        return endereco_numero;
    }

    public void setEndereco_numero(String endereco_numero) {
        this.endereco_numero = endereco_numero;
    }

    public String getEndereco_complemento() {
        return endereco_complemento;
    }

    public void setEndereco_complemento(String endereco_complemento) {
        this.endereco_complemento = endereco_complemento;
    }

    public PessoaModel getEndereco_pessoa() {
        return endereco_pessoa;
    }

    public void setEndereco_pessoa(PessoaModel endereco_pessoa) {
        this.endereco_pessoa = endereco_pessoa;
    }

    public MotoristaModel getEndereco_motorista() {
        return endereco_motorista;
    }

    public void setEndereco_motorista(MotoristaModel endereco_motorista) {
        this.endereco_motorista = endereco_motorista;
    }
}
