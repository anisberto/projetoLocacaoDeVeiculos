package br.com.pi.bll;

import br.com.pi.dal.LocacaoDal;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.LocacaoModel;

import java.util.Iterator;

public class LocacaoBll implements ICRUD_GENERIC<LocacaoModel> {
    LocacaoDal dal;

    public LocacaoBll() throws Exception {
        dal = new LocacaoDal();
    }

    @Override
    public void add(LocacaoModel objeto) throws Exception {
        try {
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

    private void validaLocacao(LocacaoModel objeto ){

    }

    @Override
    public int addReturn(LocacaoModel objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
