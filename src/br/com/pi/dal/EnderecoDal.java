package br.com.pi.dal;

import br.com.pi.model.EnderecoModel;
import br.com.pi.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import interfaces.EnderecoInterface;

public class EnderecoDal implements EnderecoInterface {

    private Connection conect;

    public EnderecoDal() throws Exception {
        this.conect = Conexao.getInstance().getConnection();
    }

    @Override
    public void adicionarEndereco(EnderecoModel endereco) {
        try {
            String sql = "INSERT INTO endereco (\n" +
"	endereco_cep, endereco_cidade, endereco_bairro, endereco_rua, endereco_numero, endereco_complemento, endereco_estado)\n" +
"	VALUES (?, ?, ?, ?, ?, ?, ?);";

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateEndereco(EnderecoModel endereco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EnderecoModel> getAllUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EnderecoModel getUsuarioById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EnderecoModel findUsuarioName(String cep) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
