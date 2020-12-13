/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi.design_patterns.template.pessoa;

import br.com.pi.model.PessoaModel;

/**
 *
 * @author watlas
 */
public class OrdenaNome extends PessoaOrdena {

    public OrdenaNome() throws Exception {
        super();
    }

    @Override
    public boolean ePrimeiro(PessoaModel aluno1, PessoaModel aluno2) {
        return aluno1.getPessoa_nome().compareToIgnoreCase(aluno2.getPessoa_nome()) <= 0;
    }

//    @Override
//    public String teste(String nome) {
//       return "SELECT * FROM Pessoas WHERE pessoa_nome LIKE '"+nome+"%'";
//    }

}
