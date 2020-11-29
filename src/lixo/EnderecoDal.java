package lixo;

import br.com.pi.dal.EnderecoDal1;
import br.com.pi.model.EnderecoModel;
import br.com.pi.util.Conexao;
import br.com.pi.util.ICRUD_GENERIC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Iterator;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnderecoDal implements ICRUD_GENERIC {

    private Connection conect;
    private EnderecoModel end;

    public EnderecoDal() throws Exception {
        this.conect = Conexao.getInstance().getConnection();
    }

    @Override
    public void add(Object objeto) throws Exception {
        end = (EnderecoModel) objeto;
        try {

            PreparedStatement ps = conect.prepareStatement("INSERT INTO endereco (\n"
                    + "	endereco_cep, endereco_cidade, endereco_bairro, endereco_rua,"
                    + " endereco_numero, endereco_complemento, endereco_estado)\n"
                    + "	VALUES (?, ?, ?, ?, ?, ?, ?);");

            ps.setString(1, end.getEndereco_cep());
            ps.setString(2, end.getEndereco_cidade());
            ps.setString(3, end.getEndereco_bairro());
            ps.setString(4, end.getEndereco_rua());
            ps.setObject(5, end.getEndereco_numero());
            ps.setString(6, end.getEndereco_complemento());
            ps.setString(7, end.getEndereco_estado());
            ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void delete(int n) throws Exception {
        try {
            PreparedStatement ps = conect.prepareStatement("DELETE FROM endereco WHERE endereco_ide=?");
            ps.setInt(1, n);
            ps.executeUpdate();

        } catch (SQLException erro) {
            try {
                throw new Exception("Ocorreu um erro ao deletar este registro!\n"
                        + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(EnderecoDal1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void update(Object objeto) throws Exception {
        end = (EnderecoModel) objeto;
        try {
            PreparedStatement prep = conect.prepareStatement("UPDATE endereco SET "
                    + "endereco_cep=?, endereco_cidade=?, "
                    + "endereco_bairro=?, endereco_rua=?, endereco_numero=?, "
                    + "endereco_complemento=?, endereco_estado=? "
                    + "WHERE endereco_ide=?;");

            prep.setString(1, end.getEndereco_cep());
            prep.setString(2, end.getEndereco_cidade());
            prep.setString(3, end.getEndereco_bairro());
            prep.setString(4, end.getEndereco_rua());
            prep.setInt(5, end.getEndereco_numero());
            prep.setString(6, end.getEndereco_complemento());
            prep.setString(7, end.getEndereco_estado());
            prep.setInt(8, end.getEndereco_iden());
            prep.executeUpdate();

        } catch (Exception erro) {
            try {
                throw new Exception("Ocorreu um erro ao alterar este registro\n"
                        + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(EnderecoDal1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public Iterator getAll() throws Exception {
        String sql = "SELECT * FROM endereco";
        List<EnderecoModel> endereco = new ArrayList<>();

        Statement statement = conect.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {
            EnderecoModel novoEndereco = new EnderecoModel();
            novoEndereco.setEndereco_iden(rs.getInt("endereco_ide"));
            novoEndereco.setEndereco_cidade(rs.getString("endereco_cidade"));
            novoEndereco.setEndereco_bairro(rs.getString("endereco_bairro"));
            novoEndereco.setEndereco_cep(rs.getString("endereco_cep"));
            novoEndereco.setEndereco_rua(rs.getString("endereco_rua"));
            novoEndereco.setEndereco_numero(rs.getInt("endereco_numero"));
            novoEndereco.setEndereco_complemento(rs.getString("endereco_complemento"));
            novoEndereco.setEndereco_estado(rs.getString("endereco_estado"));
            
            endereco.add(novoEndereco);
        }
        return endereco.iterator();
    }

    @Override
    public Object getById(int n) throws Exception {
        EnderecoModel retEndereco = new EnderecoModel();
        try {
            String sql = "SELECT * FROM endereco WHERE endereco_ide=?";
            PreparedStatement preparedStatement = conect.prepareStatement(sql);
            preparedStatement.setInt(1, n);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                retEndereco.setEndereco_iden(rs.getInt("endereco_ide"));
                retEndereco.setEndereco_cidade(rs.getString("endereco_cidade"));
                retEndereco.setEndereco_bairro(rs.getString("endereco_bairro"));
                retEndereco.setEndereco_cep(rs.getString("endereco_cep"));
                retEndereco.setEndereco_rua(rs.getString("endereco_rua"));
                retEndereco.setEndereco_numero(rs.getInt("endereco_numero"));
                retEndereco.setEndereco_complemento(rs.getString("endereco_complemento"));
                retEndereco.setEndereco_estado(rs.getString("endereco_estado"));
                System.out.println(sql);
            }
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public Object getByNome(String nome) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
