package br.com.pi.dal;

import br.com.pi.model.PessoaModel;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.EnderecoModel;
import br.com.pi.util.AdpterConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.sql.SQLException;

public class PessoaDal implements ICRUD_GENERIC {

    private Connection conexao;
    PessoaModel pessoaModel = new PessoaModel();

    public PessoaDal() throws Exception {
        this.conexao = new AdpterConexao().getConnectionAdapter();
    }

    @Override
    public int addReturn(Object objeto) throws Exception {
        pessoaModel = (PessoaModel) objeto;
        int id = 0;
        String sql = "INSERT INTO Pessoas(pessoa_nome, pessoa_telefone, pessoa_email,pessoa_endereco)"
                + "VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setObject(1, pessoaModel.getPessoa_nome());
            ps.setObject(2, pessoaModel.getPessoa_telefone());
            ps.setObject(3, pessoaModel.getPessoa_email());
            ps.setObject(4, pessoaModel.getPessoa_endereco().getEndereco_iden());
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
    public void delete(int n) throws Exception {
        String sql = "DELETE FROM Pessoas WHERE pessoa_idem =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, n);
        ps.executeUpdate();

    }

    @Override
    public void update(Object objeto) throws Exception {
        pessoaModel = (PessoaModel) objeto;
        try {
            String sql = "UPDATE Pessoas SET pessoa_nome =?, pessoa_telefone=?, pessoa_email =?, pessoa_endereco =?"
                    + " WHERE pessoa_idem =?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setObject(1, pessoaModel.getPessoa_nome());
            ps.setObject(2, pessoaModel.getPessoa_telefone());
            ps.setObject(3, pessoaModel.getPessoa_email());
            ps.setObject(4, pessoaModel.getPessoa_endereco().getEndereco_iden());
            ps.setObject(5, pessoaModel.getPessoa_idem());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw e;
        }

    }

    @Override
    public Iterator getAll() throws Exception {
        String sql = "SELECT * FROM Pessoas";
        EnderecoDal enderecoDal = new EnderecoDal();

        List<PessoaModel> pessoaModelList = new ArrayList<>();

        Statement st = conexao.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {

            pessoaModel = new PessoaModel();
            pessoaModel.setPessoa_idem(rs.getInt("pessoa_idem"));
            pessoaModel.setPessoa_nome(rs.getString("pessoa_nome"));
            pessoaModel.setPessoa_email(rs.getString("pessoa_email"));
            pessoaModel.setPessoa_telefone(rs.getString("pessoa_telefone"));

            pessoaModel.setPessoa_endereco((EnderecoModel) enderecoDal.getById(rs.getInt("pessoa_endereco")));

            pessoaModelList.add(pessoaModel);
        }
        return pessoaModelList.iterator();
    }

    @Override
    public Object getById(int n) throws Exception {
        EnderecoDal enderecoDal = new EnderecoDal();
        EnderecoModel enderecoModel;
        String sql = "SELECT * FROM Pessoas WHERE pessoa_idem = ?";
        PessoaModel pessoaFisicaModel = new PessoaModel();
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1, n);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            pessoaFisicaModel = new PessoaModel();
            pessoaFisicaModel.setPessoa_idem(rs.getInt("pessoa_idem"));
            pessoaFisicaModel.setPessoa_nome(rs.getString("pessoa_nome"));
            pessoaFisicaModel.setPessoa_email(rs.getString("pessoa_email"));
            pessoaFisicaModel.setPessoa_telefone(rs.getString("pessoa_telefone"));

            pessoaFisicaModel.setPessoa_endereco((EnderecoModel) enderecoDal.getById(rs.getInt("pessoa_endereco")));

        }
        return pessoaFisicaModel;
    }

    @Override
    public Object getByNome(String nome) throws Exception {
        String sql = "SELECT * FROM Pessoas WHERE pessoa_nome =?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1, nome);
        ResultSet rs = preparedStatement.executeQuery();

           PessoaModel pessoaName = new PessoaModel();
        if (rs.next()) {
            pessoaName.setPessoa_idem(rs.getInt("pessoa_idem"));
            pessoaName.setPessoa_nome(rs.getString("pessoa_nome"));
            pessoaName.setPessoa_email(rs.getString("pessoa_email"));
            pessoaName.setPessoa_telefone(rs.getString("pessoa_telefone"));
        }

        return pessoaName;
    }

    @Override
    public void add(Object objeto) throws Exception {
        PessoaModel pessoaInclud = (PessoaModel) objeto;
        String sql = "INSERT INTO Pessoas(pessoa_nome, pessoa_telefone, pessoa_email,pessoa_endereco)"
                + "VALUES (?,?,?,?)";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, pessoaInclud.getPessoa_nome());
        ps.setObject(2, pessoaInclud.getPessoa_telefone());
        ps.setObject(3, pessoaInclud.getPessoa_email());
        ps.setObject(4, pessoaInclud.getPessoa_endereco().getEndereco_iden());
        ps.executeUpdate();
    }
}
