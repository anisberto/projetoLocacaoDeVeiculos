package br.com.pi.bll;

import br.com.pi.dal.VeiculoDal;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.VeiculoModel;
import java.util.Calendar;
import java.util.Iterator;

public class VeiculoBll implements ICRUD_GENERIC<VeiculoModel> {

    VeiculoDal veiculoDal;

    public VeiculoBll() throws Exception {
        veiculoDal = new VeiculoDal();
    }

    @Override
    public void add(VeiculoModel objeto) throws Exception {
        try {
            validade(objeto);
            veiculoDal.add(objeto);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void delete(int n) throws Exception {
        try {
            veiculoDal.delete(n);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void update(VeiculoModel objeto) throws Exception {
        try {
            veiculoDal.update(objeto);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Iterator getAll() throws Exception {
        try {
            return veiculoDal.getAll();
        } catch (Exception e) {
            
        }
        throw new IllegalArgumentException("Erro Bll");
    }

    @Override
    public VeiculoModel getById(int n) throws Exception {
        try {
            return veiculoDal.getById(n);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public VeiculoModel getByNome(String nome) throws Exception {
        try {
            return veiculoDal.getByNome(nome);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public int addReturn(VeiculoModel objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void validade(VeiculoModel veiculo) throws IllegalAccessException, Exception {
        Calendar cal = Calendar.getInstance();
        VeiculoModel veiculoTeste = veiculoDal.getByNome(veiculo.getVeiculo_renavam());
        int year = cal.get(Calendar.YEAR);
        if(veiculoTeste.getVeiculo_modelo() != null){
            throw new IllegalArgumentException("RENAVAM já cadastrado!");
        }
        if (Integer.parseInt(veiculo.getVeiculo_anoFabrica()) > year) {
            throw new IllegalArgumentException("Ano de Fabricação posterior ao atual!");
        }

    }
}
