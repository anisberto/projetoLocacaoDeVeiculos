package br.com.pi.dal;

import br.com.pi.bll.VeiculoBll;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.MultaModel;
import br.com.pi.model.VeiculoModel;
import br.com.pi.util.AdpterConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultaDal implements ICRUD_GENERIC<MultaModel> {

    Connection conect;
    ICRUD_GENERIC<VeiculoModel> veiculoConsulta = new VeiculoBll();

    public MultaDal() throws Exception {
        conect = new AdpterConexao().getConnectionAdapter();
    }

    @Override
    public void add(MultaModel objeto) throws Exception {
        try {
            PreparedStatement prep = conect.prepareStatement("INSERT INTO multas values(?,?)");
            prep.setDouble(1, objeto.getMulta_preco());
            prep.setInt(2, objeto.getMulta_veiculo().getVeiculo_idem());
            prep.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public void delete(int n) throws Exception {
        try {
            PreparedStatement prep = conect.prepareStatement("DELETE * FROM multas WHERE multa_idem=?");
            prep.setInt(1, n);
            prep.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public void update(MultaModel objeto) throws Exception {
        try {
            PreparedStatement prep = conect.prepareStatement("UPDATE multas set multa_preco=?, multa_veiculos_idem=? WHERE multa_idem=?");
            prep.setDouble(1, objeto.getMulta_preco());
            prep.setInt(2, objeto.getMulta_veiculo().getVeiculo_idem());
            prep.setInt(3, objeto.getMulta_idem());
            prep.executeLargeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public Iterator getAll() throws Exception {
        List<MultaModel> multasNaLista = new ArrayList<>();
        try {
            Statement state = conect.createStatement();
            ResultSet result = state.executeQuery("SELECT * FROM multas");
            while (result.next()) {
                MultaModel multa = new MultaModel();
                multa.setMulta_idem(result.getInt("multa_idem"));
                multa.setMulta_preco(result.getFloat("multa_preco"));
                multa.setMulta_veiculo(veiculoConsulta.getById(result.getInt("multa_veiculos_idem")));
                multasNaLista.add(multa);
            }
            return multasNaLista.iterator();
        } catch (Exception e) {
        }
        throw new IllegalArgumentException("Erro no Codigo SQL da consulta! ");
    }

    @Override
    public MultaModel getById(int n) throws Exception {
        try {
            MultaModel multa = new MultaModel();
            PreparedStatement prep = conect.prepareStatement("SELECT * FROM multas WHERE multa_idem=?");
            prep.setInt(1, n);
            ResultSet result = prep.executeQuery();
            while (result.next()) {
                multa.setMulta_idem(result.getInt("multa_idem"));
                multa.setMulta_preco(result.getFloat("multa_preco"));
                multa.setMulta_veiculo(veiculoConsulta.getById(result.getInt("multa_veiculos_idem")));
            }
            return multa;
        } catch (Exception e) {
        }
        throw new IllegalArgumentException("Erro no codigo SQL By Id");
    }

    @Override
    public MultaModel getByNome(String nome) throws Exception {
        try {
            MultaModel multa = new MultaModel();
            PreparedStatement prep = conect.prepareStatement("SELECT * FROM multas WHERE multa_preco=?");
            prep.setString(1, nome);
            ResultSet result = prep.executeQuery();
            while (result.next()) {
                multa.setMulta_idem(result.getInt("multa_idem"));
                multa.setMulta_preco(result.getFloat("multa_preco"));
                multa.setMulta_veiculo(veiculoConsulta.getById(result.getInt("multa_veiculos_idem")));
            }
            return multa;
        } catch (Exception e) {
        }
        throw new IllegalArgumentException("Erro no codigo SQL By Multa");
    }

    @Override
    public int addReturn(MultaModel objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
