package br.com.pi.bll;

import br.com.pi.dal.EnderecoDal;
import br.com.pi.model.EnderecoModel;
import java.util.ArrayList;
import interfaces.EnderecoInterface;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnderecoBll implements EnderecoInterface {

    EnderecoInterface novoEndereco;

    public EnderecoBll() throws Exception {
        novoEndereco = new EnderecoDal();
    }

    @Override
    public void adicionarEndereco(EnderecoModel endereco) {
        novoEndereco.adicionarEndereco(endereco);
    }

    @Override
    public void deleteEndereco(int endereco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateEndereco(EnderecoModel endereco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EnderecoModel> getAllEndereco() {
        try {
            return novoEndereco.getAllEndereco();

        } catch (Exception e) {
            try {
                throw new Exception(e.getMessage());

            } catch (Exception ex) {
                Logger.getLogger(EnderecoBll.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public EnderecoModel getEnderecoById(int id) {
        try {
            return novoEndereco.getEnderecoById(id);
        } catch (Exception e) {
            try {
                throw new Exception(e.getMessage());

            } catch (Exception ex) {
                Logger.getLogger(EnderecoBll.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public EnderecoModel findEnderecoName(String cep) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Validação do CEP
     *
     * @param objeto
     * @throws Exception
     */
    private void validaEndereco(EnderecoModel objeto) throws Exception {
        String nome = objeto.getEndereco_cep().trim().toLowerCase();
        String invalidos = "abcdefghijklmnopqrstuvxwyz'\"!@#$%¨&*()_+={[}]/?><;:";
        for (int i = 0; i < invalidos.length(); i++) {
            if (nome.contains("" + invalidos.charAt(i))) {
                throw new Exception("Cep inválido");
            }
        }
    }

}
