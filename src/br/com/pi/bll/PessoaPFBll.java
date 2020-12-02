package br.com.pi.bll;

import br.com.pi.dal.PessoaPFDal;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.PessoaPFModel;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PessoaPFBll implements ICRUD_GENERIC {

    PessoaPFDal dal;

    public PessoaPFBll() throws Exception {
        dal = new PessoaPFDal();
    }

    @Override
    public void add(Object objeto) throws Exception {
        try {
            validaPessoa((PessoaPFModel) objeto);
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
            validaPessoa((PessoaPFModel) objeto);
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

    public static boolean isValidEmailAddressRegex(String email) {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }

    public void validaPessoa(PessoaPFModel objeto) throws Exception {
        String nome = objeto.getPessoa_nome().trim().toLowerCase();
        String invalidos = "1234567890'\"!@#$%¨&*()-_+={[}]/?><;:";
        for (int i = 0; i < invalidos.length(); i++) {
            if (nome.contains("" + invalidos.charAt(i))) {
                throw new Exception("Nome de usuario inválido!");
            }
        }

        // Verifica se EMAIL é válido
        if (isValidEmailAddressRegex(objeto.getPessoa_email()) == false) {
            throw new Exception("Não foi possível concluir sua solicitação"
                    + "\nO EMAIL informado não é válido");
        }

        if (objeto.getPessoa_pf_cpf().equals("")) {
            throw new Exception("Informe o CPF do usuario");
        }
        if (objeto.getPessoa_pf_rg().equals("")) {
            throw new Exception("Informe o RG do usuario");
        }
        //valida CPF
        if (isValidCPF(objeto.getPessoa_pf_cpf().replace(".", "").replace("-", "")) == false) {
            throw new Exception("Não foi possível concluir sua solicitação"
                    + "\nO CPF informado não é válido");
        }

        Iterator<PessoaPFModel> listaDeUsuario = dal.getAll();
        for (Iterator<PessoaPFModel> it = listaDeUsuario; it.hasNext(); ) {
            PessoaPFModel aux = it.next();

            if ((objeto.getPessoa_idem() != aux.getPessoa_idem()) && (objeto.getPessoa_pf_rg().toUpperCase().
                    equalsIgnoreCase(aux.getPessoa_pf_rg().toUpperCase()))) {
                throw new Exception("O RG --> " + objeto.getPessoa_pf_rg() + "\nJá existe no cadastro de usuarios!\n");
            }
            if ((objeto.getPessoa_idem() != aux.getPessoa_idem()) && (objeto.getPessoa_pf_cpf().toUpperCase().
                    equalsIgnoreCase(aux.getPessoa_pf_cpf().toUpperCase()))) {
                throw new Exception("O CPF --> " + objeto.getPessoa_pf_cpf() + "\nJá existe no cadastro de usuarios!\n");
            }

        }
    }

    public static boolean isValidCPF(String CPF) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000")
                || CPF.equals("11111111111")
                || CPF.equals("22222222222") || CPF.equals("33333333333")
                || CPF.equals("44444444444") || CPF.equals("55555555555")
                || CPF.equals("66666666666") || CPF.equals("77777777777")
                || CPF.equals("88888888888") || CPF.equals("99999999999")
                || (CPF.length() != 11)) {
            return (false);
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                // converte o i-esimo caractere do CPF em um numero:
                // por exemplo, transforma o caractere '0' no inteiro 0
                // (48 eh a posicao de '0' na tabela ASCII)
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico
            }
            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

            // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
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
}
