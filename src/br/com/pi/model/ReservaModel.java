package br.com.pi.model;

import java.util.Date;

public class ReservaModel {

    private int reserva_idem;
    private PessoaModel reserva_cliente;
    private VeiculoModel reserva_veiculo;
    private Date reserva_dataReserva;
    private Date reserva_dataExpiracao;

    public int getReserva_idem() {
        return reserva_idem;
    }

    public void setReserva_idem(int reserva_idem) {
        this.reserva_idem = reserva_idem;
    }

    public PessoaModel getReserva_cliente() {
        return reserva_cliente;
    }

    public void setReserva_cliente(PessoaModel reserva_cliente) {
        this.reserva_cliente = reserva_cliente;
    }

    public VeiculoModel getReserva_veiculo() {
        return reserva_veiculo;
    }

    public void setReserva_veiculo(VeiculoModel reserva_veiculo) {
        this.reserva_veiculo = reserva_veiculo;
    }

    public Date getReserva_dataReserva() {
        return reserva_dataReserva;
    }

    public void setReserva_dataReserva(Date reserva_dataReserva) {
        this.reserva_dataReserva = reserva_dataReserva;
    }

    public Date getReserva_dataExpiracao() {
        return reserva_dataExpiracao;
    }

    public void setReserva_dataExpiracao(Date reserva_dataExpiracao) {
        this.reserva_dataExpiracao = reserva_dataExpiracao;
    }
}
