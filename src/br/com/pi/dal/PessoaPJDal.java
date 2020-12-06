package br.com.pi.dal;

import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.PessoaModel;
import br.com.pi.model.PessoaPFModel;
import br.com.pi.model.PessoaPJModel;
import br.com.pi.util.AdpterConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    @Override
    public void add(Object objeto) throws Exception {
        pessoaPJModel = (PessoaPJModel) objeto;
        String sql = "INSERT INTO pessoas_pj (pj_cnpj,pj_nome_fantasia,pj_razao_social,pj_pessoas_idem)" +
                "VALUES (?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, pessoaPJModel.getPessoa_pj_cnpj());
        ps.setObject(2, pessoaPJModel.getPessoa_pj_nomeFantasia());
        ps.setObject(3, pessoaPJModel.getPessoa_pj_razaoSocial());
        ps.setObject(4, pessoaPJModel.getPessoa().getPessoa_idem());
        ps.executeUpdate();


    }

    @Override
    public void delete(int n) throws Exception {
        String sql = "DELETE FROM pessoas_pj WHERE pj_idem =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1,n);
        ps.executeUpdate();

    }

    @Override
    public void update(Object objeto) throws Exception {
        pessoaPJModel = (PessoaPJModel) objeto;
        String sql = "UPDATE pessoas_pj SET pj_cnpj=?,pj_nome_fantasia=?,pj_razao_social=?,pj_pessoas_idem=?" +
                "WHERE  pj_idem =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, pessoaPJModel.getPessoa_pj_cnpj());
        ps.setObject(2, pessoaPJModel.getPessoa_pj_nomeFantasia());
        ps.setObject(3, pessoaPJModel.getPessoa_pj_razaoSocial());
        ps.setObject(4, pessoaPJModel.getPessoa().getPessoa_idem());
        ps.setObject(5, pessoaPJModel.getPessoa_pj_idem());
        ps.executeUpdate();

    }

    @Override
    public Iterator getAll() throws Exception {
        String sql  ="SELECT * FROM pessoas_pj";
        PessoaDal pessoaDal = new PessoaDal();
        List<PessoaPJModel> list = new ArrayList<>();

        Statement st = conexao.createStatement();;
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){
            pessoaPJModel = new PessoaPJModel();
            pessoaPJModel.setPessoa_pj_idem(rs.getInt("pj_idem"));
            pessoaPJModel.setPessoa_pj_nomeFantasia(rs.getString("pj_nome_fantasia"));
            pessoaPJModel.setPessoa_pj_cnpj(rs.getString("pj_cnpj"));
            pessoaPJModel.setPessoa_pj_razaoSocial("pj_razao_social");
            pessoaPJModel.setPessoa((PessoaModel) pessoaDal.getById(rs.getInt("pj_pessoas_idem")));

            list.add(pessoaPJModel);

        }

        return list.iterator();
    }

    @Override
    public Object getById(int n) throws Exception {
        String sql = "SELECT * FROM pessoas_pj WHERE pj_idem = ?";
        PessoaDal pessoaDal = new PessoaDal();
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1,n);
        ResultSet rs = preparedStatement.executeQuery();
        if(rs.next()){
            pessoaPJModel = new PessoaPJModel();
            pessoaPJModel.setPessoa_pj_idem(rs.getInt("pj_idem"));
            pessoaPJModel.setPessoa_pj_nomeFantasia(rs.getString("pj_nome_fantasia"));
            pessoaPJModel.setPessoa_pj_cnpj(rs.getString("pj_cnpj"));
            pessoaPJModel.setPessoa_pj_razaoSocial("pj_razao_social");
            pessoaPJModel.setPessoa((PessoaModel) pessoaDal.getById(rs.getInt("pj_pessoas_idem")));


        }
        return pessoaPJModel;
    }

    @Override
    public Object getByNome(String nome) throws Exception {
        String sql = "SELECT * FROM pessoas_pj WHERE pj_nome_fantasia = ?";
        PessoaDal pessoaDal = new PessoaDal();
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1,nome);
        ResultSet rs = preparedStatement.executeQuery();
        if(rs.next()){
            pessoaPJModel = new PessoaPJModel();
            pessoaPJModel.setPessoa_pj_idem(rs.getInt("pj_idem"));
            pessoaPJModel.setPessoa_pj_nomeFantasia(rs.getString("pj_nome_fantasia"));
            pessoaPJModel.setPessoa_pj_cnpj(rs.getString("pj_cnpj"));
            pessoaPJModel.setPessoa_pj_razaoSocial("pj_razao_social");
            pessoaPJModel.setPessoa((PessoaModel) pessoaDal.getById(rs.getInt("pj_pessoas_idem")));


        }
        return pessoaPJModel;
    }

    @Override
    public int addReturn(Object objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
