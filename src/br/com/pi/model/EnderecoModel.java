package br.com.pi.model;

public class EnderecoModel {

    private int endereco_iden;
    private String endereco_cep;
    private String endereco_cidade;
    private String endereco_bairro;
    private String endereco_rua;
    private int endereco_numero;
    private String endereco_complemento;
    private String endereco_estado;
    private PessoaModel endereco_pessoa;
    private MotoristaModel endereco_motorista;

    public EnderecoModel() {
    }

    public EnderecoModel(int endereco_iden, String endereco_cep, String endereco_cidade, String endereco_bairro, String endereco_rua, int endereco_numero, String endereco_complemento, String endereco_estado, PessoaModel endereco_pessoa, MotoristaModel endereco_motorista) {
        this.endereco_iden = endereco_iden;
        this.endereco_cep = endereco_cep;
        this.endereco_cidade = endereco_cidade;
        this.endereco_bairro = endereco_bairro;
        this.endereco_rua = endereco_rua;
        this.endereco_numero = endereco_numero;
        this.endereco_complemento = endereco_complemento;
        this.endereco_estado = endereco_estado;
        this.endereco_pessoa = endereco_pessoa;
        this.endereco_motorista = endereco_motorista;
    }

    public String getEndereco_estado() {
        return endereco_estado;
    }

    public void setEndereco_estado(String endereco_estado) {
        this.endereco_estado = endereco_estado;
    }

    public int getEndereco_iden() {
        return endereco_iden;
    }

    public void setEndereco_iden(int endereco_iden) {
        this.endereco_iden = endereco_iden;
    }

    public String getEndereco_cep() {
        return endereco_cep;
    }

    public void setEndereco_cep(String endereco_cep) {
        this.endereco_cep = endereco_cep;
    }

    public String getEndereco_cidade() {
        return endereco_cidade;
    }

    public void setEndereco_cidade(String endereco_cidade) {
        this.endereco_cidade = endereco_cidade;
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

    public int getEndereco_numero() {
        return endereco_numero;
    }

    public void setEndereco_numero(int endereco_numero) {
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
    

    @Override
    public String toString() {
        return "EnderecoModel{" + "endereco_iden=" + endereco_iden + ", endereco_cep=" + endereco_cep + ", endereco_cidade=" + endereco_cidade + ", endereco_bairro=" + endereco_bairro + ", endereco_rua=" + endereco_rua + ", endereco_numero=" + endereco_numero + ", endereco_complemento=" + endereco_complemento + ", endereco_estado=" + endereco_estado + ", endereco_pessoa=" + endereco_pessoa + ", endereco_motorista=" + endereco_motorista + '}';
    }
    
    
}
