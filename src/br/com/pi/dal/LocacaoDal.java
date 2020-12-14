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

public class LocacaoDal implements ICRUD_GENERIC<LocacaoModel> {

    private Connection conexao;
    LocacaoModel locacaoModel = new LocacaoModel();

    public LocacaoDal() throws Exception {
        conexao = new AdpterConexao().getConnectionAdapter();
    }

    @Override
    public void add(LocacaoModel objeto) throws Exception {
        locacaoModel = (LocacaoModel) objeto;
        String sql = "INSERT INTO Locacao(locacao_dataDeRetirada,locacao_dataDeDevolucao,locacao_quilometragemInicial,"
                + "locacao_quilometragemFinal,locacao_valorDaLocacao,locacao_valorCalcao,locacao_valorDoSeguro,"
                + "locacao_multaAtraso,locacao_dataDoAlugamento,locacao_codigoDalocacao,locacao_tanqueCheio,locacao_veiculos_idem,"
                + "locacao_pessoas_idem,locacao_motorista_idem,locacao_administrador_idem)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, objeto.getLocacao_dataRetirada());
        ps.setObject(2,objeto.getLocacao_dataDevolucao());
        ps.setFloat(3, objeto.getLocacao_quilometragemInicial());
        ps.setFloat(4, objeto.getLocacao_quilometragemFinal());
        ps.setFloat(5, objeto.getLocacao_valorLocacao());
        ps.setFloat(6, objeto.getLocacao_valorCalcao());
        ps.setFloat(7, objeto.getLocacao_valorSeguro());
        ps.setFloat(8, objeto.getLocacao_multaAtraso());
        ps.setDate(9, new java.sql.Date(objeto.getLocacao_dataDeAlugamento().getTime()));
        ps.setInt(10, objeto.getLocacao_codigoDelocacao());
        ps.setInt(11, objeto.getLocacao_tanqueCheio());
        ps.setInt(12, objeto.getLocacao_veiculo().getVeiculo_idem());
        ps.setInt(13, objeto.getLocacao_pessoa().getPessoa_idem());
        ps.setInt(14, objeto.getLocacao_motorista().getMotorista_idem());
        ps.setInt(15, objeto.getLocacao_administrador().getAdministrador_idem());
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
    public void update(LocacaoModel objeto) throws Exception {
        locacaoModel = (LocacaoModel) objeto;
        String sql = "UPDATE Locacao SET locacao_dataDeRetirada=?,locacao_dataDeDevolucao=?,locacao_quilometragemInicial=?,"
                + "locacao_quilometragemFinal=?,locacao_valorDaLocacao=?,locacao_valorCalcao=?,locacao_valorDoSeguro=?,"
                + "locacao_multaAtraso=?,locacao_dataDoAlugamento=?,locacao_codigoDalocacao=?,locacao_tanqueCheio=?,locacao_veiculos_idem=?,"
                + "locacao_pessoas_idem=?,locacao_motorista_idem=?,locacao_administrador_idem=?"
                + "WHERE locacao_idem =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setDate(1, new java.sql.Date(objeto.getLocacao_dataRetirada().getTime()));
        ps.setDate(2, new java.sql.Date(objeto.getLocacao_dataDevolucao().getTime()));
        ps.setFloat(3, objeto.getLocacao_quilometragemInicial());
        ps.setFloat(4, objeto.getLocacao_quilometragemFinal());
        ps.setFloat(5, objeto.getLocacao_valorLocacao());
        ps.setFloat(6, objeto.getLocacao_valorCalcao());
        ps.setFloat(7, objeto.getLocacao_valorSeguro());
        ps.setFloat(8, objeto.getLocacao_multaAtraso());
        ps.setDate(9, new java.sql.Date(objeto.getLocacao_dataDeAlugamento().getTime()));
        ps.setInt(10, objeto.getLocacao_codigoDelocacao());
        ps.setInt(11, objeto.getLocacao_tanqueCheio());
        ps.setInt(12, objeto.getLocacao_veiculo().getVeiculo_idem());
        ps.setInt(13, objeto.getLocacao_pessoa().getPessoa_idem());
        ps.setInt(14, objeto.getLocacao_motorista().getMotorista_idem());
        ps.setInt(15, objeto.getLocacao_administrador().getAdministrador_idem());
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
        while (rs.next()) {
            LocacaoModel locaModel = new LocacaoModel();
            locaModel.setLocacao_idem(rs.getInt("locacao_idem"));
            locaModel.setLocacao_dataRetirada(rs.getDate("locacao_dataDeRetirada"));
            locaModel.setLocacao_dataDevolucao(rs.getDate("locacao_dataDeDevolucao"));
            locaModel.setLocacao_quilometragemInicial(rs.getFloat("locacao_quilometragemInicial"));
            locaModel.setLocacao_quilometragemFinal(rs.getFloat("locacao_quilometragemFinal"));
            locaModel.setLocacao_valorLocacao(rs.getFloat("locacao_valorDaLocacao"));
            locaModel.setLocacao_valorCalcao(rs.getFloat("locacao_valorCalcao"));
            locaModel.setLocacao_valorSeguro(rs.getFloat("locacao_valorDoSeguro"));
            locaModel.setLocacao_multaAtraso(rs.getFloat("locacao_multaAtraso"));
            locaModel.setLocacao_dataDeAlugamento(rs.getDate("locacao_dataDoAlugamento"));
            locaModel.setLocacao_codigoDelocacao(rs.getInt("locacao_codigoDalocacao"));
            locaModel.setLocacao_tanqueCheio(rs.getInt("locacao_tanqueCheio"));
            locaModel.setLocacao_veiculo(veiculoDal.getById(rs.getInt("locacao_veiculos_idem")));
            locaModel.setLocacao_pessoa((PessoaModel) pessoaDal.getById(rs.getInt("locacao_pessoas_idem")));
            locaModel.setLocacao_motorista(motoristaDal.getById(rs.getInt("locacao_motorista_idem")));
            locaModel.setLocacao_administrador((AdministradorModel) administradorDal.getById(rs.getInt("locacao_administrador_idem")));
            lista.add(locaModel);
        }
        return lista.iterator();
    }

    @Override
    public LocacaoModel getById(int n) throws Exception {
        String sql = "SELECT * FROM Locacao WHERE locacao_idem=?";
        VeiculoDal veiculoDal = new VeiculoDal();
        PessoaDal pessoaDal = new PessoaDal();
        MotoristaDal motoristaDal = new MotoristaDal();
        AdministradorDal administradorDal = new AdministradorDal();
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1, n);
        ResultSet rs = preparedStatement.executeQuery();
            LocacaoModel locaModelBuId = new LocacaoModel();
        if (rs.next()) {
            locaModelBuId.setLocacao_idem(rs.getInt("locacao_idem"));
            locaModelBuId.setLocacao_dataRetirada(rs.getDate("locacao_dataDeRetirada"));
            locaModelBuId.setLocacao_dataDevolucao(rs.getDate("locacao_dataDeDevolucao"));
            locaModelBuId.setLocacao_quilometragemInicial(rs.getFloat("locacao_quilometragemInicial"));
            locaModelBuId.setLocacao_quilometragemFinal(rs.getFloat("locacao_quilometragemFinal"));
            locaModelBuId.setLocacao_valorLocacao(rs.getFloat("locacao_valorDaLocacao"));
            locaModelBuId.setLocacao_valorCalcao(rs.getFloat("locacao_valorCalcao"));
            locaModelBuId.setLocacao_valorSeguro(rs.getFloat("locacao_valorDoSeguro"));
            locaModelBuId.setLocacao_multaAtraso(rs.getFloat("locacao_multaAtraso"));
            locaModelBuId.setLocacao_dataDeAlugamento(rs.getDate("locacao_dataDoAlugamento"));
            locaModelBuId.setLocacao_codigoDelocacao(rs.getInt("locacao_codigoDalocacao"));
            locaModelBuId.setLocacao_tanqueCheio(rs.getInt("locacao_tanqueCheio"));
            locaModelBuId.setLocacao_veiculo(veiculoDal.getById(rs.getInt("locacao_veiculos_idem")));
            locaModelBuId.setLocacao_pessoa((PessoaModel) pessoaDal.getById(rs.getInt("locacao_pessoas_idem")));
            locaModelBuId.setLocacao_motorista(motoristaDal.getById(rs.getInt("locacao_motorista_idem")));
            locaModelBuId.setLocacao_administrador((AdministradorModel) administradorDal.getById(rs.getInt("locacao_administrador_idem")));

        }
        return locaModelBuId;
    }

    @Override
    public LocacaoModel getByNome(String nome) throws Exception {
        return null;
    }

    @Override
    public int addReturn(LocacaoModel objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
