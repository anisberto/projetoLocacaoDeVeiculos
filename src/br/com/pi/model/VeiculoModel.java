package br.com.pi.model;

public class VeiculoModel {

    private int veiculo_idem;
    private String veiculo_renavam;
    private float veiculo_precoCompra;
    private float veiculo_precoVenda;
    private int veiculo_numeroDePassageiro;
    private String veiculo_anoFabrica;
    private String veiculo_anoModelo;
    private float veiculo_quilometragem;
    private String veiculo_tipoCombustivel;
    private String veiculo_tipoVeiculo;
    private String veiculo_situacaoVeiculo;
    private ModeloModel veiculo_modelo;

    public int getVeiculo_idem() {
        return veiculo_idem;
    }

    public void setVeiculo_idem(int veiculo_idem) {
        this.veiculo_idem = veiculo_idem;
    }

    public String getVeiculo_renavam() {
        return veiculo_renavam;
    }

    public void setVeiculo_renavam(String veiculo_renavam) {
        this.veiculo_renavam = veiculo_renavam;
    }

    public float getVeiculo_precoCompra() {
        return veiculo_precoCompra;
    }

    public void setVeiculo_precoCompra(float veiculo_precoCompra) {
        this.veiculo_precoCompra = veiculo_precoCompra;
    }

    public float getVeiculo_precoVenda() {
        return veiculo_precoVenda;
    }

    public void setVeiculo_precoVenda(float veiculo_precoVenda) {
        this.veiculo_precoVenda = veiculo_precoVenda;
    }

    public int getVeiculo_numeroDePassageiro() {
        return veiculo_numeroDePassageiro;
    }

    public void setVeiculo_numeroDePassageiro(int veiculo_numeroDePassageiro) {
        this.veiculo_numeroDePassageiro = veiculo_numeroDePassageiro;
    }

    public String getVeiculo_anoFabrica() {
        return veiculo_anoFabrica;
    }

    public void setVeiculo_anoFabrica(String veiculo_anoFabrica) {
        this.veiculo_anoFabrica = veiculo_anoFabrica;
    }

    public String getVeiculo_anoModelo() {
        return veiculo_anoModelo;
    }

    public void setVeiculo_anoModelo(String veiculo_anoModelo) {
        this.veiculo_anoModelo = veiculo_anoModelo;
    }

    public float getVeiculo_quilometragem() {
        return veiculo_quilometragem;
    }

    public void setVeiculo_quilometragem(float veiculo_quilometragem) {
        this.veiculo_quilometragem = veiculo_quilometragem;
    }

    public String getVeiculo_tipoCombustivel() {
        return veiculo_tipoCombustivel;
    }

    public void setVeiculo_tipoCombustivel(String veiculo_tipoCombustivel) {
        this.veiculo_tipoCombustivel = veiculo_tipoCombustivel;
    }

    public String getVeiculo_tipoVeiculo() {
        return veiculo_tipoVeiculo;
    }

    public void setVeiculo_tipoVeiculo(String veiculo_tipoVeiculo) {
        this.veiculo_tipoVeiculo = veiculo_tipoVeiculo;
    }

    public ModeloModel getVeiculo_modelo() {
        return veiculo_modelo;
    }

    public void setVeiculo_modelo(ModeloModel veiculo_modelo) {
        this.veiculo_modelo = veiculo_modelo;
    }

    public String getVeiculo_situacaoVeiculo() {
        return veiculo_situacaoVeiculo;
    }

    public void setVeiculo_situacaoVeiculo(String veiculo_situacaoVeiculo) {
        this.veiculo_situacaoVeiculo = veiculo_situacaoVeiculo;
    }

    @Override
    public String toString() {
        return this.veiculo_modelo.getModelo_descricao();
    }
    
}
