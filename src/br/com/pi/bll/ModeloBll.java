
package br.com.pi.bll;

import br.com.pi.dal.ModeloDal;
import br.com.pi.model.ModeloModel;
import br.com.pi.interfaces.ICRUD_GENERIC;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModeloBll implements ICRUD_GENERIC<ModeloModel>  {

    private ModeloDal dal;

    public ModeloBll () throws Exception {
        dal = new ModeloDal();
    }

    @Override
    public void add(ModeloModel objeto) throws Exception {
        try {
            validaModelo((ModeloModel) objeto);
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
    public void update(ModeloModel objeto) throws Exception {
        try {
            validaModelo((ModeloModel) objeto);
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
    public ModeloModel getById(int n) throws Exception {
        try {
            return dal.getById(n);
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public ModeloModel getByNome(String nome) throws Exception {
        try {
            return dal.getByNome(nome);
        } catch (Exception e) {
        throw e;
        }

    }
    
    //Validações
    public void validaModelo(ModeloModel objeto)throws Exception{
        String descricao = objeto.getModelo_descricao().trim().toLowerCase();
        String invalidos = "1234567890'\"!@#$%¨&*()-_+={[}]/?><;:";
        for (int i = 0; i < invalidos.length(); i++) {
            if (descricao.contains("" + invalidos.charAt(i))) {
                throw new Exception("Nome de Modelo inválido!");
            }
        }
        //Iterator tratando para nao ter duas marcas iguais!!!
        Iterator<ModeloModel> listaDeUsuario = dal.getAll();
        for (Iterator<ModeloModel> it = listaDeUsuario; it.hasNext(); ) {
            ModeloModel aux = it.next();

            if ((objeto.getModelo_idem() != aux.getModelo_idem()) && (objeto.getModelo_descricao().toUpperCase().
                    equalsIgnoreCase(aux.getModelo_descricao().toUpperCase()))){
                throw new Exception("A descrição --> " + objeto.getModelo_descricao() + "\nJá existe no cadastro de modelos!\n");
            }
        }
    }

    @Override
    public int addReturn(ModeloModel objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
