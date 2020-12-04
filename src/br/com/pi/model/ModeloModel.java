package br.com.pi.model;

public class ModeloModel {

    private int modelo_idem;
    private String modelo_descricao;
    private MarcaModel modelo_marca;

    public int getModelo_idem() {
        return modelo_idem;
    }

    public void setModelo_idem(int modelo_idem) {
        this.modelo_idem = modelo_idem;
    }

    public String getModelo_descricao() {
        return modelo_descricao;
    }

    public void setModelo_descricao(String modelo_descricao) {
        this.modelo_descricao = modelo_descricao;
    }

    public MarcaModel getModelo_marca() {
        return modelo_marca;
    }

    public void setModelo_marca(MarcaModel modelo_marca) {
        this.modelo_marca = modelo_marca;
    }
    @Override
    public String toString() {
        return "modelo_idem=" + modelo_idem + ", modelo_descricao=" + modelo_descricao + ", modelo_marca=" + modelo_marca ;
    }
}
