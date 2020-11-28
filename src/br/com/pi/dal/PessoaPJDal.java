package br.com.pi.dal;

import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.PessoaPFModel;
import br.com.pi.util.Conexao;

import java.sql.Connection;
import java.util.Iterator;

public class PessoaPJDal implements ICRUD_GENERIC {

    private Connection conexao;
    PessoaPFModel pessoaPFModel = new PessoaPFModel();

    public PessoaPJDal() throws Exception {
        conexao = Conexao.getInstance().getConnection();
    }

    @Override
    public void add(Object objeto) throws Exception {
        String sql = "INSERT INTO pessoas_pj (pj_cnpj,pj_nome_fantasia,pj_razao_social,pj_pessoas_idem)" +
                "VALUES";


    }

    @Override
    public void delete(int n) throws Exception {

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
