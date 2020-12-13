package br.com.pi.dal;

import br.com.pi.bll.ModeloBll;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.ModeloModel;
import br.com.pi.model.VeiculoModel;
import br.com.pi.util.AdpterConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VeiculoDal implements ICRUD_GENERIC<VeiculoModel> {

    Connection conec;
    ModeloBll modeloBll = new ModeloBll();
    VeiculoModel veiculo;

    public VeiculoDal() throws Exception {
        conec = new AdpterConexao().getConnectionAdapter();
    }

    @Override
    public void add(VeiculoModel objeto) throws Exception {
        try {
            PreparedStatement prep = conec.prepareStatement("INSERT INTO veiculos(\n"
                    + "	veiculo_renavam, veiculo_precodecompra, \n"
                    + "	veiculo_precodevenda, veiculo_numerodepassageiros, veiculo_anodefabricacao, \n"
                    + "	veiculo_anodomodelo, veiculo_quilometragem, veiculo_tipodecombustivel, \n"
                    + "	veiculo_tipodeveiculo, veiculo_situacaodoveiculo, veiculo_modelo_idem)\n"
                    + "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            prep.setString(1, objeto.getVeiculo_renavam());
            prep.setDouble(2, objeto.getVeiculo_precoCompra());
            prep.setDouble(3, objeto.getVeiculo_precoVenda());
            prep.setInt(4, objeto.getVeiculo_numeroDePassageiro());
            prep.setString(5, objeto.getVeiculo_anoFabrica());
            prep.setString(6, objeto.getVeiculo_anoModelo());
            prep.setDouble(7, objeto.getVeiculo_quilometragem());
            prep.setString(8, objeto.getVeiculo_tipoCombustivel());
            prep.setString(9, objeto.getVeiculo_tipoVeiculo());
            prep.setString(10, objeto.getVeiculo_situacaoVeiculo());
            prep.setInt(11, objeto.getVeiculo_modelo().getModelo_idem());
            prep.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public void delete(int n) throws Exception {
        try {
            PreparedStatement prep = conec.prepareStatement("DELETE FROM public.veiculos\n"
                    + "	WHERE veiculo_idem=?;");
            prep.setInt(1, n);
            prep.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void update(VeiculoModel objeto) throws Exception {
        try {
            PreparedStatement prep = conec.prepareStatement("UPDATE veiculos\n"
                    + "	SET veiculo_renavam=?, veiculo_precodecompra=?, veiculo_precodevenda=?, "
                    + "veiculo_numerodepassageiros=?, veiculo_anodefabricacao=?, veiculo_anodomodelo=?, "
                    + "veiculo_quilometragem=?, veiculo_tipodecombustivel=?, veiculo_tipodeveiculo=?, veiculo_situacaodoveiculo=?, "
                    + "veiculo_modelo_idem=?\n"
                    + "	WHERE veiculo_idem=?;");
            prep.setString(1, objeto.getVeiculo_renavam());
            prep.setDouble(2, objeto.getVeiculo_precoCompra());
            prep.setDouble(3, objeto.getVeiculo_precoVenda());
            prep.setInt(4, objeto.getVeiculo_numeroDePassageiro());
            prep.setString(5, objeto.getVeiculo_anoFabrica());
            prep.setString(6, objeto.getVeiculo_anoModelo());
            prep.setDouble(7, objeto.getVeiculo_quilometragem());
            prep.setString(8, objeto.getVeiculo_tipoCombustivel());
            prep.setString(9, objeto.getVeiculo_tipoVeiculo());
            prep.setString(10, objeto.getVeiculo_situacaoVeiculo());
            prep.setInt(11, objeto.getVeiculo_modelo().getModelo_idem());
            prep.setInt(12, objeto.getVeiculo_idem());
            prep.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public Iterator getAll() throws Exception {
        List<VeiculoModel> listaDeVeiculos = new ArrayList<>();
        try {
            Statement stat = conec.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM veiculos");
            while (result.next()) {
                VeiculoModel veiculo = new VeiculoModel();
                veiculo.setVeiculo_idem(result.getInt("veiculo_idem"));
                veiculo.setVeiculo_renavam(result.getString("veiculo_renavam"));
                veiculo.setVeiculo_precoCompra(result.getFloat("veiculo_precodecompra"));
                veiculo.setVeiculo_precoVenda(result.getFloat("veiculo_precodevenda"));
                veiculo.setVeiculo_numeroDePassageiro(result.getInt("veiculo_numerodepassageiros"));
                veiculo.setVeiculo_anoFabrica(result.getString("veiculo_anodefabricacao"));
                veiculo.setVeiculo_anoModelo(result.getString("veiculo_anodomodelo"));
                veiculo.setVeiculo_quilometragem(result.getFloat("veiculo_quilometragem"));
                veiculo.setVeiculo_tipoCombustivel(result.getString("veiculo_tipodecombustivel"));
                veiculo.setVeiculo_tipoVeiculo(result.getString("veiculo_tipodeveiculo"));
                veiculo.setVeiculo_situacaoVeiculo(result.getString("veiculo_situacaodoveiculo"));
                veiculo.setVeiculo_modelo((ModeloModel) modeloBll.getById(result.getInt("veiculo_modelo_idem")));
                listaDeVeiculos.add(veiculo);
            }
            return listaDeVeiculos.iterator();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public VeiculoModel getById(int n) throws Exception {
        try {

            PreparedStatement prep = conec.prepareStatement("SELECT * FROM veiculos WHERE veiculo_idem=?");
            prep.setInt(1, n);
            ResultSet result = prep.executeQuery();

            while (result.next()) {
                veiculo = new VeiculoModel();
                veiculo.setVeiculo_idem(result.getInt("veiculo_idem"));
                veiculo.setVeiculo_renavam(result.getString("veiculo_renavam"));
                veiculo.setVeiculo_precoCompra(result.getFloat("veiculo_precodecompra"));
                veiculo.setVeiculo_precoVenda(result.getFloat("veiculo_precodevenda"));
                veiculo.setVeiculo_numeroDePassageiro(result.getInt("veiculo_numerodepassageiros"));
                veiculo.setVeiculo_anoFabrica(result.getString("veiculo_anodefabricacao"));
                veiculo.setVeiculo_anoModelo(result.getString("veiculo_anodomodelo"));
                veiculo.setVeiculo_quilometragem(result.getFloat("veiculo_quilometragem"));
                veiculo.setVeiculo_tipoCombustivel(result.getString("veiculo_tipodecombustivel"));
                veiculo.setVeiculo_tipoVeiculo(result.getString("veiculo_tipodeveiculo"));
                veiculo.setVeiculo_situacaoVeiculo(result.getString("veiculo_situacaodoveiculo"));
                veiculo.setVeiculo_modelo((ModeloModel) modeloBll.getById(result.getInt("veiculo_modelo_idem")));
            }
            return veiculo;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public VeiculoModel getByNome(String nome) throws Exception {
        try {
            VeiculoModel veiculo = new VeiculoModel();
            PreparedStatement prep = conec.prepareStatement("SELECT * FROM veiculos WHERE veiculo_renavam=?");
            prep.setString(1, nome);
            ResultSet result = prep.executeQuery();
            while (result.next()) {
                veiculo.setVeiculo_idem(result.getInt("veiculo_idem"));
                veiculo.setVeiculo_renavam(result.getString("veiculo_renavam"));
                veiculo.setVeiculo_precoCompra(result.getFloat("veiculo_precodecompra"));
                veiculo.setVeiculo_precoVenda(result.getFloat("veiculo_precodevenda"));
                veiculo.setVeiculo_numeroDePassageiro(result.getInt("veiculo_numerodepassageiros"));
                veiculo.setVeiculo_anoFabrica(result.getString("veiculo_anodefabricacao"));
                veiculo.setVeiculo_anoModelo(result.getString("veiculo_anodomodelo"));
                veiculo.setVeiculo_quilometragem(result.getFloat("veiculo_quilometragem"));
                veiculo.setVeiculo_tipoCombustivel(result.getString("veiculo_tipodecombustivel"));
                veiculo.setVeiculo_tipoVeiculo(result.getString("veiculo_tipodeveiculo"));
                veiculo.setVeiculo_situacaoVeiculo(result.getString("veiculo_situacaodoveiculo"));
                veiculo.setVeiculo_modelo((ModeloModel) modeloBll.getById(result.getInt("veiculo_modelo_idem")));
            }
            return veiculo;
        } catch (Exception e) {
            throw e;
        }
    }
    public VeiculoModel getByIdModelo(int nome) throws Exception {
        try {
            VeiculoModel veiculo = new VeiculoModel();
            PreparedStatement prep = conec.prepareStatement("SELECT * FROM veiculos WHERE veiculo_modelo_idem=?");
            prep.setInt(1, nome);
            ResultSet result = prep.executeQuery();
            while (result.next()) {
                veiculo.setVeiculo_idem(result.getInt("veiculo_idem"));
                veiculo.setVeiculo_renavam(result.getString("veiculo_renavam"));
                veiculo.setVeiculo_precoCompra(result.getFloat("veiculo_precodecompra"));
                veiculo.setVeiculo_precoVenda(result.getFloat("veiculo_precodevenda"));
                veiculo.setVeiculo_numeroDePassageiro(result.getInt("veiculo_numerodepassageiros"));
                veiculo.setVeiculo_anoFabrica(result.getString("veiculo_anodefabricacao"));
                veiculo.setVeiculo_anoModelo(result.getString("veiculo_anodomodelo"));
                veiculo.setVeiculo_quilometragem(result.getFloat("veiculo_quilometragem"));
                veiculo.setVeiculo_tipoCombustivel(result.getString("veiculo_tipodecombustivel"));
                veiculo.setVeiculo_tipoVeiculo(result.getString("veiculo_tipodeveiculo"));
                veiculo.setVeiculo_situacaoVeiculo(result.getString("veiculo_situacaodoveiculo"));
                veiculo.setVeiculo_modelo((ModeloModel) modeloBll.getById(result.getInt("veiculo_modelo_idem")));
            }
            return veiculo;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public int addReturn(VeiculoModel objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
