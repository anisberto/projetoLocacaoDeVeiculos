/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi.design_patterns.template.motorista;

import br.com.pi.model.MotoristaModel;
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
public abstract class MotoristaOrdena {

    Connection conec;

    public MotoristaOrdena() throws Exception {
        conec = new AdpterConexao().getConnectionAdapter();
    }

    public abstract boolean ePrimeiro(MotoristaModel pessoa1, MotoristaModel pessoa2);

    public List getAll() throws Exception {
        List<MotoristaModel> listaDeMotoristas = new ArrayList<>();
        try {
            Statement stat = conec.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM motorista");
            while (result.next()) {
                MotoristaModel motorista = new MotoristaModel();
                motorista.setMotorista_idem(result.getInt("motorista_idem"));
                motorista.setMotorista_cpf(result.getString("motorista_cpf"));
                motorista.setMotorista_nome(result.getString("motorista_nome"));
                motorista.setMotorista_rg(result.getString("motorista_rg"));
                motorista.setMotorista_telefone(result.getString("motorista_telefone"));
                motorista.setMotorista_email(result.getString("motorista_email"));
                motorista.setCnh_categoria(result.getString("motorista_categoria"));
                motorista.setCnh_dataValidade(result.getDate("motorista_datadevalidade"));
                motorista.setCnh_imagem(result.getBytes("motorista_imagem"));
                motorista.setCnh_numeroRegistro(result.getInt("motorista_numerodoregistro"));
                listaDeMotoristas.add(motorista);
            }

            for (int i = 0; i < listaDeMotoristas.size(); i++) {
                for (int j = i; j < listaDeMotoristas.size(); j++) {

                    if (!ePrimeiro(listaDeMotoristas.get(i), listaDeMotoristas.get(j))) {
                        MotoristaModel temp = listaDeMotoristas.get(j);
                        listaDeMotoristas.set(j, listaDeMotoristas.get(i));

                        listaDeMotoristas.set(i, temp);
                    }
                }
            }

            return listaDeMotoristas;

        } catch (Exception e) {
            throw e;
        }

    }

    public void bubbleSortArrayList(ArrayList<MotoristaModel> list) {
        MotoristaModel temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).compareToo(list.get(i + 1)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }

}
