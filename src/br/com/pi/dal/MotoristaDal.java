package br.com.pi.dal;

import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.MotoristaModel;
import br.com.pi.util.Conexao;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class MotoristaDal implements ICRUD_GENERIC<MotoristaModel> {

    Connection conec;

    public MotoristaDal() throws Exception {
        conec = Conexao.getInstance().getConnection();
    }

    @Override
    public void add(MotoristaModel objeto) throws Exception {
        try {
            PreparedStatement prep = conec.prepareStatement("INSERT INTO motorista(\n"
                    + "	motorista_categoria, motorista_datadevalidade, \n"
                    + "	motorista_imagem, motorista_numerodoregistro, motorista_cpf, motorista_nome, \n"
                    + "	motorista_rg, motorista_telefone, motorista_email)\n"
                    + "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);");
            prep.setString(5, objeto.getMotorista_cpf());
            prep.setString(6, objeto.getMotorista_nome());
            prep.setString(7, objeto.getMotorista_rg());
            prep.setString(8, objeto.getMotorista_telefone());
            prep.setString(9, objeto.getMotorista_email());
            prep.setString(1, objeto.getCnh_categoria());
            prep.setDate(2, new java.sql.Date(objeto.getCnh_dataValidade().getTime()));
            prep.setBytes(3, objeto.getCnh_imagem());
            prep.setInt(4, objeto.getCnh_numeroRegistro());
            prep.executeLargeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public void delete(int n) throws Exception {
        try {
            PreparedStatement prep = conec.prepareStatement("DELETE FROM motorista\n"
                    + "	WHERE motorista_idem=?;");
            prep.setInt(1, n);
            prep.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public void update(MotoristaModel objeto) throws Exception {
        try {
            PreparedStatement prep = conec.prepareStatement(
                    "UPDATE motorista\n"
                    + "	SET motorista_categoria=?, motorista_datadevalidade=?, motorista_imagem=?,\n"
                    + "	motorista_numerodoregistro=?, motorista_cpf=?, motorista_nome=?, \n"
                    + "	motorista_rg=?, motorista_telefone=?, \n"
                    + "	motorista_email=?\n"
                    + "	WHERE motorista_idem=?;");
            prep.setString(1, objeto.getCnh_categoria());
            prep.setDate(2, new java.sql.Date(objeto.getCnh_dataValidade().getTime()));
            prep.setBytes(3, objeto.getCnh_imagem());
            prep.setInt(4, objeto.getCnh_numeroRegistro());
            prep.setString(5, objeto.getMotorista_cpf());
            prep.setString(6, objeto.getMotorista_nome());
            prep.setString(7, objeto.getMotorista_rg());
            prep.setString(8, objeto.getMotorista_telefone());
            prep.setString(9, objeto.getMotorista_email());
            prep.setInt(10, objeto.getMotorista_idem());
            prep.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public Iterator getAll() throws Exception {
        ArrayList<MotoristaModel> listaDeMotoristas = new ArrayList<>();
        try {
            Statement stat = conec.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM motorista");
            while (result.next()) {
                MotoristaModel motorista = new MotoristaModel();
                motorista.setMotorista_idem(result.getInt("motorista_idem"));
                motorista.setMotorista_cpf(result.getString("motorista_cpf"));
                motorista.setMotorista_nome(result.getString("motorista_nome"));
                motorista.setMotorista_rg(result.getString("motorista_rg"));
                motorista.setMotorista_telefone(result.getString("motorista_telefone"));
                motorista.setMotorista_email(result.getString("motorista_email"));
                motorista.setCnh_categoria(result.getString("motorista_categoria"));
                motorista.setCnh_dataValidade(result.getDate("motorista_datadevalidade"));
                motorista.setCnh_imagem(result.getBytes("motorista_imagem"));
                motorista.setCnh_numeroRegistro(result.getInt("motorista_numerodoregistro"));
                listaDeMotoristas.add(motorista);
            }
            return listaDeMotoristas.iterator();
        } catch (Exception e) {
        }
        throw new IllegalArgumentException("Busca não concluida! Verifique sql");
    }

    @Override
    public MotoristaModel getById(int n) throws Exception {
        try {
            PreparedStatement prep = conec.prepareStatement("SELECT * FROM motorista WHERE motorista_idem=?");
            prep.setInt(1, n);
            ResultSet result = prep.executeQuery();
            MotoristaModel motorista = new MotoristaModel();
            while (result.next()) {
                motorista.setMotorista_idem(result.getInt("motorista_idem"));
                motorista.setMotorista_cpf(result.getString("motorista_cpf"));
                motorista.setMotorista_nome(result.getString("motorista_nome"));
                motorista.setMotorista_rg(result.getString("motorista_rg"));
                motorista.setMotorista_telefone(result.getString("motorista_telefone"));
                motorista.setMotorista_email(result.getString("motorista_email"));
                motorista.setCnh_categoria(result.getString("motorista_categoria"));
                motorista.setCnh_dataValidade(result.getDate("motorista_datadevalidade"));
                motorista.setCnh_imagem(result.getBytes("motorista_imagem"));
                motorista.setCnh_numeroRegistro(result.getInt("motorista_numerodoregistro"));
            }
            return motorista;
        } catch (Exception e) {
        }
        throw new IllegalArgumentException("Busca não concluida! Verifique sql");
    }

    @Override
    public MotoristaModel getByNome(String nome) throws Exception {
        try {
            PreparedStatement prep = conec.prepareStatement("SELECT * FROM motorista WHERE motorista_nome=?");
            prep.setString(1, nome);
            ResultSet result = prep.executeQuery();
            MotoristaModel motorista = new MotoristaModel();
            while (result.next()) {
                motorista.setMotorista_idem(result.getInt("motorista_idem"));
                motorista.setMotorista_cpf(result.getString("motorista_cpf"));
                motorista.setMotorista_nome(result.getString("motorista_nome"));
                motorista.setMotorista_rg(result.getString("motorista_rg"));
                motorista.setMotorista_telefone(result.getString("motorista_telefone"));
                motorista.setMotorista_email(result.getString("motorista_email"));
                motorista.setCnh_categoria(result.getString("motorista_categoria"));
                motorista.setCnh_dataValidade(result.getDate("motorista_datadevalidade"));
                motorista.setCnh_imagem(result.getBytes("motorista_imagem"));
                motorista.setCnh_numeroRegistro(result.getInt("motorista_numerodoregistro"));
            }
            return motorista;
        } catch (Exception e) {
        }
        throw new IllegalArgumentException("Busca não concluida! Verifique sql");
    }
}
