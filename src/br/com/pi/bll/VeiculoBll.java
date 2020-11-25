package br.com.pi.bll;

import br.com.pi.dal.VeiculoDal;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.VeiculoModel;
import java.util.Iterator;

public class VeiculoBll implements ICRUD_GENERIC<VeiculoModel> {

    VeiculoDal veiculoDal;

    public VeiculoBll() throws Exception {
        veiculoDal = new VeiculoDal();
    }

    @Override
    public void add(VeiculoModel objeto) throws Exception {
        try {
            veiculoDal.add(objeto);
        } catch (Exception e) {
        }
    }

    @Override
    public void delete(int n) throws Exception {
        try {
            veiculoDal.delete(n);
        } catch (Exception e) {
        }
    }

    @Override
    public void update(VeiculoModel objeto) throws Exception {
        try {
            veiculoDal.update(objeto);
        } catch (Exception e) {
        }
    }

    @Override
    public Iterator getAll() throws Exception {
        try {
            return veiculoDal.getAll();
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public VeiculoModel getById(int n) throws Exception {
        try {
            return veiculoDal.getById(n);
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public VeiculoModel getByNome(String nome) throws Exception {
        try {
            return veiculoDal.getByNome(nome);
        } catch (Exception e) {
        }
        return null;
    }
}
