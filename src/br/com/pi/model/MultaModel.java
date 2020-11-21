package br.com.pi.model;

public class MultaModel {
    private int multa_idem;
    private float multa_preco;
    private VeiculoModel multa_veiculo;

    public int getMulta_idem() {
        return multa_idem;
    }

    public void setMulta_idem(int multa_idem) {
        this.multa_idem = multa_idem;
    }

    public float getMulta_preco() {
        return multa_preco;
    }

    public void setMulta_preco(float multa_preco) {
        this.multa_preco = multa_preco;
    }

    public VeiculoModel getMulta_veiculo() {
        return multa_veiculo;
    }

    public void setMulta_veiculo(VeiculoModel multa_veiculo) {
        this.multa_veiculo = multa_veiculo;
    }
}
