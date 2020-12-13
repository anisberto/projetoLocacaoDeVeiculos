package br.com.pi.bll;

import br.com.pi.dal.ReservaDal;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.ReservaModel;

import java.util.Date;
import java.util.Iterator;

public class ReservaBll implements ICRUD_GENERIC {

    ReservaDal dal;

    public ReservaBll() throws Exception {
        dal = new ReservaDal();
    }

    @Override
    public void add(Object objeto) throws Exception {
        try {
            validaReserva((ReservaModel) objeto);
            dal.add(objeto);
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public void delete(int n) throws Exception {
        try {
            dal.delete(n);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void update(Object objeto) throws Exception {
        try {
            validaReserva((ReservaModel) objeto);
            dal.update(objeto);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Iterator getAll() throws Exception {
        try {
            return dal.getAll();
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public Object getById(int n) throws Exception {
        try {
            return dal.getById(n);
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public Object getByNome(String nome) throws Exception {
        try {
            return dal.getByNome(nome);
        } catch (Exception e) {
            throw e;
        }
    }

    public void validaReserva(ReservaModel objeto) throws Exception {
        Date dataAtual = new Date();
        if(new java.util.Date(objeto.getReserva_dataReserva()).getTime() < dataAtual.getTime()){
            throw new Exception("Data invalida, coloque uma data superior a hoje");
        }
        if(new java.util.Date(objeto.getReserva_dataExpiracao()).getTime() < dataAtual.getTime()){
            throw new Exception("Data invalida, coloque uma data superior a hoje");
        }
        if(new java.util.Date(objeto.getReserva_dataExpiracao()).getTime() < new java.util.Date(objeto.getReserva_dataReserva()).getTime()){
            throw new Exception("A data de expiração deve ser maior que a data de reserva");
        }

        if (objeto.getReserva_dataExpiracao().isEmpty()) {
            throw new Exception("Informe a data da reserva de expiração");
        }
        if (objeto.getReserva_dataReserva().isEmpty()) {
            throw new Exception("Informe a data da reserva");
        }
        if (objeto.getReserva_veiculo().getVeiculo_anoFabrica().isEmpty()) {
            throw new Exception("Informe um veiculo");
        }
        if (objeto.getReserva_cliente().getPessoa_nome().isEmpty()) {
            throw new Exception("Informe um Cliente");
        }

    }

    @Override
    public int addReturn(Object objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
