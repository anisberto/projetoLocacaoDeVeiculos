package br.com.pi.dal;

import br.com.pi.model.AdministradorModel;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.util.AdpterConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdministradorDal implements ICRUD_GENERIC<AdministradorModel> {

    private Connection conexao;
    AdministradorModel administradorModel;

    public AdministradorDal() throws Exception {
        conexao = new AdpterConexao().getConnectionAdapter();
    }

    @Override
    public void add(AdministradorModel objeto) throws Exception {
        administradorModel = (AdministradorModel) objeto;
        String sql = "INSERT INTO administrador (adm_nome, adm_senha,adm_usuario)"
                + "VALUES (?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, administradorModel.getAdministrador_nome());
        ps.setObject(2, administradorModel.getAdministrador_senha());
        ps.setObject(3, administradorModel.getAdministrador_usuario());
        ps.executeUpdate();
    }

    @Override
    public void delete(int n) throws Exception {
        String sql = "DELETE FROM administrador WHERE adm_idem =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, n);
        ps.executeUpdate();
    }

    @Override
    public void update(AdministradorModel objeto) throws Exception {
        PreparedStatement ps = conexao.prepareStatement("UPDATE administrador\n"
                + "	SET adm_nome=?, adm_senha=?, adm_usuario=?\n"
                + "	WHERE adm_idem=?;");
        ps.setObject(1, objeto.getAdministrador_nome());
        ps.setObject(2, objeto.getAdministrador_senha());
        ps.setObject(3, objeto.getAdministrador_usuario());
        ps.setObject(4, objeto.getAdministrador_idem());
        ps.executeUpdate();
    }

    @Override
    public Iterator getAll() throws Exception {
        String sql = "SELECT * FROM administrador";
        List<AdministradorModel> list = new ArrayList<>();
        Statement st = conexao.createStatement();;
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            AdministradorModel administradorModel = new AdministradorModel();
            administradorModel.setAdministrador_idem(rs.getInt("adm_idem"));
            administradorModel.setAdministrador_nome(rs.getString("adm_nome"));
            administradorModel.setAdministrador_senha(rs.getString("adm_senha"));
            administradorModel.setAdministrador_usuario(rs.getString("adm_usuario"));
            list.add(administradorModel);
        }
        return list.iterator();
    }

    @Override
    public AdministradorModel getById(int n) throws Exception {
        String sql = "SELECT * FROM administrador WHERE adm_idem=?";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1, n);
        ResultSet rs = preparedStatement.executeQuery();
        AdministradorModel administradorModelId = new AdministradorModel();
        if (rs.next()) {
            administradorModelId.setAdministrador_idem(rs.getInt("adm_idem"));
            administradorModelId.setAdministrador_nome(rs.getString("adm_nome"));
            administradorModelId.setAdministrador_senha(rs.getString("adm_senha"));
            administradorModelId.setAdministrador_usuario(rs.getString("adm_usuario"));
        }
        return administradorModelId;
    }

    @Override
    public AdministradorModel getByNome(String nome) throws Exception {
        AdministradorModel adm = new AdministradorModel();
        String sql = "SELECT * FROM administrador WHERE adm_usuario=? or adm_nome=?";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, nome);
        preparedStatement.setString(2, nome);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            adm = new AdministradorModel();
            adm.setAdministrador_idem(rs.getInt("adm_idem"));
            adm.setAdministrador_nome(rs.getString("adm_nome"));
            adm.setAdministrador_senha(rs.getString("adm_senha"));
            adm.setAdministrador_usuario(rs.getString("adm_usuario"));
        }
        return adm;
    }

    @Override
    public int addReturn(AdministradorModel objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
