package br.com.pi.dal;

import br.com.pi.model.AdministradorModel;
import br.com.pi.util.Conexao;
import br.com.pi.util.ICRUD_GENERIC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Iterator;

public class AdministradorDal implements ICRUD_GENERIC {

    private Connection conexao;
    AdministradorModel administradorModel;

    public AdministradorDal() throws Exception {
        conexao = Conexao.getInstance().getConnection();
    }

    @Override
    public void add(Object objeto) throws Exception {
        administradorModel = (AdministradorModel) objeto;
        String sql = "INSERT INTO administrador (adm_nome, adm_senha)" +
                "VALUES (?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1,administradorModel.getAdministrador_nome());
        ps.setObject(2,administradorModel.getAdministrador_senha());
        ps.executeUpdate();
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
