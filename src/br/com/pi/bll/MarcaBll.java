/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi.bll;

import br.com.pi.dal.MarcaDal;
import br.com.pi.model.MarcaModel;
import br.com.pi.util.ICRUD_GENERIC;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Anthonny Max
 */
public class MarcaBll implements ICRUD_GENERIC {

    private MarcaDal dal;

    public MarcaBll () throws Exception {
        dal = new MarcaDal();
    }

    @Override
    public void add(Object objeto) throws Exception {
        try {
            validaMarca((MarcaModel) objeto);
            dal.add(objeto);
        } catch (Exception e) {

        }

    }

    @Override
    public void delete(int n) throws Exception {
        try {
        dal.delete(n);
        } catch (Exception e) {

        }

    }

    @Override
    public void update(Object objeto) throws Exception {
        try {
            validaMarca((MarcaModel) objeto);
            dal.update(objeto);
        } catch (Exception e) {

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
    public Object getById(int n) throws Exception {
        try {
            return dal.getById(n);
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public Object getByNome(String nome) throws Exception {
        try {
            return dal.getByNome(nome);
        } catch (Exception e) {
        throw e;
        }

    }
    public static boolean isValidEmailAddressRegex(String email) {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }
    //Validações
    public void validaMarca(MarcaModel objeto)throws Exception{
        String descricao = objeto.getMarca_descricao().trim().toLowerCase();
        String invalidos = "1234567890'\"!@#$%¨&*()-_+={[}]/?><;:";
        for (int i = 0; i < invalidos.length(); i++) {
            if (descricao.contains("" + invalidos.charAt(i))) {
                throw new Exception("Nome de Marca inválido!");
            }
        }
        //Iterator tratando para nao ter duas marcas iguais!!!
        Iterator<MarcaModel> listaDeUsuario = dal.getAll();
        for (Iterator<MarcaModel> it = listaDeUsuario; it.hasNext(); ) {
            MarcaModel aux = it.next();

            if ((objeto.getMarca_idem() != aux.getMarca_idem()) && (objeto.getMarca_descricao().toUpperCase().
                    equalsIgnoreCase(aux.getMarca_descricao().toUpperCase()))){
                throw new Exception("A descrição --> " + objeto.getMarca_descricao() + "\nJá existe no cadastro de marcas!\n");
            }
        }
    }


}
