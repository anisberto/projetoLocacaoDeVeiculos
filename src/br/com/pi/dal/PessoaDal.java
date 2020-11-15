package br.com.pi.dal;


import br.com.pi.model.Pessoa;
import br.com.pi.util.Conexao;
import br.com.pi.util.ICRUD_GENERIC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PessoaDal implements ICRUD_GENERIC {

    private Connection conexao;
    Pessoa pessoa = new Pessoa();

    public PessoaDal() throws Exception {
        this.conexao = Conexao.getInstance().getConnection();
    }


    @Override
    public void add(Object objeto) throws Exception {
        pessoa = (Pessoa) objeto;
        String sql = "INSERT INTO pessoas(pessoa_nome, pessoa_telefone, pessoa_email)" +
                "VALUES (?,?,?)";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, pessoa.getPessoa_nome());
        ps.setObject(2,pessoa.getPessoa_telefone());
        ps.setObject(3,pessoa.getPessoa_email());
        ps.executeUpdate();

    }

    @Override
    public void delete(int n) throws Exception {
        String sql = "DELETE FROM pessoas WHERE pessoa_idem =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1,n);
        ps.executeUpdate();

    }

    @Override
    public void update(Object objeto) throws Exception {
        String sql ="UPDATE pessoas SET pessoa_nome =?, pessoa_telefone=?, pessoa_email =?" +
                " WHERE pessoa_idem =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, pessoa.getPessoa_nome());
        ps.setObject(2,pessoa.getPessoa_telefone());
        ps.setObject(3,pessoa.getPessoa_email());
        ps.setObject(4,pessoa.getPessoa_idem());
        ps.executeUpdate();

    }

    @Override
    public List getAll() throws Exception {
        String sql = "SELECT * FROM pessoas";
        List<Pessoa> pessoaList = new ArrayList<>();

        Statement st = conexao.createStatement();;
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){
            pessoa = new Pessoa();
            pessoa.setPessoa_idem(rs.getInt("pessoa_idem"));
            pessoa.setPessoa_nome(rs.getString("pessoa_nome"));
            pessoa.setPessoa_email(rs.getString("pessoa_email"));
            pessoa.setPessoa_telefone(rs.getString("pessoa_telefone"));

            pessoaList.add(pessoa);
        }
        return pessoaList;
    }

    @Override
    public Object getById(int n) throws Exception {
        String sql = "SELECT * FROM pessoas WHERE pessoa_idem = ?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1,n);
        ResultSet rs = preparedStatement.executeQuery();

        if(rs.next()){
            pessoa = new Pessoa();
            pessoa.setPessoa_idem(rs.getInt("pessoa_idem"));
            pessoa.setPessoa_nome(rs.getString("pessoa_nome"));
            pessoa.setPessoa_email(rs.getString("pessoa_email"));
            pessoa.setPessoa_telefone(rs.getString("pessoa_telefone"));
        }

        return pessoa;
    }

    @Override
    public Object getByNome(String nome) throws Exception {
        String sql = "SELECT * FROM pessoas WHERE pessoa_nome = ?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1,nome);
        ResultSet rs = preparedStatement.executeQuery();

        if(rs.next()){
            pessoa = new Pessoa();
            pessoa.setPessoa_idem(rs.getInt("pessoa_idem"));
            pessoa.setPessoa_nome(rs.getString("pessoa_nome"));
            pessoa.setPessoa_email(rs.getString("pessoa_email"));
            pessoa.setPessoa_telefone(rs.getString("pessoa_telefone"));
        }

        return pessoa;
    }
}
