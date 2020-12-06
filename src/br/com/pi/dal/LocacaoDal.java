package br.com.pi.dal;

import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.AdministradorModel;
import br.com.pi.model.LocacaoModel;
import br.com.pi.model.PessoaModel;
import br.com.pi.util.AdpterConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LocacaoDal implements ICRUD_GENERIC {

    private Connection conexao;
    LocacaoModel locacaoModel = new LocacaoModel();

    public LocacaoDal() throws Exception {
        conexao = new AdpterConexao().getConnectionAdapter();
    }

    @Override
    public void add(Object objeto) throws Exception {
        locacaoModel = (LocacaoModel) objeto;
        String sql = "INSERT INTO Locacao(locacao_dataDeRetirada,locacao_dataDeDevolucao,locacao_quilometragemInicial," +
                "locacao_quilometragemFinal,locacao_valorDaLocacao,locacao_valorCalcao,locacao_valorDoSeguro," +
                "locacao_multaAtraso,locacao_dataDoAlugamento,locacao_codigoDalocacao,locacao_tanqueCheio,locacao_veiculos_idem," +
                "locacao_pessoas_idem,locacao_motorista_idem,locacao_administrador_idem)" +
                "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, locacaoModel.getLocacao_dataRetirada());
        ps.setObject(2, locacaoModel.getLocacao_dataDevolucao());
        ps.setObject(3, locacaoModel.getLocacao_quilometragemInicial());
        ps.setObject(4, locacaoModel.getLocacao_quilometragemFinal());
        ps.setObject(5, locacaoModel.getLocacao_valorLocacao());
        ps.setObject(6, locacaoModel.getLocacao_valorCalcao());
        ps.setObject(7, locacaoModel.getLocacao_valorSeguro());
        ps.setObject(8, locacaoModel.getLocacao_multaAtraso());
        ps.setObject(9, locacaoModel.getLocacao_dataDeAlugamento());
        ps.setObject(10, locacaoModel.getLocacao_codigoDelocacao());
        ps.setObject(11, locacaoModel.getLocacao_tanqueCheio());
        ps.setObject(12, locacaoModel.getLocacao_veiculo());
        ps.setObject(13, locacaoModel.getLocacao_pessoa());
        ps.setObject(14, locacaoModel.getLocacao_motorista());
        ps.setObject(15, locacaoModel.getLocacao_administrador());
        ps.executeUpdate();

    }

    @Override
    public void delete(int n) throws Exception {
        String sql = "DELETE FROM Locacao WHERE locacao_idem=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, n);
        ps.executeUpdate();
    }

    @Override
    public void update(Object objeto) throws Exception {
        locacaoModel = (LocacaoModel) objeto;
        String sql = "UPDATE Locacao SET locacao_dataDeRetirada=?,locacao_dataDeDevolucao=?,locacao_quilometragemInicial=?," +
                "locacao_quilometragemFinal=?,locacao_valorDaLocacao=?,locacao_valorCalcao=?,locacao_valorDoSeguro=?," +
                "locacao_multaAtraso=?,locacao_dataDoAlugamento=?,locacao_codigoDalocacao=?,locacao_tanqueCheio=?,locacao_veiculos_idem=?," +
                "locacao_pessoas_idem=?,locacao_motorista_idem=?,locacao_administrador_idem=?" +
                "WHERE locacao_idem =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, locacaoModel.getLocacao_dataRetirada());
        ps.setObject(2, locacaoModel.getLocacao_dataDevolucao());
        ps.setObject(3, locacaoModel.getLocacao_quilometragemInicial());
        ps.setObject(4, locacaoModel.getLocacao_quilometragemFinal());
        ps.setObject(5, locacaoModel.getLocacao_valorLocacao());
        ps.setObject(6, locacaoModel.getLocacao_valorCalcao());
        ps.setObject(7, locacaoModel.getLocacao_valorSeguro());
        ps.setObject(8, locacaoModel.getLocacao_multaAtraso());
        ps.setObject(9, locacaoModel.getLocacao_dataDeAlugamento());
        ps.setObject(10, locacaoModel.getLocacao_codigoDelocacao());
        ps.setObject(11, locacaoModel.getLocacao_tanqueCheio());
        ps.setObject(12, locacaoModel.getLocacao_veiculo());
        ps.setObject(13, locacaoModel.getLocacao_pessoa());
        ps.setObject(14, locacaoModel.getLocacao_motorista());
        ps.setObject(15, locacaoModel.getLocacao_administrador());
        ps.setObject(16, locacaoModel.getLocacao_idem());
        ps.executeUpdate();
    }

    @Override
    public Iterator getAll() throws Exception {
        VeiculoDal veiculoDal = new VeiculoDal();
        PessoaDal pessoaDal = new PessoaDal();
        MotoristaDal motoristaDal = new MotoristaDal();
        AdministradorDal administradorDal = new AdministradorDal();
        String sql = "SELECT * FROM Locacao";
        List<LocacaoModel> lista = new ArrayList<>();

        Statement st = conexao.createStatement();;
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            locacaoModel = new LocacaoModel();
            locacaoModel.setLocacao_idem(rs.getInt("locacao_idem"));
            locacaoModel.setLocacao_dataRetirada(rs.getDate("locacao_dataDeRetirada"));
            locacaoModel.setLocacao_dataDevolucao(rs.getDate("locacao_dataDeDevolucao"));
            locacaoModel.setLocacao_quilometragemInicial(rs.getFloat("locacao_quilometragemInicial"));
            locacaoModel.setLocacao_quilometragemFinal(rs.getFloat("locacao_quilometragemFinal"));
            locacaoModel.setLocacao_valorLocacao(rs.getFloat("locacao_valorDaLocacao"));
            locacaoModel.setLocacao_valorCalcao(rs.getFloat("locacao_valorCalcao"));
            locacaoModel.setLocacao_valorSeguro(rs.getFloat("locacao_valorDoSeguro"));
            locacaoModel.setLocacao_multaAtraso(rs.getFloat("locacao_multaAtraso"));
            locacaoModel.setLocacao_dataDeAlugamento(rs.getDate("locacao_dataDoAlugamento"));
            locacaoModel.setLocacao_codigoDelocacao(rs.getInt("locacao_codigoDalocacao"));
            locacaoModel.setLocacao_tanqueCheio(rs.getInt("locacao_tanqueCheio"));
            locacaoModel.setLocacao_veiculo(veiculoDal.getById(rs.getInt("locacao_veiculos_idem")));
            locacaoModel.setLocacao_pessoa((PessoaModel) pessoaDal.getById(rs.getInt("locacao_pessoas_idem")));
            locacaoModel.setLocacao_motorista(motoristaDal.getById(rs.getInt("locacao_motorista_idem")));
            locacaoModel.setLocacao_administrador((AdministradorModel) administradorDal.getById(rs.getInt("locacao_administrador_idem")));
            lista.add(locacaoModel);
        }
        return lista.iterator();
    }

    @Override
    public Object getById(int n) throws Exception {
        String sql = "SELECT * FROM Locacao WHERE locacao_idem=?";
        VeiculoDal veiculoDal = new VeiculoDal();
        PessoaDal pessoaDal = new PessoaDal();
        MotoristaDal motoristaDal = new MotoristaDal();
        AdministradorDal administradorDal = new AdministradorDal();
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1,n);
        ResultSet rs = preparedStatement.executeQuery();
        if(rs.next()){
            locacaoModel = new LocacaoModel();
            locacaoModel.setLocacao_idem(rs.getInt("locacao_idem"));
            locacaoModel.setLocacao_dataRetirada(rs.getDate("locacao_dataDeRetirada"));
            locacaoModel.setLocacao_dataDevolucao(rs.getDate("locacao_dataDeDevolucao"));
            locacaoModel.setLocacao_quilometragemInicial(rs.getFloat("locacao_quilometragemInicial"));
            locacaoModel.setLocacao_quilometragemFinal(rs.getFloat("locacao_quilometragemFinal"));
            locacaoModel.setLocacao_valorLocacao(rs.getFloat("locacao_valorDaLocacao"));
            locacaoModel.setLocacao_valorCalcao(rs.getFloat("locacao_valorCalcao"));
            locacaoModel.setLocacao_valorSeguro(rs.getFloat("locacao_valorDoSeguro"));
            locacaoModel.setLocacao_multaAtraso(rs.getFloat("locacao_multaAtraso"));
            locacaoModel.setLocacao_dataDeAlugamento(rs.getDate("locacao_dataDoAlugamento"));
            locacaoModel.setLocacao_codigoDelocacao(rs.getInt("locacao_codigoDalocacao"));
            locacaoModel.setLocacao_tanqueCheio(rs.getInt("locacao_tanqueCheio"));
            locacaoModel.setLocacao_veiculo(veiculoDal.getById(rs.getInt("locacao_veiculos_idem")));
            locacaoModel.setLocacao_pessoa((PessoaModel) pessoaDal.getById(rs.getInt("locacao_pessoas_idem")));
            locacaoModel.setLocacao_motorista(motoristaDal.getById(rs.getInt("locacao_motorista_idem")));
            locacaoModel.setLocacao_administrador((AdministradorModel) administradorDal.getById(rs.getInt("locacao_administrador_idem")));

        }
        return locacaoModel;
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
