package br.com.pi.dal;

import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.PessoaModel;
import br.com.pi.model.ReservaModel;
import br.com.pi.model.VeiculoModel;
import br.com.pi.util.AdpterConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReservaDal implements ICRUD_GENERIC {

    private Connection conexao;
    ReservaModel reserva = new ReservaModel();

    public ReservaDal() throws Exception {
        conexao = new AdpterConexao().getConnectionAdapter();
    }

    @Override
    public void add(Object objeto) throws Exception {


        try {
            reserva = (ReservaModel) objeto;

            String sql = "INSERT INTO reserva (reserva_datafinal,reserva_dataDareserva ,reserva_veiculos_idem, reserva_pessoas_idem) VALUES (?, ?, ?,?)";

            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setDate(1,  (new java.sql.Date(new Date(reserva.getReserva_dataExpiracao()).getTime())));
            ps.setDate(2,  (new java.sql.Date(new java.util.Date(reserva.getReserva_dataReserva()).getTime())));
            ps.setObject(3, reserva.getReserva_veiculo().getVeiculo_idem());
            ps.setObject(4, reserva.getReserva_cliente().getPessoa_idem());
            ps.executeUpdate();

        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public void delete(int n) throws Exception {
        try {
            String sql = "DELETE FROM reserva WHERE reserva_idem=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setObject(1, n);
            ps.executeUpdate();

        } catch (Exception e) {
            throw new Exception("Erro ao deletar: dal.error ");
        }

    }

    @Override
    public void update(Object objeto) throws Exception {

        try {
            String sql = "UPDATE reserva SET reserva_datafinal=?, reserva_datadareserva=?"
                    + "reserva_pessoas_idem=? WHERE reserva_idem=?";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setObject(1, reserva.getReserva_dataExpiracao());
            ps.setObject(2, reserva.getReserva_dataReserva());
            //ps.setObject(3, reserva.getReserva_veiculo());

            ps.setObject(3, reserva.getReserva_idem());
            ps.executeUpdate();

        } catch (Exception e) {
            throw new Exception("Erro ao atualizar: dal.error ");
        }

    }

    @Override
    public Iterator getAll() throws Exception {
        try {
            PessoaDal pessoaDal = new PessoaDal();
            VeiculoDal veiculoDal = new VeiculoDal();
            String sql = "SELECT * FROM reserva";
            List<ReservaModel> list = new ArrayList<>();

            Statement st = conexao.createStatement();;
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                reserva = new ReservaModel();
                reserva.setReserva_idem(rs.getInt("reserva_idem"));
                reserva.setReserva_dataReserva(rs.getString("reserva_dataDareserva"));
                reserva.setReserva_dataExpiracao(rs.getString("reserva_dataFinal"));
                reserva.setReserva_cliente((PessoaModel) pessoaDal.getById(rs.getInt("reserva_pessoas_idem")));
                reserva.setReserva_veiculo(veiculoDal.getById(rs.getInt( "reserva_veiculos_idem")));

                list.add(reserva);
            }

            return list.iterator();
            
        } catch (Exception e) {
            throw new Exception("Erro ao Listar: " + e.getMessage());
        }
    }

    @Override
//    public Object getById(int n) throws Exception {
    public ReservaModel getById(int n) throws Exception {
        PessoaDal pessoaDal = new PessoaDal();
        VeiculoDal veiculoDal = new VeiculoDal();
        String sql = "SELECT * FROM reserva WHERE reserva_idem=?";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1, n);
        ResultSet rs = preparedStatement.executeQuery();

        if (rs.next()) {
            reserva = new ReservaModel();
            reserva.setReserva_idem(rs.getInt("reserva_idem"));
            reserva.setReserva_dataReserva(rs.getString("reserva_dataDareserva"));
            reserva.setReserva_dataExpiracao(rs.getString("reserva_dataFinal"));
//            reserva.setReserva_dataReserva(rs.getDate("reserva_dataDareserva"));
//            reserva.setReserva_dataExpiracao(rs.getDate("reserva_dataFinal"));
            reserva.setReserva_cliente((PessoaModel) pessoaDal.getById(rs.getInt("reserva_pessoas_idem")));
            reserva.setReserva_veiculo(veiculoDal.getById(rs.getInt("reserva_veiculos_idem")));

        }
        return reserva;
    }

    @Override
    //public Object getByNome(String nome) throws Exception {
    public ReservaModel getByNome(String nome) throws Exception {
        ReservaModel res = new ReservaModel();
        String sql = "SELECT * FROM administrador WHERE reserva_datafinal=?";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, nome);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            res = new ReservaModel();
            res.setReserva_dataExpiracao(rs.getString("reserva_datafinal"));
        }
        return res;
    }

    @Override
    public int addReturn(Object objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
