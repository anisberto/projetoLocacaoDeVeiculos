package br.com.pi.bll;

import br.com.pi.dal.PessoaPJDal;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.EnderecoModel;
import br.com.pi.model.PessoaModel;
import br.com.pi.model.PessoaPJModel;

import java.util.InputMismatchException;
import java.util.Iterator;

public class PessoaPJBll implements ICRUD_GENERIC {

    PessoaPJDal dal;

    public PessoaPJBll() throws Exception {
        dal = new PessoaPJDal();
    }

    public void addAll(EnderecoModel endereco, PessoaPJModel pessoa) throws Exception {
        try {
            dal.addAll(endereco, pessoa);
        } catch (Exception e) {
            throw e;
        }
    }
    public void updateAll(EnderecoModel endereco, PessoaModel pessoaModel, PessoaPJModel pessoa) throws Exception {
        try {
            dal.updateAll(endereco, pessoaModel, pessoa);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public void add(Object objeto) throws Exception {
        try {
            validaPessoa((PessoaPJModel) objeto);
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
            validaPessoa((PessoaPJModel) objeto);
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
            return dal.getByNome(nome);
        } catch (Exception e) {
            throw e;
        }
    }

    public void validaPessoa(PessoaPJModel objeto) throws Exception {
        String nome = objeto.getPessoa_pj_razaoSocial().trim().toLowerCase();
        String invalidos = "1234567890'\"!@#$%¨&*()-_+={[}]/?><;:";
        for (int i = 0; i < invalidos.length(); i++) {
            if (nome.contains("" + invalidos.charAt(i))) {
                throw new Exception("Nome de usuario inválido!");
            }
        }

        if (isCNPJ(objeto.getPessoa_pj_cnpj()) == false) {
            throw new Exception("CNPJ inválido!");
        }

        if (objeto.getPessoa_pj_cnpj().equals("")) {
            throw new Exception("Informe o CNPJ do usuario");
        }
        if (objeto.getPessoa_pj_nomeFantasia().equals("")) {
            throw new Exception("Informe o nome fantasia do usuario");
        }
        if (objeto.getPessoa_pj_razaoSocial().equals("")) {
            throw new Exception("Informe a razão social");
        }

        Iterator<PessoaPJModel> listaDeUsuario = dal.getAll();
        for (Iterator<PessoaPJModel> it = listaDeUsuario; it.hasNext();) {
            PessoaPJModel aux = it.next();

            if ((objeto.getPessoa_idem() != aux.getPessoa_idem()) && (objeto.getPessoa_pj_cnpj().toUpperCase().
                    equalsIgnoreCase(aux.getPessoa_pj_cnpj().toUpperCase()))) {
                throw new Exception("O CNPJ --> " + objeto.getPessoa_pj_cnpj() + "\nJá existe no cadastro de usuarios!\n");
            }
            if ((objeto.getPessoa_idem() != aux.getPessoa_idem()) && (objeto.getPessoa_pj_razaoSocial().toUpperCase().
                    equalsIgnoreCase(aux.getPessoa_pj_razaoSocial().toUpperCase()))) {
                throw new Exception("A razao social --> " + objeto.getPessoa_pj_razaoSocial() + "\nJá existe no cadastro de usuarios!\n");
            }

        }
    }

    public boolean isCNPJ(String CNPJ) {
// considera-se erro CNPJ's formados por uma sequencia de numeros iguais
        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111")
                || CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333")
                || CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555")
                || CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777")
                || CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999")
                || (CNPJ.length() != 14)) {
            return (false);
        }

        char dig13, dig14;
        int sm, i, r, num, peso;

// "try" - protege o código para eventuais erros de conversao de tipo (int)
        try {
// Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 11; i >= 0; i--) {
// converte o i-ésimo caractere do CNPJ em um número:
// por exemplo, transforma o caractere '0' no inteiro 0
// (48 eh a posição de '0' na tabela ASCII)
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig13 = '0';
            } else {
                dig13 = (char) ((11 - r) + 48);
            }

// Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 12; i >= 0; i--) {
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig14 = '0';
            } else {
                dig14 = (char) ((11 - r) + 48);
            }

// Verifica se os dígitos calculados conferem com os dígitos informados.
            if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

    @Override
    public int addReturn(Object objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update(EnderecoModel endereco, PessoaPJModel pessoaPJModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
