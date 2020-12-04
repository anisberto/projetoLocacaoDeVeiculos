
package br.com.pi.dal;

import br.com.pi.model.MarcaModel;
import br.com.pi.util.Conexao;
import br.com.pi.interfaces.ICRUD_GENERIC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Anthonny Max
 */
public class MarcaDal implements ICRUD_GENERIC<MarcaModel> {

    private Connection conexao;
    MarcaModel marcaModel = new MarcaModel();

    public MarcaDal() throws Exception {
        this.conexao = Conexao.getInstance().getConnection();
    }


    @Override
    public void add(MarcaModel objeto) throws Exception {
        marcaModel = (MarcaModel) objeto;
        String sql = "INSERT INTO marca(marca_descricao)" +
                "VALUES (?)";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, marcaModel.getMarca_descricao());
        ps.executeUpdate();

    }

    @Override
    public void delete(int n) throws Exception {
        String sql = "DELETE FROM marca WHERE marca_idem =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1,n);
        ps.executeUpdate();

    }

    @Override
    public void update(MarcaModel objeto) throws Exception {
        String sql ="UPDATE marca SET marca_descricao =?" +
                " WHERE marca_idem =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, objeto.getMarca_descricao());
        ps.setObject(2, objeto.getMarca_idem());
        ps.executeUpdate();

    }

    @Override
    public Iterator getAll() throws Exception {
        String sql = "SELECT * FROM marca";
        List<MarcaModel> pessoaModelList = new ArrayList<MarcaModel>();

        Statement st = conexao.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){
            marcaModel = new MarcaModel();
            marcaModel.setMarca_idem(rs.getInt("marca_idem"));
            marcaModel.setMarca_descricao(rs.getString("marca_descricao"));

            pessoaModelList.add(marcaModel);
        }
        return pessoaModelList.iterator();
    }

    @Override
    public MarcaModel getById(int n) throws Exception {
        String sql = "SELECT * FROM marca WHERE marca_idem = ?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1,n);
        ResultSet rs = preparedStatement.executeQuery();

        if(rs.next()){
            marcaModel = new MarcaModel();
            marcaModel.setMarca_idem(rs.getInt("marca_idem"));
            marcaModel.setMarca_descricao(rs.getString("marca_descricao"));
        }

        return marcaModel;
    }

    @Override
    public MarcaModel getByNome(String nome) throws Exception {
        MarcaModel marcaByName = new MarcaModel();
        String sql = "SELECT * FROM marca WHERE marca_descricao = ?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1,nome);
        ResultSet rs = preparedStatement.executeQuery();

        if(rs.next()){
            marcaByName = new MarcaModel();
            marcaByName.setMarca_idem(rs.getInt("marca_idem"));
            marcaByName.setMarca_descricao(rs.getString("marca_descricao"));
        }

        return marcaByName;
    }

    @Override
    public int addReturn(MarcaModel objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
