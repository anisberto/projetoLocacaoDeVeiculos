/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi.bll;

import br.com.pi.dal.PessoaDal;
import br.com.pi.model.PessoaModel;
import br.com.pi.interfaces.ICRUD_GENERIC;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Anisb
 */
public class PessoaBll implements ICRUD_GENERIC {

    private PessoaDal dal;

    public PessoaBll() throws Exception {
        dal = new PessoaDal();
    }

    @Override
    public void add(Object objeto) throws Exception {
        try {
            validaPessoa((PessoaModel) objeto);
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
            validaPessoa((PessoaModel) objeto);
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

    public void validaPessoa(PessoaModel objeto)throws Exception{
        String nome = objeto.getPessoa_nome().trim().toLowerCase();
        String invalidos = "1234567890'\"!@#$%¨&*()-_+={[}]/?><;:";
        for (int i = 0; i < invalidos.length(); i++) {
            if (nome.contains("" + invalidos.charAt(i))) {
                throw new Exception("Nome de usuario inválido!");
            }
        }


        // Verifica se EMAIL é válido
        if (isValidEmailAddressRegex(objeto.getPessoa_email()) == false) {
            throw new Exception("Não foi possível concluir sua solicitação"
                    + "\nO EMAIL informado não é válido");
        }

        if (objeto.getPessoa_email().equals("")) {
            throw new Exception("Informe o Email do usuario");
        }
        if (objeto.getPessoa_nome().equals("")) {
            throw new Exception("Informe a Senha do usuario");
        }
        if (objeto.getPessoa_telefone().equals("")) {
            throw new Exception("Informe a Senha do usuario");
        }

        Iterator<PessoaModel> listaDeUsuario = dal.getAll();
        for (Iterator<PessoaModel> it = listaDeUsuario; it.hasNext(); ) {
            PessoaModel aux = it.next();

            if ((objeto.getPessoa_idem() != aux.getPessoa_idem()) && (objeto.getPessoa_email().toUpperCase().
                    equalsIgnoreCase(aux.getPessoa_email().toUpperCase()))){
                throw new Exception("O Email --> " + objeto.getPessoa_email() + "\nJá existe no cadastro de usuarios!\n");
            }
            if ((objeto.getPessoa_idem() != aux.getPessoa_idem()) && (objeto.getPessoa_telefone().toUpperCase().
                    equalsIgnoreCase(aux.getPessoa_telefone().toUpperCase()))){
                throw new Exception("O Telefone --> " + objeto.getPessoa_telefone() + "\nJá existe no cadastro de usuarios!\n");
            }

        }
    }

    @Override
    public int addReturn(Object objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
