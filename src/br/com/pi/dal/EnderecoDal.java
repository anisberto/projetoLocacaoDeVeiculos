package br.com.pi.dal;

import br.com.pi.model.EnderecoModel;
import br.com.pi.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import interfaces.EnderecoInterface;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnderecoDal implements EnderecoInterface {

    private Connection conect;

    public EnderecoDal() throws Exception {
        this.conect = Conexao.getInstance().getConnection();
    }

    @Override
    public void adicionarEndereco(EnderecoModel endereco) {
        try {
            String sql = "INSERT INTO endereco (\n"
                    + "	endereco_cep, endereco_cidade, endereco_bairro, endereco_rua, endereco_numero, endereco_complemento, endereco_estado)\n"
                    + "	VALUES (?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement ps = conect.prepareStatement(sql);
            ps.setString(1, endereco.getEndereco_cep());
            ps.setString(2, endereco.getEndereco_cidade());
            ps.setString(3, endereco.getEndereco_bairro());
            ps.setString(4, endereco.getEndereco_rua());
            ps.setObject(5, endereco.getEndereco_numero());
            ps.setString(6, endereco.getEndereco_complemento());
            ps.setString(7, endereco.getEndereco_estado());
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void deleteEndereco(int endereco) {
        String sql = "DELETE FROM endereco WHERE endereco_ide=?";
        try {
            PreparedStatement preparedStatement = conect.prepareStatement(sql);

            preparedStatement.setInt(1, endereco);
            preparedStatement.executeUpdate();

        } catch (SQLException erro) {
            try {
                throw new Exception("Ocorreu um erro ao deletar este registro!\n"
                        + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(EnderecoDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void updateEndereco(EnderecoModel endereco) {
        String sql = "UPDATE aluno set endereco_rua=? where endereco_ide=?";

        try {
            PreparedStatement preparedStatement = conect.prepareStatement(sql);

            preparedStatement.setString(1, endereco.getEndereco_rua());
            preparedStatement.setInt(2, endereco.getEndereco_iden());
            preparedStatement.executeUpdate();

        } catch (Exception erro) {
            try {
                throw new Exception("Ocorreu um erro ao alterar este registro\n"
                        + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(EnderecoDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public ArrayList<EnderecoModel> getAllEndereco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        ArrayList<EnderecoModel> endereco = new ArrayList<EnderecoModel>();
//        String sql = "SELECT * FROM endereco";
//        try {
//            Statement statement = conect.createStatement();
//            ResultSet rs = statement.executeQuery(sql);
//
//            while (rs.next()) {               
//                EnderecoModel novoEndereco = new EnderecoModel();
//                novoEndereco.setEndereco_iden(rs.getInt("endereco_ide"));
//                novoEndereco.setEndereco_cidade(rs.getString("endereco_cidade"));
//                novoEndereco.setEndereco_bairro(rs.getString("endereco_bairro"));
//                novoEndereco.setEndereco_cep(rs.getString("endereco_cep"));
//                novoEndereco.setEndereco_rua(rs.getString("endereco_rua"));
//                novoEndereco.setEndereco_numero(rs.getInt("endereco_numero"));
//                novoEndereco.setEndereco_complemento(rs.getString("endereco_complemento"));
//                novoEndereco.setEndereco_estado(rs.getString("endereco_estado"));
//                endereco.add(novoEndereco);
//            }
//
//        } catch (Exception erro) {
//            try {
//                throw new Exception("Ocorreu um erro ao consultar os registros de fabricantes\n"
//                        + erro.getMessage());
//            } catch (Exception ex) {
//                Logger.getLogger(EnderecoDal.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        return endereco;
    }

    @Override
    public EnderecoModel getEnderecoById(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        EnderecoModel retEndereco = new EnderecoModel();
        try {
            String sql = "SELECT * FROM endereco WHERE endereco_ide=?";
            PreparedStatement preparedStatement = conect.prepareStatement(sql);
            preparedStatement.setInt(1, id);
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

        } catch (Exception erro) {
            try {
                throw new Exception("Erro ao buscar no banco de dados: !!\n" + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(EnderecoDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return retEndereco;
    }

    @Override
    public EnderecoModel findEnderecoName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
