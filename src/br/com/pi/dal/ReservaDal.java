package br.com.pi.dal;

import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.PessoaModel;
import br.com.pi.model.ReservaModel;
import br.com.pi.model.VeiculoModel;
import br.com.pi.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReservaDal implements ICRUD_GENERIC {

    private Connection conexao;
    ReservaModel reservaModel = new ReservaModel();

    public ReservaDal() throws Exception {
        conexao = Conexao.getInstance().getConnection();
    }

    @Override
    public void add(Object objeto) throws Exception {
        reservaModel = (ReservaModel) objeto;
        String sql = "INSERT INTO reserva (reserva_dataFinal, reserva_dataDareserva,reserva_veiculos_idem"
                + "reserva_pessoas_idem) VALUES (?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, reservaModel.getReserva_dataExpiracao());
        ps.setObject(2, reservaModel.getReserva_dataExpiracao());
        ps.setObject(3, reservaModel.getReserva_veiculo());
        ps.setObject(4, reservaModel.getReserva_cliente());
        ps.executeUpdate();

    }

    @Override
    public void delete(int n) throws Exception {
        String sql = "DELETE FROM reserva WHERE reserva_idem=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, n);
        ps.executeUpdate();

    }

    @Override
    public void update(Object objeto) throws Exception {
        String sql = "UPDATE reserva SET reserva_dataFinal=?, reserva_dataDareserva=?,reserva_veiculos_idem=?"
                + "reserva_pessoas_idem=? WHERE reserva_idem=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, reservaModel.getReserva_dataExpiracao());
        ps.setObject(2, reservaModel.getReserva_dataExpiracao());
        ps.setObject(3, reservaModel.getReserva_veiculo());
        ps.setObject(4, reservaModel.getReserva_cliente());
        ps.setObject(5, reservaModel.getReserva_idem());
        ps.executeUpdate();

    }

    @Override
    public Iterator getAll() throws Exception {
        PessoaDal pessoaDal = new PessoaDal();
        VeiculoDal veiculoDal = new VeiculoDal();
        String sql = "SELECT * FROM reserva";
        List<ReservaModel> list = new ArrayList<>();

        Statement st = conexao.createStatement();;
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            reservaModel = new ReservaModel();
            reservaModel.setReserva_idem(rs.getInt("reserva_idem"));
            reservaModel.setReserva_dataReserva(rs.getString("reserva_dataDareserva"));
            reservaModel.setReserva_dataExpiracao(rs.getString("reserva_dataFinal"));
//            reservaModel.setReserva_dataReserva(rs.getDate("reserva_dataDareserva"));
//            reservaModel.setReserva_dataExpiracao(rs.getDate("reserva_dataFinal"));
            reservaModel.setReserva_cliente((PessoaModel) pessoaDal.getById(rs.getInt("reserva_pessoas_idem")));
            reservaModel.setReserva_veiculo(veiculoDal.getById(rs.getInt("reserva_veiculos_idem")));
            list.add(reservaModel);

        }

        return list.listIterator();
    }

    @Override
    public Object getById(int n) throws Exception {
        PessoaDal pessoaDal = new PessoaDal();
        VeiculoDal veiculoDal = new VeiculoDal();
        String sql = "SELECT * FROM reserva WHERE reserva_idem=?";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1, n);
        ResultSet rs = preparedStatement.executeQuery();

        if (rs.next()) {
            reservaModel = new ReservaModel();
            reservaModel.setReserva_idem(rs.getInt("reserva_idem"));
            reservaModel.setReserva_dataReserva(rs.getString("reserva_dataDareserva"));
            reservaModel.setReserva_dataExpiracao(rs.getString("reserva_dataFinal"));
//            reservaModel.setReserva_dataReserva(rs.getDate("reserva_dataDareserva"));
//            reservaModel.setReserva_dataExpiracao(rs.getDate("reserva_dataFinal"));
            reservaModel.setReserva_cliente((PessoaModel) pessoaDal.getById(rs.getInt("reserva_pessoas_idem")));
            reservaModel.setReserva_veiculo(veiculoDal.getById(rs.getInt("reserva_veiculos_idem")));

        }

        return reservaModel;
    }

    @Override
    public Object getByNome(String nome) throws Exception {
        return null;
    }

    @Override
    public int addReturn(Object objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
