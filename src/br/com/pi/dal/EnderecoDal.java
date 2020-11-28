package br.com.pi.dal;

import br.com.pi.model.EnderecoModel;
import br.com.pi.util.Conexao;
import br.com.pi.util.ICRUD_GENERIC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Iterator;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EnderecoDal implements ICRUD_GENERIC<EnderecoModel> {

    private Connection conect;

    public EnderecoDal() throws Exception {
        this.conect = Conexao.getInstance().getConnection();
    }

    @Override
    public void add(EnderecoModel objeto) throws Exception {
        try {
            PreparedStatement ps = conect.prepareStatement("INSERT INTO endereco (\n"
                    + "	endereco_cep, endereco_cidade, endereco_bairro, endereco_rua,"
                    + " endereco_numero, endereco_complemento, endereco_estado)\n"
                    + "	VALUES (?, ?, ?, ?, ?, ?, ?);");

            ps.setString(1, objeto.getEndereco_cep());
            ps.setString(2, objeto.getEndereco_cidade());
            ps.setString(3, objeto.getEndereco_bairro());
            ps.setString(4, objeto.getEndereco_rua());
            ps.setObject(5, objeto.getEndereco_numero());
            ps.setString(6, objeto.getEndereco_complemento());
            ps.setString(7, objeto.getEndereco_estado());
            ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void delete(int n) throws Exception {
        PreparedStatement ps = conect.prepareStatement("DELETE FROM endereco WHERE endereco_ide=?");
        ps.setInt(1, n);
        ps.executeUpdate();
    }

    @Override
    public void update(EnderecoModel objeto) throws Exception {
        PreparedStatement ps = conect.prepareStatement("UPDATE public.endereco "
                + "SET endereco_cep=?, endereco_cidade=?, endereco_bairro=?,endereco_rua=?, "
                + "endereco_numero=?, endereco_complemento=?, endereco_pessoas_idem=?, "
                + "endereco_motorista_idem=?, endereco_ide=?, endereco_estado=?"
                + "WHERE endereco_ide=?;");
    }

    @Override
    public Iterator getAll() throws Exception {
        return null;
        
    }
    

    @Override
    public Object getById(int n) throws Exception {
        try {
            EnderecoModel endereco = new EnderecoModel();
            PreparedStatement ps = conect.prepareStatement("SELECT * FROM endereco"
                    + " WHERE endereco_ide=?");
            ps.setInt(1, n);
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                endereco.setEndereco_iden(result.getInt("endereco_ide"));
                endereco.setEndereco_cidade(result.getString("endereco_cidade"));
                endereco.setEndereco_bairro(result.getString("endereco_bairro"));
                endereco.setEndereco_cep(result.getString("endereco_cep"));
                endereco.setEndereco_rua(result.getString("endereco_rua"));
                endereco.setEndereco_numero(result.getInt("endereco_numero"));
                endereco.setEndereco_complemento(result.getString("endereco_complemento"));
                endereco.setEndereco_estado(result.getString("endereco_estado"));
            }
            return endereco;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public Object getByNome(String nome) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public Object getAllNome() throws Exception {
        return null;
         
     }

}
