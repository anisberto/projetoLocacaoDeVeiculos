package br.com.pi.util;

import br.com.pi.model.EnderecoModel;
import java.util.Iterator;
import java.util.List;

public class EnderecoIterator implements Iterator {

    private List<EnderecoModel> enderecoCliente;
    private int indice;

    public EnderecoIterator(List<EnderecoModel> clienteEndereco) {
        if (clienteEndereco == null) {
            throw new IllegalArgumentException("array está vazio");
        }
        this.enderecoCliente = clienteEndereco;
        indice = 0;
    }

    @Override
    public Object next() {
        return enderecoCliente.get(indice++);
    }

    @Override
    public boolean hasNext() {
        if (indice == enderecoCliente.size()){
            return false;
        }else{
            return true;
        }
    }

}
