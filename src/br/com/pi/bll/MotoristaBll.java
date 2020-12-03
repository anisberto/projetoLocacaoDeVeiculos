package br.com.pi.bll;

import br.com.pi.dal.MotoristaDal;
import br.com.pi.interfaces.ICRUD_GENERIC;
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

    @Override
    public void add(MotoristaModel objeto) throws Exception {
        try {
            validate(objeto);
            motoristaDal.add(objeto);
        } catch (Exception e) {
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
        try {
            ArrayList<MotoristaModel> listaMote = (ArrayList<MotoristaModel>) getAll();
            for (MotoristaModel lista : listaMote) {
                if (obj.getCnh_numeroRegistro() == lista.getCnh_numeroRegistro()) {
                    throw new IllegalArgumentException("Numero de CNH já cadastrada");
                }
                if (obj.getMotorista_cpf().equalsIgnoreCase(lista.getMotorista_cpf())) {
                    throw new IllegalArgumentException("Numero de CPF já cadastrada");
                }
                if (obj.getMotorista_rg().equalsIgnoreCase(lista.getMotorista_rg())) {
                    throw new IllegalArgumentException("Numero de RG já cadastrada");
                }
            }
        } catch (Exception ex) {
            throw new IllegalArgumentException("ERRO NA VALIDAÇÃO!");
        }
    }
}
