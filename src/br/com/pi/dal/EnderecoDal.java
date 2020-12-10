/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi.dal;

import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.EnderecoModel;
import br.com.pi.util.AdpterConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author watlas
 */
public class EnderecoDal implements ICRUD_GENERIC {

    private Connection conexao;
    EnderecoModel endereco = new EnderecoModel();

    public EnderecoDal() {
        this.conexao = new AdpterConexao().getConnectionAdapter();
    }

    @Override
    public int addReturn(Object objeto) throws Exception {
        int id = 0;

        try {
            endereco = (EnderecoModel) objeto;
            String sql = "INSERT INTO endereco ("
                    + "endereco_cep, endereco_cidade, endereco_bairro, "
                    + "endereco_rua, endereco_numero, endereco_complemento, "
                    + "endereco_estado)\n"
                    + "	VALUES (?, ?, ?, ?, ?, ?, ?)";
            // return 
            PreparedStatement ps = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, endereco.getEndereco_cep());
            ps.setString(2, endereco.getEndereco_cidade());
            ps.setString(3, endereco.getEndereco_bairro());
            ps.setString(4, endereco.getEndereco_rua());
            ps.setObject(5, endereco.getEndereco_numero());
            ps.setString(6, endereco.getEndereco_complemento());
            ps.setString(7, endereco.getEndereco_estado());

            id = ps.executeUpdate();
            
            if (id == 0) {
                throw new SQLException("Falhar ao inserir cliente do banco.");
            }

            try ( ResultSet generatedKeys = ps.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    id = generatedKeys.getInt(1);
                } else {
                    //throw new Exception("Falhar ao inserir cliente com ID.");
                    throw new SQLException("Falhar ao inserir cliente com ID");
                }
            }

        } catch (SQLException e) {
            throw e;
        }

        return id;

    }

    @Override
    public void add(Object objeto) throws Exception {
        endereco = (EnderecoModel) objeto;
        String sql = "INSERT INTO endereco ("
                + "endereco_cep, endereco_cidade, endereco_bairro, "
                + "endereco_rua, endereco_numero, endereco_complemento, "
                + "endereco_estado)\n"
                + "	VALUES (?, ?, ?, ?, ?, ?, ?)";
        // return 
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, endereco.getEndereco_cep());
        ps.setString(2, endereco.getEndereco_cidade());
        ps.setString(3, endereco.getEndereco_bairro());
        ps.setString(4, endereco.getEndereco_rua());
        ps.setObject(5, endereco.getEndereco_numero());
        ps.setString(6, endereco.getEndereco_complemento());
        ps.setString(7, endereco.getEndereco_estado());

        ps.executeUpdate();

    }

    @Override
    public void delete(int n) throws Exception {
        String sql = "DELETE FROM Endereco  WHERE endereco_idem =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, n);
        ps.executeUpdate();
    }

    @Override
    public void update(Object objeto) throws Exception {
        endereco = (EnderecoModel) objeto;
        PreparedStatement prep = conexao.prepareStatement("UPDATE Endereco SET "
                + "endereco_cep=?, endereco_cidade=?, "
                + "endereco_bairro=?, endereco_rua=?, endereco_numero=?, "
                + "endereco_complemento=?, endereco_estado=? "
                + "WHERE endereco_idem=?;");

        prep.setString(1, endereco.getEndereco_cep());
        prep.setString(2, endereco.getEndereco_cidade());
        prep.setString(3, endereco.getEndereco_bairro());
        prep.setString(4, endereco.getEndereco_rua());
        prep.setInt(5, endereco.getEndereco_numero());
        prep.setString(6, endereco.getEndereco_complemento());
        prep.setString(7, endereco.getEndereco_estado());
        prep.setInt(8, endereco.getEndereco_iden());
        prep.executeUpdate();

    }

    @Override
    public Iterator getAll() throws Exception {
        String sql = "SELECT * FROM Endereco";
        List<EnderecoModel> list = new ArrayList<>();
        Statement st = conexao.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            endereco = new EnderecoModel();

            endereco.setEndereco_iden(rs.getInt("endereco_idem"));
            endereco.setEndereco_cep(rs.getString("endereco_cep"));
            endereco.setEndereco_cidade(rs.getString("endereco_cidade"));
            endereco.setEndereco_bairro(rs.getString("endereco_bairro"));
            endereco.setEndereco_rua(rs.getString("endereco_rua"));
            endereco.setEndereco_numero(rs.getInt("endereco_numero"));
            endereco.setEndereco_estado(rs.getString("endereco_estado"));
            endereco.setEndereco_complemento(rs.getString("endereco_complemento"));

            list.add(endereco);

        }

        return list.iterator();

    }

    @Override
    public Object getById(int n) throws Exception {
        String sql = "SELECT * FROM Endereco WHERE endereco_idem =?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1, n);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            endereco = new EnderecoModel();

            endereco.setEndereco_iden(rs.getInt("endereco_idem"));
            endereco.setEndereco_cep(rs.getString("endereco_cep"));
            endereco.setEndereco_cidade(rs.getString("endereco_cidade"));
            endereco.setEndereco_bairro(rs.getString("endereco_bairro"));
            endereco.setEndereco_rua(rs.getString("endereco_rua"));
            endereco.setEndereco_numero(rs.getInt("endereco_numero"));
            endereco.setEndereco_estado(rs.getString("endereco_estado"));
            endereco.setEndereco_complemento(rs.getString("endereco_complemento"));

        }
        return endereco;
    }

    @Override
    public Object getByNome(String nome) throws Exception {
        return null;

    }

}
