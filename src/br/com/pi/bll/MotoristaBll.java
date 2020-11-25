package br.com.pi.bll;

import br.com.pi.dal.MotoristaDal;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.MotoristaModel;
import java.util.Iterator;

public class MotoristaBll implements ICRUD_GENERIC<MotoristaModel> {

    MotoristaDal motoristaDal;

    public MotoristaBll() {
        try {
            motoristaDal = new MotoristaDal();
        } catch (Exception e) {
        }
    }

    @Override
    public void add(MotoristaModel objeto) throws Exception {
        try {
            motoristaDal.add(objeto);
        } catch (Exception e) {
        }
    }

    @Override
    public void delete(int n) throws Exception {
        try {
            motoristaDal.delete(n);
        } catch (Exception e) {
        }
    }

    @Override
    public void update(MotoristaModel objeto) throws Exception {
        try {
            motoristaDal.update(objeto);
        } catch (Exception e) {
        }
    }

    @Override
    public Iterator getAll() throws Exception {
        try {
            return motoristaDal.getAll();
        } catch (Exception e) {
        }
        throw new IllegalArgumentException("Dados não acessiveis");
    }

    @Override
    public MotoristaModel getById(int n) throws Exception {
        try {
            return motoristaDal.getById(n);
        } catch (Exception e) {
        }
        throw new IllegalArgumentException("Dados não acessiveis");
    }

    @Override
    public MotoristaModel getByNome(String nome) throws Exception {
        try {
            return motoristaDal.getByNome(nome);
        } catch (Exception e) {
        }
        throw new IllegalArgumentException("Dados não acessiveis");
    }

}
