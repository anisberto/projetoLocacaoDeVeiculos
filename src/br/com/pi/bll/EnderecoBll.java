package br.com.pi.bll;

import br.com.pi.dal.EnderecoDal;
import br.com.pi.model.EnderecoModel;
import java.util.ArrayList;
import interfaces.EnderecoInterface;

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
    public ArrayList<EnderecoModel> getAllUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EnderecoModel getUsuarioById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EnderecoModel findUsuarioName(String cep) {
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
