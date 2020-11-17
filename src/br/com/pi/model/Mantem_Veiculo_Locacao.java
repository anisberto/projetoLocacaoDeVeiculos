package br.com.pi.model;

public class Mantem_Veiculo_Locacao {
    private int mantem_veiculo_locacao_idem;
    private VeiculoModel mantem_veiculo_locacao_veiculo;
    private LocacaoModel mantem_veiculo_locacao_locacao;

    public int getMantem_veiculo_locacao_idem() {
        return mantem_veiculo_locacao_idem;
    }

    public void setMantem_veiculo_locacao_idem(int mantem_veiculo_locacao_idem) {
        this.mantem_veiculo_locacao_idem = mantem_veiculo_locacao_idem;
    }

    public VeiculoModel getMantem_veiculo_locacao_veiculo() {
        return mantem_veiculo_locacao_veiculo;
    }

    public void setMantem_veiculo_locacao_veiculo(VeiculoModel mantem_veiculo_locacao_veiculo) {
        this.mantem_veiculo_locacao_veiculo = mantem_veiculo_locacao_veiculo;
    }

    public LocacaoModel getMantem_veiculo_locacao_locacao() {
        return mantem_veiculo_locacao_locacao;
    }

    public void setMantem_veiculo_locacao_locacao(LocacaoModel mantem_veiculo_locacao_locacao) {
        this.mantem_veiculo_locacao_locacao = mantem_veiculo_locacao_locacao;
    }
}
