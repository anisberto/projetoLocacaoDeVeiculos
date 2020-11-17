package br.com.pi.model;

import java.util.Date;

public class LocacaoModel {

    private int locacao_idem;
    private int locacao_codigoDelocacao;
    private Date locacao_dataRetirada;
    private Date locacao_dataDevolucao;
    private float locacao_quilometragemInicial;
    private float locacao_quilometragemFinal;
    private float locacao_valorLocacao;
    private float locacao_valorCalcao;
    private float locacao_valorSeguro;
    private float locacao_multaAtraso;
    private MotoristaModel locacao_motorista;

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
}
