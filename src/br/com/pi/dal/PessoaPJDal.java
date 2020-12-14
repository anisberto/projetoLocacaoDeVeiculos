package br.com.pi.dal;

import br.com.pi.bll.EnderecoBll;
import br.com.pi.bll.PessoaBll;
import br.com.pi.bll.PessoaPJBll;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.EnderecoModel;
import br.com.pi.model.PessoaModel;

import br.com.pi.model.PessoaPJModel;
import br.com.pi.util.AdpterConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PessoaPJDal implements ICRUD_GENERIC {

    private Connection conexao;
    PessoaPJModel pessoaPJModel = new PessoaPJModel();

    public PessoaPJDal() throws Exception {
        conexao = new AdpterConexao().getConnectionAdapter();
    }

    public void addAll(EnderecoModel endereco, PessoaPJModel pessoa) throws Exception {
        EnderecoBll enderecoDal = new EnderecoBll();
        PessoaBll pessoaDal = new PessoaBll();
        PessoaPJBll pessoaPJBll = new PessoaPJBll();
        try {
            conexao.setAutoCommit(false);
            int idendereco = enderecoDal.addReturn(endereco);
            endereco.setEndereco_iden(idendereco);
            int idPessoa = pessoaDal.addReturn(pessoa);
            pessoa.setPessoa_idem(idPessoa);
            pessoaPJBll.add(pessoa);
            conexao.commit();

        } catch (Exception e) {
            conexao.rollback();
            throw e;

        }
    }

    public void updateAll(EnderecoModel endereco, PessoaModel pessoaModel, PessoaPJModel pessoa) throws Exception {
        EnderecoBll enderecoDal = new EnderecoBll();
        PessoaBll pessoaDal = new PessoaBll();
        PessoaPJBll pessoaPJBll = new PessoaPJBll();
        try {
            conexao.setAutoCommit(false);
            enderecoDal.update(endereco);
            pessoaDal.update(pessoaModel);
            pessoaPJBll.update(pessoa);
            conexao.commit();

        } catch (Exception e) {
            conexao.rollback();
            throw e;
        }
    }

    public void deleteAll(int endereco, int pessoapj, int pessoa) throws Exception {
        EnderecoBll enderecoDal = new EnderecoBll();
        PessoaBll pessoaDal = new PessoaBll();
        PessoaPJBll pessoaPJBll = new PessoaPJBll();
        try {
            conexao.setAutoCommit(false);
            enderecoDal.delete(endereco);
            pessoaDal.delete(pessoa);
            pessoaPJBll.delete(pessoapj);

            conexao.commit();

        } catch (Exception e) {
            conexao.rollback();
            throw e;
        }
    }

    @Override
    public void add(Object objeto) throws Exception {
        pessoaPJModel = (PessoaPJModel) objeto;
        String sql = "INSERT INTO pessoas_pj (pj_cnpj,pj_nome_fantasia,pj_razao_social,pj_pessoas_idem)"
                + "VALUES (?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, pessoaPJModel.getPessoa_pj_cnpj());
        ps.setObject(2, pessoaPJModel.getPessoa_pj_nomeFantasia());
        ps.setObject(3, pessoaPJModel.getPessoa_pj_razaoSocial());
        ps.setObject(4, pessoaPJModel.getPessoaModel().getPessoa_idem());
        ps.executeUpdate();

    }

    @Override
    public void delete(int n) throws Exception {
        String sql = "DELETE FROM pessoas_pj WHERE pj_pessoas_idem=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, n);
        ps.executeUpdate();

    }

    @Override
    public void update(Object objeto) throws Exception {
        try {
            pessoaPJModel = (PessoaPJModel) objeto;
            String sql = "UPDATE pessoas_pj SET pj_cnpj=?,pj_nome_fantasia=?,pj_razao_social=?"
                    + " WHERE  pj_pessoas_idem=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setObject(1, pessoaPJModel.getPessoa_pj_cnpj());
            ps.setObject(2, pessoaPJModel.getPessoa_pj_nomeFantasia());
            ps.setObject(3, pessoaPJModel.getPessoa_pj_razaoSocial());
            ps.setObject(4, pessoaPJModel.getPessoaModel().getPessoa_idem());
            ps.executeUpdate();

        } catch (Exception e) {
            throw e;

        }

    }

    @Override
    public Iterator getAll() throws Exception {
        String sql = "SELECT * FROM pessoas_pj";
        PessoaDal pessoaDal = new PessoaDal();
        List<PessoaPJModel> list = new ArrayList<>();

        Statement st = conexao.createStatement();
        ;
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            PessoaPJModel pessoaPj = new PessoaPJModel();
            pessoaPj.setPessoa_pj_idem(rs.getInt("pj_idem"));
            pessoaPj.setPessoa_pj_nomeFantasia(rs.getString("pj_nome_fantasia"));
            pessoaPj.setPessoa_pj_cnpj(rs.getString("pj_cnpj"));
            pessoaPj.setPessoa_pj_razaoSocial("pj_razao_social");
            pessoaPj.setPessoaModel((PessoaModel) pessoaDal.getById(rs.getInt("pj_pessoas_idem")));

            list.add(pessoaPj);
        }
        return list.iterator();
    }

    @Override
    public Object getById(int n) throws Exception {
        pessoaPJModel = new PessoaPJModel();
        PessoaDal pessoaDal = new PessoaDal();
        String sql = "SELECT * FROM pessoas_pj WHERE pj_pessoas_idem =?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1, n);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            pessoaPJModel = new PessoaPJModel();
            pessoaPJModel.setPessoa_pj_idem(rs.getInt("pj_idem"));
            pessoaPJModel.setPessoa_pj_nomeFantasia(rs.getString("pj_nome_fantasia"));
            pessoaPJModel.setPessoa_pj_cnpj(rs.getString("pj_cnpj"));
            pessoaPJModel.setPessoa_pj_razaoSocial(rs.getString("pj_razao_social"));

            pessoaPJModel.setPessoaModel((PessoaModel) pessoaDal.getById(rs.getInt("pj_pessoas_idem")));

        }
        return pessoaPJModel;
    }

    @Override
    public Object getByNome(String nome) throws Exception {
        String sql = "SELECT * FROM pessoas_pj WHERE pj_nome_fantasia = ?";
        PessoaDal pessoaDal = new PessoaDal();
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1, nome);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            pessoaPJModel = new PessoaPJModel();
            pessoaPJModel.setPessoa_pj_idem(rs.getInt("pj_idem"));
            pessoaPJModel.setPessoa_pj_nomeFantasia(rs.getString("pj_nome_fantasia"));
            pessoaPJModel.setPessoa_pj_cnpj(rs.getString("pj_cnpj"));
            pessoaPJModel.setPessoa_pj_razaoSocial("pj_razao_social");
            pessoaPJModel.setPessoaModel((PessoaModel) pessoaDal.getById(rs.getInt("pj_pessoas_idem")));

        }
        return pessoaPJModel;
    }

    @Override
    public int addReturn(Object objeto) throws Exception {
        int id;
        try {
            pessoaPJModel = (PessoaPJModel) objeto;
            String sql = "INSERT INTO pessoas_pj (pj_cnpj,pj_nome_fantasia,pj_razao_social,pj_pessoas_idem)"
                    + "VALUES (?,?,?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setObject(1, pessoaPJModel.getPessoa_pj_cnpj());
            ps.setObject(2, pessoaPJModel.getPessoa_pj_nomeFantasia());
            ps.setObject(3, pessoaPJModel.getPessoa_pj_razaoSocial());
            ps.setObject(4, pessoaPJModel.getPessoaModel().getPessoa_idem());
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
}
