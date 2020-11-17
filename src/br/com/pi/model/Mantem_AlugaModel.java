package br.com.pi.model;

import java.util.Date;

public class Mantem_AlugaModel {

    private int mantem_aluga_idem;
    private Date mantem_aluga_dataAlugamento;
    private LocacaoModel mantem_aluga_locacao;
    private PessoaModel mantem_aluga_pessoa;

    public int getMantem_aluga_idem() {
        return mantem_aluga_idem;
    }

    public void setMantem_aluga_idem(int mantem_aluga_idem) {
        this.mantem_aluga_idem = mantem_aluga_idem;
    }

    public Date getMantem_aluga_dataAlugamento() {
        return mantem_aluga_dataAlugamento;
    }

    public void setMantem_aluga_dataAlugamento(Date mantem_aluga_dataAlugamento) {
        this.mantem_aluga_dataAlugamento = mantem_aluga_dataAlugamento;
    }

    public LocacaoModel getMantem_aluga_locacao() {
        return mantem_aluga_locacao;
    }

    public void setMantem_aluga_locacao(LocacaoModel mantem_aluga_locacao) {
        this.mantem_aluga_locacao = mantem_aluga_locacao;
    }

    public PessoaModel getMantem_aluga_pessoa() {
        return mantem_aluga_pessoa;
    }

    public void setMantem_aluga_pessoa(PessoaModel mantem_aluga_pessoa) {
        this.mantem_aluga_pessoa = mantem_aluga_pessoa;
    }
}

