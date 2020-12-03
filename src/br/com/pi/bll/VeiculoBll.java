package br.com.pi.bll;

import br.com.pi.dal.VeiculoDal;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.VeiculoModel;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        throw new IllegalArgumentException("Erro Bll");
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

    @Override
    public int addReturn(VeiculoModel objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void validade(VeiculoModel veiculo) {
        try {
            List<VeiculoModel> veiculos = (List<VeiculoModel>) getAll();
            for (VeiculoModel veiculosNalista : veiculos) {
                if (veiculo.getVeiculo_renavam().equalsIgnoreCase(veiculosNalista.getVeiculo_renavam())) {
                    throw new IllegalArgumentException("Veiculo já cadastrado com este RENAVAM");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(VeiculoBll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
