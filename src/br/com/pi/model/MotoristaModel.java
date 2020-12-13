package br.com.pi.model;

import java.util.Date;

public class MotoristaModel {

    private int motorista_idem;
    private String motorista_cpf;
    private String motorista_nome;
    private String motorista_rg;
    private String motorista_telefone;
    private String motorista_email;
    private String cnh_categoria;
    private Date cnh_dataValidade;
    private byte[] cnh_imagem;
    private int cnh_numeroRegistro;
    private EnderecoModel motorista_endereco;

    public String getCnh_categoria() {
        return cnh_categoria;
    }

    public void setCnh_categoria(String cnh_categoria) {
        this.cnh_categoria = cnh_categoria;
    }

    public Date getCnh_dataValidade() {
        return cnh_dataValidade;
    }

    public void setCnh_dataValidade(Date cnh_dataValidade) {
        this.cnh_dataValidade = cnh_dataValidade;
    }

    public byte[] getCnh_imagem() {
        return cnh_imagem;
    }

    public void setCnh_imagem(byte[] cnh_imagem) {
        this.cnh_imagem = cnh_imagem;
    }

    public int getCnh_numeroRegistro() {
        return cnh_numeroRegistro;
    }

    public void setCnh_numeroRegistro(int cnh_numeroRegistro) {
        this.cnh_numeroRegistro = cnh_numeroRegistro;
    }

    public int getMotorista_idem() {
        return motorista_idem;
    }

    public void setMotorista_idem(int motorista_idem) {
        this.motorista_idem = motorista_idem;
    }

    public String getMotorista_cpf() {
        return motorista_cpf;
    }

    public void setMotorista_cpf(String motorista_cpf) {
        this.motorista_cpf = motorista_cpf;
    }

    public String getMotorista_nome() {
        return motorista_nome;
    }

    public void setMotorista_nome(String motorista_nome) {
        this.motorista_nome = motorista_nome;
    }

    public String getMotorista_rg() {
        return motorista_rg;
    }

    public void setMotorista_rg(String motorista_rg) {
        this.motorista_rg = motorista_rg;
    }

    public String getMotorista_telefone() {
        return motorista_telefone;
    }

    public void setMotorista_telefone(String motorista_telefone) {
        this.motorista_telefone = motorista_telefone;
    }

    public String getMotorista_email() {
        return motorista_email;
    }

    public void setMotorista_email(String motorista_email) {
        this.motorista_email = motorista_email;
    }

    public EnderecoModel getMotorista_endereco() {
        return motorista_endereco;
    }

    public void setMotorista_endereco(EnderecoModel motorista_endereco) {
        this.motorista_endereco = motorista_endereco;
    }

    public int compareToo(MotoristaModel element) {
        int res = 0;
        if (this.motorista_idem < element.getMotorista_idem()) {
            res =- 1;
        }
        if (this.motorista_idem > element.getMotorista_idem()) {
            res = 1;
        }
        return res;
    }

    @Override
    public String toString() {
        return motorista_nome ;
    }

}
