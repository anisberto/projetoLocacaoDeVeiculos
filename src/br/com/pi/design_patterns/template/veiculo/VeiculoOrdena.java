/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi.design_patterns.template.veiculo;

import br.com.pi.bll.ModeloBll;
import br.com.pi.model.ModeloModel;
import br.com.pi.model.MotoristaModel;
import br.com.pi.model.VeiculoModel;
import br.com.pi.util.AdpterConexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author watlas
 */
public abstract class VeiculoOrdena {

    Connection conec;

    public VeiculoOrdena() throws Exception {
        conec = new AdpterConexao().getConnectionAdapter();
    }

    public abstract boolean ePrimeiro(VeiculoModel pessoa1, VeiculoModel pessoa2);

    public ArrayList getAll() throws Exception {
        ArrayList<VeiculoModel> listaDeVeiculos = new ArrayList<>();
        ModeloBll modeloBll = new ModeloBll();
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

            for (int i = 0; i < listaDeVeiculos.size(); i++) {
                for (int j = i; j < listaDeVeiculos.size(); j++) {

                    if (!ePrimeiro(listaDeVeiculos.get(i), listaDeVeiculos.get(j))) {
                        VeiculoModel temp = listaDeVeiculos.get(j);
                        listaDeVeiculos.set(j, listaDeVeiculos.get(i));

                        listaDeVeiculos.set(i, temp);
                    }
                }
            }

            return listaDeVeiculos;
        } catch (Exception e) {
            throw e;
        }
    }

}
