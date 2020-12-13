/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi.design_patterns.template.pessoa;

import br.com.pi.dal.EnderecoDal;
import br.com.pi.model.EnderecoModel;
import br.com.pi.model.PessoaModel;
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
public abstract class PessoaOrdena {

    private Connection conexao;
    PessoaModel pessoaModel = new PessoaModel();

    public PessoaOrdena() throws Exception {
        this.conexao = new AdpterConexao().getConnectionAdapter();
    }

    public abstract boolean ePrimeiro(PessoaModel pessoa1, PessoaModel pessoa2);

   // public abstract String teste(String aesquisa);

    public ArrayList getAllPesquisa() throws Exception {
        String sql = "SELECT * FROM Pessoas";
        EnderecoDal enderecoDal = new EnderecoDal();

        ArrayList<PessoaModel> pessoaModelList = new ArrayList<>();


        Statement st = conexao.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {

            pessoaModel = new PessoaModel();
            pessoaModel.setPessoa_idem(rs.getInt("pessoa_idem"));
            pessoaModel.setPessoa_nome(rs.getString("pessoa_nome"));
            pessoaModel.setPessoa_email(rs.getString("pessoa_email"));
            pessoaModel.setPessoa_telefone(rs.getString("pessoa_telefone"));

            pessoaModelList.add(pessoaModel);

        }
        for (int i = 0; i < pessoaModelList.size(); i++) {
            for (int j = i; j < pessoaModelList.size(); j++) {

                if (!ePrimeiro(pessoaModelList.get(i), pessoaModelList.get(j))) {
                    PessoaModel temp = pessoaModelList.get(j);
                    pessoaModelList.set(j, pessoaModelList.get(i));
                    pessoaModelList.set(i, temp);
                }
            }
        }
        return pessoaModelList;
    }

}
