package interfaces;

import br.com.pi.model.EnderecoModel;
import java.util.ArrayList;

public interface EnderecoInterface {
    
    public void adicionarEndereco(EnderecoModel Endereco);

    public void deleteEndereco(int endereco);

    public void updateEndereco(EnderecoModel endereco);

    public ArrayList<EnderecoModel> getAllUsuario();

    public EnderecoModel getUsuarioById(int id);

    public EnderecoModel findUsuarioName(String cep);
}
