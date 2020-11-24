/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi.dal;

import br.com.pi.model.MarcaModel;
import br.com.pi.util.Conexao;
import br.com.pi.util.ICRUD_GENERIC;
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
public class MarcaDal implements ICRUD_GENERIC {

    private Connection conexao;
    MarcaModel marcaModel = new MarcaModel();

    public MarcaDal() throws Exception {
        this.conexao = Conexao.getInstance().getConnection();
    }


    @Override
    public void add(Object objeto) throws Exception {
        marcaModel = (MarcaModel) objeto;
        String sql = "INSERT INTO marcas(marca_descricao)" +
                "VALUES (?)";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, marcaModel.getMarca_descricao());
        ps.executeUpdate();

    }

    @Override
    public void delete(int n) throws Exception {
        String sql = "DELETE FROM pessoas WHERE marca_idem =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1,n);
        ps.executeUpdate();

    }

    @Override
    public void update(Object objeto) throws Exception {
        String sql ="UPDATE marca SET marca_descricao =?" +
                " WHERE marca_idem =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, marcaModel.getMarca_descricao());
        ps.setObject(2, marcaModel.getMarca_idem());
        ps.executeUpdate();

    }

    @Override
    public Iterator getAll() throws Exception {
        String sql = "SELECT * FROM pessoas";
        List<MarcaModel> pessoaModelList = new ArrayList<>();

        Statement st = conexao.createStatement();;
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){
            marcaModel = new MarcaModel();
            marcaModel.setMarca_idem(rs.getInt("marca_idem"));
            marcaModel.setMarca_descricao(rs.getString("marca_descricao"));

            pessoaModelList.add(marcaModel);
        }
        return pessoaModelList.iterator();
    }

    @Override
    public Object getById(int n) throws Exception {
        String sql = "SELECT * FROM marca WHERE marca_idem = ?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1,n);
        ResultSet rs = preparedStatement.executeQuery();

        if(rs.next()){
            marcaModel = new MarcaModel();
            marcaModel.setMarca_idem(rs.getInt("marca_idem"));
            marcaModel.setMarca_descricao(rs.getString("marca_descricao"));
        }

        return marcaModel;
    }

    @Override
    public Object getByNome(String nome) throws Exception {
        String sql = "SELECT * FROM marca WHERE marca_descricao = ?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1,nome);
        ResultSet rs = preparedStatement.executeQuery();

        if(rs.next()){
            marcaModel = new MarcaModel();
            marcaModel.setMarca_idem(rs.getInt("marca_idem"));
            marcaModel.setMarca_descricao(rs.getString("marca_descricao"));
        }

        return marcaModel;
    }
}
