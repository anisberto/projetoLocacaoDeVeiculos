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


}
