package br.com.pi.model;

import java.util.Date;

public class LocacaoModel {

    private int locacao_idem;
    private int locacao_codigoDelocacao;
    private Date locacao_dataRetirada;
    private Date locacao_dataDevolucao;
    private Date locacao_dataDeAlugamento; //data que cara foi na loja
    private float locacao_quilometragemInicial;
    private float locacao_quilometragemFinal;
    private float locacao_valorLocacao;
    private float locacao_valorCalcao;
    private float locacao_valorSeguro;
    private float locacao_multaAtraso;
    private int locacao_tanqueCheio;
    private MotoristaModel locacao_motorista;
    private VeiculoModel locacao_veiculo;
    private PessoaModel locacao_pessoa;
    private AdministradorModel locacao_administrador;

    public int getLocacao_idem() {
        return locacao_idem;
    }

    public void setLocacao_idem(int locacao_idem) {
        this.locacao_idem = locacao_idem;
    }

    public int getLocacao_codigoDelocacao() {
        return locacao_codigoDelocacao;
    }

    public void setLocacao_codigoDelocacao(int locacao_codigoDelocacao) {
        this.locacao_codigoDelocacao = locacao_codigoDelocacao;
    }

    public Date getLocacao_dataRetirada() {
        return locacao_dataRetirada;
    }

    public void setLocacao_dataRetirada(Date locacao_dataRetirada) {
        this.locacao_dataRetirada = locacao_dataRetirada;
    }

    public Date getLocacao_dataDevolucao() {
        return locacao_dataDevolucao;
    }

    public void setLocacao_dataDevolucao(Date locacao_dataDevolucao) {
        this.locacao_dataDevolucao = locacao_dataDevolucao;
    }

    public Date getLocacao_dataDeAlugamento() {
        return locacao_dataDeAlugamento;
    }

    public void setLocacao_dataDeAlugamento(Date locacao_dataDeAlugamento) {
        this.locacao_dataDeAlugamento = locacao_dataDeAlugamento;
    }

    public float getLocacao_quilometragemInicial() {
        return locacao_quilometragemInicial;
    }

    public void setLocacao_quilometragemInicial(float locacao_quilometragemInicial) {
        this.locacao_quilometragemInicial = locacao_quilometragemInicial;
    }

    public float getLocacao_quilometragemFinal() {
        return locacao_quilometragemFinal;
    }

    public void setLocacao_quilometragemFinal(float locacao_quilometragemFinal) {
        this.locacao_quilometragemFinal = locacao_quilometragemFinal;
    }

    public float getLocacao_valorLocacao() {
        return locacao_valorLocacao;
    }

    public void setLocacao_valorLocacao(float locacao_valorLocacao) {
        this.locacao_valorLocacao = locacao_valorLocacao;
    }

    public float getLocacao_valorCalcao() {
        return locacao_valorCalcao;
    }

    public void setLocacao_valorCalcao(float locacao_valorCalcao) {
        this.locacao_valorCalcao = locacao_valorCalcao;
    }

    public float getLocacao_valorSeguro() {
        return locacao_valorSeguro;
    }

    public void setLocacao_valorSeguro(float locacao_valorSeguro) {
        this.locacao_valorSeguro = locacao_valorSeguro;
    }

    public float getLocacao_multaAtraso() {
        return locacao_multaAtraso;
    }

    public void setLocacao_multaAtraso(float locacao_multaAtraso) {
        this.locacao_multaAtraso = locacao_multaAtraso;
    }

    public MotoristaModel getLocacao_motorista() {
        return locacao_motorista;
    }

    public void setLocacao_motorista(MotoristaModel locacao_motorista) {
        this.locacao_motorista = locacao_motorista;
    }

    public VeiculoModel getLocacao_veiculo() {
        return locacao_veiculo;
    }

    public void setLocacao_veiculo(VeiculoModel locacao_veiculo) {
        this.locacao_veiculo = locacao_veiculo;
    }

    public AdministradorModel getLocacao_administrador() {
        return locacao_administrador;
    }

    public void setLocacao_administrador(AdministradorModel locacao_administrador) {
        this.locacao_administrador = locacao_administrador;
    }

    public int getLocacao_tanqueCheio() {
        return locacao_tanqueCheio;
    }

    public void setLocacao_tanqueCheio(int locacao_tanqueCheio) {
        this.locacao_tanqueCheio = locacao_tanqueCheio;
    }

    public PessoaModel getLocacao_pessoa() {
        return locacao_pessoa;
    }

    public void setLocacao_pessoa(PessoaModel locacao_pessoa) {
        this.locacao_pessoa = locacao_pessoa;
    }

    @Override
    public String toString() {
        return "LocacaoModel{" + "locacao_idem=" + locacao_idem + ",\nlocacao_codigoDelocacao=" + locacao_codigoDelocacao
                + ",\nlocacao_dataRetirada=" + locacao_dataRetirada + ", locacao_dataDevolucao=" + locacao_dataDevolucao
                + ",\nlocacao_dataDeAlugamento=" + locacao_dataDeAlugamento + ", locacao_quilometragemInicial=" + locacao_quilometragemInicial
                + ",\nlocacao_quilometragemFinal=" + locacao_quilometragemFinal + ", locacao_valorLocacao=" + locacao_valorLocacao
                + ",\nlocacao_valorCalcao=" + locacao_valorCalcao + ", locacao_valorSeguro=" + locacao_valorSeguro + ", locacao_multaAtraso="
                + locacao_multaAtraso + ",\nlocacao_tanqueCheio=" + locacao_tanqueCheio + ", locacao_motorista=" + locacao_motorista
                + ",\nlocacao_veiculo=" + locacao_veiculo + ", locacao_pessoa=" + locacao_pessoa + ", locacao_administrador="
                + locacao_administrador + '}';
    }

}
