/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi.bll;

import br.com.pi.dal.MarcaDal;
import br.com.pi.model.MarcaModel;
import br.com.pi.interfaces.ICRUD_GENERIC;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Anthonny Max
 */
public class MarcaBll implements ICRUD_GENERIC<MarcaModel> {

    private MarcaDal dal;

    public MarcaBll() throws Exception {
        dal = new MarcaDal();
    }

    @Override
    public void add(MarcaModel objeto) throws Exception {
        try {
            validaMarca((MarcaModel) objeto);
            dal.add(objeto);
        } catch (Exception e) {
            throw e;

        }

    }

    @Override
    public void delete(int n) throws Exception {
        try {
            dal.delete(n);
        } catch (Exception e) {
            String erro = e.getMessage();
            if(erro.contains("update or delete on table \"marca\" violates foreign key constraint")){
                erro = "Não é possivel deletar, pois essa marca está vinculada a um Modelo";
            }
            throw new Exception(erro);

        }

    }

    @Override
    public void update(MarcaModel objeto) throws Exception {
        try {
            validaMarca((MarcaModel) objeto);
            dal.update(objeto);
        } catch (Exception e) {
            throw e;

        }

    }

    @Override
    public Iterator getAll() throws Exception {
        try {
            return dal.getAll();
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public MarcaModel getById(int n) throws Exception {
        try {
            return dal.getById(n);
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public MarcaModel getByNome(String nome) throws Exception {
        try {
            return dal.getByNome(nome);
        } catch (Exception e) {
            throw e;
        }

    }

    //Validações
    public void validaMarca(MarcaModel objeto) throws Exception {
        String descricao = objeto.getMarca_descricao().trim().toLowerCase();
        String invalidos = "1234567890'\"!@#$%¨&*()-_+={[}]/?><;:";
        for (int i = 0; i < invalidos.length(); i++) {
            if (descricao.contains("" + invalidos.charAt(i))) {
                throw new Exception("Nome de Marca inválido!");
            }
        }
        //Iterator tratando para nao ter duas marcas iguais!!!
        Iterator<MarcaModel> listaDeUsuario = dal.getAll();
        for (Iterator<MarcaModel> it = listaDeUsuario; it.hasNext();) {
            MarcaModel aux = it.next();

            if ((objeto.getMarca_idem() != aux.getMarca_idem()) && (objeto.getMarca_descricao().toUpperCase().
                    equalsIgnoreCase(aux.getMarca_descricao().toUpperCase()))) {
                throw new Exception("A descrição --> " + objeto.getMarca_descricao() + "\nJá existe no cadastro de marcas!\n");
            }
        }
    }

    @Override
    public int addReturn(MarcaModel objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
