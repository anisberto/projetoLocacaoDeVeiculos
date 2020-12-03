package br.com.pi.bll;

import br.com.pi.dal.AdministradorDal;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.AdministradorModel;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdministradorBll implements ICRUD_GENERIC<AdministradorModel> {

    AdministradorDal dal;

    public AdministradorBll() throws Exception {
        dal = new AdministradorDal();
    }

    @Override
    public void add(AdministradorModel objeto) throws Exception {
        try {
            validaadm((AdministradorModel) objeto);
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
    public void update(AdministradorModel objeto) throws Exception {
        try {
            validaadm(objeto);
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
    public AdministradorModel getById(int n) throws Exception {
        try {
            return dal.getById(n);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public AdministradorModel getByNome(String nome) throws Exception {
        try {
            return dal.getByNome(nome);
        } catch (Exception e) {
            throw e;
        }
    }

    public void validaadm(AdministradorModel objeto) throws Exception {
        String nome = objeto.getAdministrador_nome().trim().toLowerCase();
        String invalidos = "1234567890'\"!@#$%¨&*()-_+={[}]/?><;:";
        for (int i = 0; i < invalidos.length(); i++) {
            if (nome.contains("" + invalidos.charAt(i))) {
                throw new Exception("Nome de usuario inválido!");
            }
        }

        if (objeto.getAdministrador_nome().equals("")) {
            throw new Exception("Informe a Senha do usuario");
        }
        if (objeto.getAdministrador_senha().equals("")) {
            throw new Exception("Informe a Senha do usuario");
        }

        Iterator<AdministradorModel> listaDeUsuario = dal.getAll();
        for (Iterator<AdministradorModel> it = listaDeUsuario; it.hasNext();) {
            AdministradorModel aux = it.next();

            if ((objeto.getAdministrador_idem() != aux.getAdministrador_idem()) && (objeto.getAdministrador_nome().toUpperCase().
                    equalsIgnoreCase(aux.getAdministrador_nome().toUpperCase()))) {
                throw new Exception("O nom --> " + objeto.getAdministrador_nome() + "\nJá existe no cadastro de Administradores!\n");
            }
        }
    }


    public static boolean validaLogin(AdministradorModel usuarioTeste) throws Exception {
        AdministradorModel adm = null;
        AdministradorDal dal = new AdministradorDal();
        adm = dal.getByNome(usuarioTeste.getAdministrador_usuario());
        if (adm.getAdministrador_usuario().equalsIgnoreCase(usuarioTeste.getAdministrador_usuario())
                && adm.getAdministrador_senha().equalsIgnoreCase(usuarioTeste.getAdministrador_senha())) {
            return true;
        } else {
            return false;
        }
}

    @Override
    public int addReturn(AdministradorModel objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}