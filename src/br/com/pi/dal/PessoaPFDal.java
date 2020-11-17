package br.com.pi.dal;

import br.com.pi.model.PessoaPFModel;
import br.com.pi.util.Conexao;
import br.com.pi.util.ICRUD_GENERIC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Iterator;

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
        ps.executeUpdate();

    }

    @Override
    public void delete(int n) throws Exception {
        String sql = "DELETE FROM pessoas_pf WHERE pf_pessoas";

    }

    @Override
    public void update(Object objeto) throws Exception {

    }

    @Override
    public Iterator getAll() throws Exception {
        return null;
    }

    @Override
    public Object getById(int n) throws Exception {
        return null;
    }

    @Override
    public Object getByNome(String nome) throws Exception {
        return null;
    }
}
