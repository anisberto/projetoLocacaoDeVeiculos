package br.com.pi.model;

import java.util.Date;

public class CNHModel {

    private int cnh_idem;
    private String cnh_categoria;
    private Date cnh_dataValidade;
    private String cnh_imagem;
    private int cnh_numeroRegistro;

    public int getCnh_idem() {
        return cnh_idem;
    }

    public void setCnh_idem(int cnh_idem) {
        this.cnh_idem = cnh_idem;
    }

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

    public String getCnh_imagem() {
        return cnh_imagem;
    }

    public void setCnh_imagem(String cnh_imagem) {
        this.cnh_imagem = cnh_imagem;
    }

    public int getCnh_numeroRegistro() {
        return cnh_numeroRegistro;
    }

    public void setCnh_numeroRegistro(int cnh_numeroRegistro) {
        this.cnh_numeroRegistro = cnh_numeroRegistro;
    }
}
