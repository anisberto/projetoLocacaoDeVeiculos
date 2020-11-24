package br.com.pi.dal;

import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.VeiculoModel;
import br.com.pi.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Iterator;

public class VeiculoDal implements ICRUD_GENERIC<VeiculoModel> {

    Connection conec;

    public VeiculoDal() throws Exception {
        conec = Conexao.getInstance().getConnection();
    }

    @Override
    public void add(VeiculoModel objeto) throws Exception {
        try {
            PreparedStatement prep = conec.prepareStatement("INSERT INTO public.veiculos(\n"
                    + "veiculo_renavam, veiculo_precodecompra, veiculo_precodevenda, "
                    + "veiculo_numerodepassageiros, veiculo_anodefabricacao, veiculo_anodomodelo, veiculo_quilometragem, "
                    + "veiculo_tipodecombustivel, veiculo_tipodeveiculo, veiculo_situacaodoveiculo, veiculo_modelo_idem)\n"
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

        } catch (Exception e) {
        }
    }

    @Override
    public void update(VeiculoModel objeto) throws Exception {
        try {

        } catch (Exception e) {
        }
    }

    @Override
    public Iterator getAll() throws Exception {
        try {

        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public VeiculoModel getById(int n) throws Exception {
        try {

        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public VeiculoModel getByNome(String nome) throws Exception {
        try {

        } catch (Exception e) {
        }
        return null;
    }
}
