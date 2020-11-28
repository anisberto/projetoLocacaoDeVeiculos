package br.com.pi.bll;

import br.com.pi.dal.EnderecoDal;
import br.com.pi.model.EnderecoModel;
import interfaces.EnderecoInterface;
import java.util.ArrayList;

public class EnderecoBll1 implements EnderecoInterface {

    EnderecoInterface end;

    public EnderecoBll1() throws Exception {
        end = (EnderecoInterface) new EnderecoDal();
    }

    @Override
    public void adicionarEndereco(EnderecoModel Endereco) {
        end.adicionarEndereco(Endereco);
    }

    @Override
    public void deleteEndereco(int endereco) {
        end.deleteEndereco(endereco);
    }

    @Override
    public void updateEndereco(EnderecoModel endereco) {
        end.updateEndereco(endereco);
    }

    @Override
    public ArrayList<EnderecoModel> getAllEndereco() {
        return end.getAllEndereco();
    }

    @Override
    public EnderecoModel getEnderecoById(int id) {
        return end.getEnderecoById(id);
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
