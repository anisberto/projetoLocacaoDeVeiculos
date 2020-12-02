package br.com.pi.bll;

import br.com.pi.dal.MultaDal;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.MultaModel;
import java.util.Iterator;

public class MultaBll implements ICRUD_GENERIC<MultaModel> {

    MultaDal multaDal;

    public MultaBll() throws Exception {
        multaDal = new MultaDal();
    }

    @Override
    public void add(MultaModel objeto) throws Exception {
        try {
            multaDal.add(objeto);
        } catch (Exception e) {
        }
    }

    @Override
    public void delete(int n) throws Exception {
        try {
            multaDal.delete(n);
        } catch (Exception e) {
        }
    }

    @Override
    public void update(MultaModel objeto) throws Exception {
        try {
            multaDal.update(objeto);
        } catch (Exception e) {
        }
    }

    @Override
    public Iterator getAll() throws Exception {
        try {
            return multaDal.getAll();
        } catch (Exception e) {
        }
        throw new IllegalArgumentException("Erro estrutural ao consultar");
    }

    @Override
    public MultaModel getById(int n) throws Exception {
        try {
            return multaDal.getById(n);
        } catch (Exception e) {
        }
        throw new IllegalArgumentException("Erro estrutural ao consultar");
    }

    @Override
    public MultaModel getByNome(String nome) throws Exception {
        try {
            return multaDal.getByNome(nome);
        } catch (Exception e) {
        }
        throw new IllegalArgumentException("Erro estrutural ao consultar");
    }

    @Override
    public int addReturn(MultaModel objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
