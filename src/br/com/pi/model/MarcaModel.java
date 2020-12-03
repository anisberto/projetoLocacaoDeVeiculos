package br.com.pi.model;

public class MarcaModel {
    private int marca_idem;
    private String marca_descricao;

    public int getMarca_idem() {
        return marca_idem;
    }

    public void setMarca_idem(int marca_idem) {
        this.marca_idem = marca_idem;
    }

    public String getMarca_descricao() {
        return marca_descricao;
    }

    public void setMarca_descricao(String marca_descricao) {
        this.marca_descricao = marca_descricao;
    }
    @Override
    public String toString() {
        return "marca_idem=" + marca_idem + ", marca_descricao=" + marca_descricao;
    }
}
