/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi.dal;

import br.com.pi.model.ModeloModel;
import br.com.pi.util.Conexao;
import br.com.pi.interfaces.ICRUD_GENERIC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Anthonny Max
 */
public class ModeloDal implements ICRUD_GENERIC {

    private Connection conexao;
    ModeloModel modeloModel = new ModeloModel();

    public ModeloDal() throws Exception {
        this.conexao = Conexao.getInstance().getConnection();
    }


    @Override
    public void add(Object objeto) throws Exception {
        modeloModel = (ModeloModel) objeto;
        String sql = "INSERT INTO modelo(modelo_descricao)" +
                "VALUES (?)";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, modeloModel.getModelo_descricao());
        ps.executeUpdate();

    }

    @Override
    public void delete(int n) throws Exception {
        String sql = "DELETE FROM modelo WHERE modelo_idem =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1,n);
        ps.executeUpdate();

    }

    @Override
    public void update(Object objeto) throws Exception {
        String sql ="UPDATE modelo SET modelo_descricao =?" +
                " WHERE modelo_idem =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, modeloModel.getModelo_descricao());
        ps.setObject(2, modeloModel.getModelo_idem());
        ps.executeUpdate();

    }

    @Override
    public Iterator getAll() throws Exception {
        String sql = "SELECT * FROM modelo";
        List<ModeloModel> pessoaModelList = new ArrayList<>();

        Statement st = conexao.createStatement();;
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){
            modeloModel = new ModeloModel();
            modeloModel.setModelo_idem(rs.getInt("modelo_idem"));
            modeloModel.setModelo_descricao(rs.getString("modelo_descricao"));

            pessoaModelList.add(modeloModel);
        }
        return pessoaModelList.iterator();
    }

    @Override
    public Object getById(int n) throws Exception {
        String sql = "SELECT * FROM modelo WHERE modelo_idem = ?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1,n);
        ResultSet rs = preparedStatement.executeQuery();

        if(rs.next()){
            modeloModel = new ModeloModel();
            modeloModel.setModelo_idem(rs.getInt("modelo_idem"));
            modeloModel.setModelo_descricao(rs.getString("modelo_descricao"));
        }

        return modeloModel;
    }

    @Override
    public Object getByNome(String nome) throws Exception {
        String sql = "SELECT * FROM modelo WHERE modelo_descricao = ?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1,nome);
        ResultSet rs = preparedStatement.executeQuery();

        if(rs.next()){
            modeloModel = new ModeloModel();
            modeloModel.setModelo_idem(rs.getInt("modelo_idem"));
            modeloModel.setModelo_descricao(rs.getString("modelo_descricao"));
        }

        return modeloModel;
    }
}
