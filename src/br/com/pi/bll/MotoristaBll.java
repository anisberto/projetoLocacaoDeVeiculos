package br.com.pi.bll;

import br.com.pi.dal.MotoristaDal;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.EnderecoModel;
import br.com.pi.model.MotoristaModel;
import java.util.ArrayList;
import java.util.Iterator;

public class MotoristaBll implements ICRUD_GENERIC<MotoristaModel> {

    MotoristaDal motoristaDal;

    public MotoristaBll() {
        try {
            motoristaDal = new MotoristaDal();
        } catch (Exception e) {
        }
    }

    public void addAll(MotoristaModel motoristaModel, EnderecoModel endereco) throws Exception {
        try {
            motoristaDal.addAll(motoristaModel, endereco);
        } catch (Exception e) {
            throw e;
        }

    }

    public void updateAll(MotoristaModel motoristaModel, EnderecoModel endereco) throws Exception {
        try {
            motoristaDal.updateAll(motoristaModel, endereco);
        } catch (Exception e) {
              throw e;
        }
    }

    public void deleteAll(int MotoristaId, int Idendereco) throws Exception {
        try {
            motoristaDal.deleteAll(MotoristaId, Idendereco);
        } catch (Exception e) {
              throw e;
        }
    }

    @Override
    public void add(MotoristaModel objeto) throws Exception {
        try {
     //       validate(objeto);
            motoristaDal.add(objeto);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void delete(int n) throws Exception {
        try {
            motoristaDal.delete(n);
        } catch (Exception e) {
            throw new IllegalArgumentException("Não foi possivel deletar\n" + e.getMessage());
        }
    }

    @Override
    public void update(MotoristaModel objeto) throws Exception {
        try {
            motoristaDal.update(objeto);
        } catch (Exception e) {
            throw e;
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

    @Override
    public int addReturn(MotoristaModel objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void validate(MotoristaModel obj) {
        if(obj.getMotorista_nome().isEmpty()){

        }

    }
}
