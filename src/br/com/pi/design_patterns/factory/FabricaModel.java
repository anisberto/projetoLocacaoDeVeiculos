/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi.design_patterns.factory;

import br.com.pi.model.PessoaModel;
import br.com.pi.model.PessoaPFModel;
import br.com.pi.model.PessoaPJModel;

/**
 *
 * @author watlas
 */
public class FabricaModel{
    
     public static PessoaModel getTipoDeFuncionario(Enum tipo) {
              PessoaModel objeto = null;
        if (tipo.equals(EnumClasses.getPessoa())) {
            return objeto = new PessoaModel();
        }
        if (tipo.equals(EnumClasses.getPessoapf())) {
            return objeto = new PessoaPFModel();
        }
        if (tipo.equals(EnumClasses.getPessoapj())) {
            return objeto = new PessoaPJModel();
        }
        return null;
     
     }
    
}
