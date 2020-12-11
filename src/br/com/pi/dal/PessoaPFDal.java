package br.com.pi.dal;

import br.com.pi.bll.EnderecoBll;
import br.com.pi.bll.PessoaBll;
import br.com.pi.bll.PessoaPFBll;
import br.com.pi.model.PessoaModel;
import br.com.pi.model.PessoaPFModel;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.EnderecoModel;
import br.com.pi.util.AdpterConexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PessoaPFDal implements ICRUD_GENERIC {

    private Connection conexao;
    PessoaPFModel pessoa = new PessoaPFModel();

    public PessoaPFDal() throws Exception {
        conexao = new AdpterConexao().getConnectionAdapter();
    }

    public void addAll(EnderecoModel endereco, PessoaPFModel pessoa) throws Exception {
        EnderecoBll enderecoDal = new EnderecoBll();
        PessoaBll pessoaDal = new PessoaBll();
        PessoaPFBll pessoaPFBll = new PessoaPFBll();
        try {
            conexao.setAutoCommit(false);
            int idendereco = enderecoDal.addReturn(endereco);
            endereco.setEndereco_iden(idendereco);
            int idPessoa = pessoaDal.addReturn(pessoa);
            pessoa.setPessoa_idem(idPessoa);
            pessoaPFBll.add(pessoa);
            conexao.commit();

        } catch (Exception e) {
            conexao.rollback();
            throw e;

        }

    }

    public void updateAll(EnderecoModel endereco, PessoaModel pessoaModel, PessoaPFModel pessoa) throws Exception {
        EnderecoBll enderecoBll = new EnderecoBll();
        PessoaBll pessoaBll = new PessoaBll();
        PessoaPFBll pessoaPFBll = new PessoaPFBll();
        try {
            conexao.setAutoCommit(false);
            enderecoBll.update(endereco);
            pessoaBll.update(pessoaModel);
            pessoaPFBll.update(pessoa);
            conexao.commit();

        } catch (Exception e) {
            conexao.rollback();
            throw e;
        }
    }

    public void deleteAll(int endereco, int pessoapf, int pessoa) throws Exception {
        EnderecoDal enderecoBll = new EnderecoDal();
        PessoaDal pessoaBll = new PessoaDal();
        PessoaPFBll pessoaPFBll = new PessoaPFBll();
        try {
            conexao.setAutoCommit(false);
            enderecoBll.delete(endereco);
            pessoaBll.delete(pessoa);
            pessoaPFBll.delete(pessoapf);
            conexao.commit();

        } catch (Exception e) {
            conexao.rollback();
            throw e;
        }
    }

    @Override
    public void add(Object objeto) throws Exception {
        pessoa = (PessoaPFModel) objeto;
        String sql = "INSERT INTO pessoas_pf(pf_cpf, pf_rg, pf_pessoas_idem)"
                + "VALUES (?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, pessoa.getPessoa_pf_cpf());
        ps.setObject(2, pessoa.getPessoa_pf_rg());
        ps.setInt(3, pessoa.getPessoa().getPessoa_idem());
        ps.executeUpdate();

    }

    @Override
    public void delete(int n) throws Exception {
        String sql = "DELETE FROM pessoas_pf WHERE pf_pessoas_idem=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, n);
        ps.executeUpdate();

    }

    @Override
    public void update(Object objeto) throws Exception {
        try {
            pessoa = (PessoaPFModel) objeto;
            String sql = "UPDATE pessoas_pf SET pf_cpf=?, pf_rg=? "
                    + "WHERE pf_pessoas_idem = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setObject(1, pessoa.getPessoa_pf_cpf());
            ps.setObject(2, pessoa.getPessoa_pf_rg());
            ps.setObject(3, pessoa.getPessoa().getPessoa_idem());
            ps.executeUpdate();
        }catch (Exception e){
            throw e;
        }

    }

    @Override
    public Iterator getAll() throws Exception {
        PessoaDal pessoaDal = new PessoaDal();
        String sql = "SELECT * FROM pessoas_pf";
        List<PessoaPFModel> list = new ArrayList();

        Statement st = conexao.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            PessoaPFModel pessoaFisica = new PessoaPFModel();
            pessoaFisica.setPessoa_pf_idem(rs.getInt("pf_idem"));
            pessoaFisica.setPessoa_pf_cpf(rs.getString("pf_cpf"));
            pessoaFisica.setPessoa_pf_rg(rs.getString("pf_rg"));
            pessoaFisica.setPessoa((PessoaModel) pessoaDal.getById(rs.getInt("pf_pessoas_idem")));
            list.add(pessoaFisica);
        }
        return list.iterator();
    }

    @Override
    public Object getById(int n) throws Exception {
        PessoaDal pessoaDal = new PessoaDal();
        pessoa = new PessoaPFModel();
        String sql = "SELECT * FROM pessoas_pf WHERE pf_pessoas_idem=?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1, n);
        ResultSet rs = preparedStatement.executeQuery();

        if (rs.next()) {
            pessoa = new PessoaPFModel();
            pessoa.setPessoa_pf_idem(rs.getInt("pf_idem"));
            pessoa.setPessoa_pf_cpf(rs.getString("pf_cpf"));
            pessoa.setPessoa_pf_rg(rs.getString("pf_rg"));

            pessoa.setPessoa((PessoaModel) pessoaDal.getById(rs.getInt("pf_pessoas_idem")));

        }

        return pessoa;
    }

    @Override
    public Object getByNome(String nome) throws Exception {
        PessoaDal pessoaDal = new PessoaDal();

        String sql = "SELECT * FROM pessoas_pf WHERE pf_cpf=?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1, nome);
        ResultSet rs = preparedStatement.executeQuery();

        if (rs.next()) {

            pessoa = new PessoaPFModel();
            pessoa.setPessoa_pf_idem(rs.getInt("pf_idem"));
            pessoa.setPessoa_pf_cpf(rs.getString("pf_cpf"));
            pessoa.setPessoa_pf_rg(rs.getString("pf_rg"));

            pessoa.setPessoa((PessoaModel) pessoaDal.getById(rs.getInt("pf_pessoas_idem")));

        }

        return pessoa;
    }

    @Override
    public int addReturn(Object objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
