package br.com.pi.dal;


import br.com.pi.model.PessoaModel;
import br.com.pi.util.Conexao;
import br.com.pi.interfaces.ICRUD_GENERIC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PessoaDal implements ICRUD_GENERIC {

    private Connection conexao;
    PessoaModel pessoaModel = new PessoaModel();

    public PessoaDal() throws Exception {
        this.conexao = Conexao.getInstance().getConnection();
    }


    @Override
    public void add(Object objeto) throws Exception {
        pessoaModel = (PessoaModel) objeto;
        String sql = "INSERT INTO pessoas(pessoa_nome, pessoa_telefone, pessoa_email)" +
                "VALUES (?,?,?)";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, pessoaModel.getPessoa_nome());
        ps.setObject(2, pessoaModel.getPessoa_telefone());
        ps.setObject(3, pessoaModel.getPessoa_email());
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
        ps.setObject(1, pessoaModel.getPessoa_nome());
        ps.setObject(2, pessoaModel.getPessoa_telefone());
        ps.setObject(3, pessoaModel.getPessoa_email());
        ps.setObject(4, pessoaModel.getPessoa_idem());
        ps.executeUpdate();

    }

    @Override
    public Iterator getAll() throws Exception {
        String sql = "SELECT * FROM pessoas";
        List<PessoaModel> pessoaModelList = new ArrayList<>();

        Statement st = conexao.createStatement();;
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){
            pessoaModel = new PessoaModel();
            pessoaModel.setPessoa_idem(rs.getInt("pessoa_idem"));
            pessoaModel.setPessoa_nome(rs.getString("pessoa_nome"));
            pessoaModel.setPessoa_email(rs.getString("pessoa_email"));
            pessoaModel.setPessoa_telefone(rs.getString("pessoa_telefone"));

            pessoaModelList.add(pessoaModel);
        }
        return pessoaModelList.iterator();
    }

    @Override
    public Object getById(int n) throws Exception {
        String sql = "SELECT * FROM pessoas WHERE pessoa_idem = ?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1,n);
        ResultSet rs = preparedStatement.executeQuery();

        if(rs.next()){
            pessoaModel = new PessoaModel();
            pessoaModel.setPessoa_idem(rs.getInt("pessoa_idem"));
            pessoaModel.setPessoa_nome(rs.getString("pessoa_nome"));
            pessoaModel.setPessoa_email(rs.getString("pessoa_email"));
            pessoaModel.setPessoa_telefone(rs.getString("pessoa_telefone"));
        }

        return pessoaModel;
    }

    @Override
    public Object getByNome(String nome) throws Exception {
        String sql = "SELECT * FROM pessoas WHERE pessoa_nome = ?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1,nome);
        ResultSet rs = preparedStatement.executeQuery();

        if(rs.next()){
            pessoaModel = new PessoaModel();
            pessoaModel.setPessoa_idem(rs.getInt("pessoa_idem"));
            pessoaModel.setPessoa_nome(rs.getString("pessoa_nome"));
            pessoaModel.setPessoa_email(rs.getString("pessoa_email"));
            pessoaModel.setPessoa_telefone(rs.getString("pessoa_telefone"));
        }

        return pessoaModel;
    }
}
