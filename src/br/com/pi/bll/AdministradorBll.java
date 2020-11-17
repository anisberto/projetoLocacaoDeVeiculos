package br.com.pi.bll;

import br.com.pi.dal.AdministradorDal;
import br.com.pi.util.ICRUD_GENERIC;

import java.util.Iterator;

public class AdministradorBll implements ICRUD_GENERIC {
    AdministradorDal dal;

    public AdministradorBll() throws Exception {
        dal = new AdministradorDal();
    }

    @Override
    public void add(Object objeto) throws Exception {
        try {
            dal.add(objeto);
        }catch (Exception e){
            throw e;
        }

    }

    @Override
    public void delete(int n) throws Exception {

    }

    @Override
    public void update(Object objeto) throws Exception {

    }

    @Override
    public Iterator getAll() throws Exception {
        return null;
    }

    @Override
    public Object getById(int n) throws Exception {
        return null;
    }

    @Override
    public Object getByNome(String nome) throws Exception {
        return null;
    }
}
