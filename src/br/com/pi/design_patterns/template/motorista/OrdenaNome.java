/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi.design_patterns.template.motorista;

import br.com.pi.model.MotoristaModel;

/**
 *
 * @author watlas
 */
public class OrdenaNome extends MotoristaOrdena {

    public OrdenaNome() throws Exception {
    }

    @Override
    public boolean ePrimeiro(MotoristaModel pessoa1, MotoristaModel pessoa2) {
        return pessoa1.getMotorista_cpf().compareToIgnoreCase(pessoa2.getMotorista_cpf()) <= 0;
    }

}
