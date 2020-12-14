package br.com.pi.bll;

import br.com.pi.dal.EnderecoDal;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.EnderecoModel;

import java.util.Iterator;


public class EnderecoBll implements ICRUD_GENERIC {

    EnderecoDal dal;

    public EnderecoBll() {
        dal = new EnderecoDal();
    }


    @Override
    public int addReturn(Object objeto) throws Exception {
        try {
            validaEndereco((EnderecoModel) objeto);
            return dal.addReturn(objeto);
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public void add(Object objeto) throws Exception {
        try {
            validaEndereco((EnderecoModel) objeto);

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
            throw e;
        }
    }

    @Override
    public void update(Object objeto) throws Exception {
        try {
            validaEndereco((EnderecoModel) objeto);

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

        } catch (Exception e) {
            throw e;
        }
        return null;
    }

    private void validaEndereco(EnderecoModel endereco) throws Exception {
        if (endereco.getEndereco_bairro().isEmpty()) {
            throw new Exception("Preencha o Bairro");
        }
        if (endereco.getEndereco_cep().isEmpty()) {
            throw new Exception("Preencha o CEP");
        }
        if (endereco.getEndereco_cep().trim().length() < 9) {
            throw new Exception("CEP INVALIDO");
        }
        if (endereco.getEndereco_cidade().isEmpty()) {
            throw new Exception("Preencha a Cidade");
        }

        if (endereco.getEndereco_complemento().isEmpty()) {
            throw new Exception("Preencha o Complemento");
        }
        if (endereco.getEndereco_estado().equals("<Selecione UF>")) {
            throw new Exception("Preencha o Estado");
        }
        if (endereco.getEndereco_rua().isEmpty()) {
            throw new Exception("Preencha a Rua");
        }

    }


}
