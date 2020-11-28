package br.com.pi.dal;

import br.com.pi.model.PessoaModel;
import br.com.pi.model.PessoaPFModel;
import br.com.pi.util.Conexao;
import br.com.pi.interfaces.ICRUD_GENERIC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PessoaPFDal implements ICRUD_GENERIC {

    private Connection conexao;
    PessoaPFModel pessoa = new PessoaPFModel();

    public PessoaPFDal() throws Exception {
        conexao = Conexao.getInstance().getConnection();
    }

    @Override
    public void add(Object objeto) throws Exception {
        pessoa =(PessoaPFModel) objeto;
        String sql = "INSERT INT pessoas_pf(pessoa_pf_cpf, pessoa_pf_rg)" +
                "VALUES (?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, pessoa.getPessoa_pf_cpf());
        ps.setObject(2,pessoa.getPessoa_pf_rg());
        ps.setObject(3, pessoa.getPessoa().getPessoa_idem());
        ps.executeUpdate();

    }

    @Override
    public void delete(int n) throws Exception {
        String sql = "DELETE FROM pessoas_pf WHERE pf_idem=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1,n);
        ps.executeUpdate();

    }

    @Override
    public void update(Object objeto) throws Exception {
        pessoa =(PessoaPFModel) objeto;
        String sql ="UPDATE pessoas_pf SET pf_cpf=?, pf_rg=?, pf_pessoas_idem=?" +
                "WHERE pf_idem=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, pessoa.getPessoa_pf_cpf());
        ps.setObject(2,pessoa.getPessoa_pf_rg());
        ps.setObject(3, pessoa.getPessoa().getPessoa_idem());
        ps.setObject(4,pessoa.getPessoa_pf_idem());
        ps.executeUpdate();

    }

    @Override
    public Iterator getAll() throws Exception {
        PessoaDal pessoaDal = new PessoaDal();
        PessoaModel pessoaModel;
        String sql = "SELECT * FROM pessoas_pf";
        List<PessoaPFModel> list = new ArrayList<>();

        Statement st = conexao.createStatement();;
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            pessoaModel = new PessoaModel();
            pessoa = new PessoaPFModel();
            pessoa.setPessoa_pf_idem(rs.getInt("pf_idem"));
            pessoa.setPessoa_pf_cpf(rs.getString("pf_cpf"));
            pessoa.setPessoa_pf_rg(rs.getString("pf_rg"));

            pessoa.setPessoa(pessoaModel = (PessoaModel) pessoaDal.getById(rs.getInt("pf_pessoas_idem")));
            list.add(pessoa);
        }


        return list.listIterator();
    }

    @Override
    public Object getById(int n) throws Exception {
        PessoaDal pessoaDal = new PessoaDal();
        PessoaModel pessoaModel;
        String sql = "SELECT * FROM pessoas_pf WHERE pf_idem=?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1,n);
        ResultSet rs = preparedStatement.executeQuery();

        if(rs.next()){
            pessoaModel = new PessoaModel();
            pessoa = new PessoaPFModel();
            pessoa.setPessoa_pf_idem(rs.getInt("pf_idem"));
            pessoa.setPessoa_pf_cpf(rs.getString("pf_cpf"));
            pessoa.setPessoa_pf_rg(rs.getString("pf_rg"));

            pessoa.setPessoa(pessoaModel = (PessoaModel) pessoaDal.getById(rs.getInt("pf_pessoas_idem")));

        }

        return pessoa;
    }

    @Override
    public Object getByNome(String nome) throws Exception {
        PessoaDal pessoaDal = new PessoaDal();

        String sql = "SELECT * FROM pessoas_pf WHERE pf_cpf=?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1,nome);
        ResultSet rs = preparedStatement.executeQuery();

        if(rs.next()){

            pessoa = new PessoaPFModel();
            pessoa.setPessoa_pf_idem(rs.getInt("pf_idem"));
            pessoa.setPessoa_pf_cpf(rs.getString("pf_cpf"));
            pessoa.setPessoa_pf_rg(rs.getString("pf_rg"));

            pessoa.setPessoa((PessoaModel) pessoaDal.getById(rs.getInt("pf_pessoas_idem")));

        }

        return pessoa;
    }
}
