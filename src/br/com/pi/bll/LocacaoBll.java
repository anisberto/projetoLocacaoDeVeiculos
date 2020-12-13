package br.com.pi.bll;

import br.com.pi.dal.LocacaoDal;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.LocacaoModel;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Iterator;
import javax.swing.JOptionPane;

public class LocacaoBll implements ICRUD_GENERIC<LocacaoModel> {

    LocacaoDal dal;

    public LocacaoBll() throws Exception {
        dal = new LocacaoDal();
    }

    @Override
    public void add(LocacaoModel objeto) throws Exception {
        try {
            validate(objeto);
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
    public void update(LocacaoModel objeto) throws Exception {
        try {
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
    public LocacaoModel getById(int n) throws Exception {
        try {
            return dal.getById(n);
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public LocacaoModel getByNome(String nome) throws Exception {
        try {
            return dal.getByNome(nome);
        } catch (Exception e) {
            throw e;
        }
    }

    private void validate(LocacaoModel objetoTeste) {
//        String date = new SimpleDateFormat("dd/MM/yyyy").format(new Date(objetoTeste.getLocacao_dataDeAlugamento().getTime()));
//        String dates[] = date.split("/");
//        int dia = Integer.parseInt(dates[0]);
//        int mes = Integer.parseInt(dates[1]);
//        int ano = Integer.parseInt(dates[2]);
//
//        if (dia < 0 || mes < 0 || ano < 0 || mes > 12) {
//            throw new IllegalArgumentException("Data Invalida! Defina uma data para Locação");
//        }
        if(objetoTeste.getLocacao_veiculo().getVeiculo_situacaoVeiculo().equalsIgnoreCase("locado")){
            throw new IllegalArgumentException("Veiculo já locado");
        }
        if(objetoTeste.getLocacao_veiculo().getVeiculo_situacaoVeiculo().equalsIgnoreCase("vendido")){
            throw new IllegalArgumentException("Veiculo vendido");
        }
    }

    @Override
    public int addReturn(LocacaoModel objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
