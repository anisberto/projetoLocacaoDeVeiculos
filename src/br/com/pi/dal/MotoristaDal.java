package br.com.pi.dal;

import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.MotoristaModel;
import br.com.pi.util.Conexao;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.Date;
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

        } catch (Exception e) {
        }
    }

    @Override
    public Iterator getAll() throws Exception {
        try {

        } catch (Exception e) {
        }
        throw new IllegalArgumentException("Busca não concluida! Verifique sql");
    }

    @Override
    public MotoristaModel getById(int n) throws Exception {
        try {

        } catch (Exception e) {
        }
        throw new IllegalArgumentException("Busca não concluida! Verifique sql");
    }

    @Override
    public MotoristaModel getByNome(String nome) throws Exception {
        try {

        } catch (Exception e) {
        }
        throw new IllegalArgumentException("Busca não concluida! Verifique sql");
    }
}
