package br.com.pi.bll;

import br.com.pi.dal.AdministradorDal;
import br.com.pi.interfaces.ICRUD_GENERIC;

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
        try {
            dal.delete(n);
        }catch (Exception e){
            throw e;
        }

    }

    @Override
    public void update(Object objeto) throws Exception {
        try {
            dal.update(objeto);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Iterator getAll() throws Exception {
        try {
            return dal.getAll();
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Object getById(int n) throws Exception {
        try {
            return dal.getById(n);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Object getByNome(String nome) throws Exception {
        try {
            return dal.getByNome(nome);
        }catch (Exception e){
            throw e;
        }
    }
}
