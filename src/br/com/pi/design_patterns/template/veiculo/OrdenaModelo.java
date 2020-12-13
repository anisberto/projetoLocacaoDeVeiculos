/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi.design_patterns.template.veiculo;

import br.com.pi.model.VeiculoModel;

/**
 *
 * @author watlas
 */
public class OrdenaModelo extends VeiculoOrdena{

    public OrdenaModelo() throws Exception {
    }
    
    

    @Override
    public boolean ePrimeiro(VeiculoModel pessoa1, VeiculoModel pessoa2) {
       return pessoa1.getVeiculo_modelo().getModelo_descricao().compareToIgnoreCase(pessoa2.getVeiculo_modelo().getModelo_descricao()) <= 0;
    }
    
}
