package br.com.pi.bll;

import br.com.pi.dal.EnderecoDal;
import br.com.pi.interfaces.ICRUD_GENERIC;
import java.util.Iterator;


public class EnderecoBll implements ICRUD_GENERIC {
    
    EnderecoDal dal;

    public EnderecoBll() {
        dal = new EnderecoDal();
    }
   

    @Override
    public int addReturn(Object objeto) throws Exception {
        try {
            return dal.addReturn(objeto);
        } catch (Exception e) {
            throw e;
        }
        
    }

    @Override
    public void add(Object objeto) throws Exception {
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
    public void update(Object objeto) throws Exception {
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
          
        } catch (Exception e) {
            throw e;
        }
        return null;
    }


    
}
