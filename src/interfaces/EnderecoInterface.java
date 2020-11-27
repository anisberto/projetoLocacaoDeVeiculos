package interfaces;

import br.com.pi.model.EnderecoModel;
import java.util.ArrayList;

public interface EnderecoInterface {
    
    public void adicionarEndereco(EnderecoModel Endereco);

    public void deleteEndereco(int endereco);

    public void updateEndereco(EnderecoModel endereco);

    public ArrayList<EnderecoModel> getAllEndereco();

    public EnderecoModel getEnderecoById(int id);

    public EnderecoModel findEnderecoName(String cep);
}
