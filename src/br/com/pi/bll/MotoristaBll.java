package br.com.pi.bll;

import br.com.pi.dal.MotoristaDal;
import br.com.pi.interfaces.ICRUD_GENERIC;
import br.com.pi.model.EnderecoModel;
import br.com.pi.model.MotoristaModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MotoristaBll implements ICRUD_GENERIC<MotoristaModel> {

    MotoristaDal motoristaDal;


    public MotoristaBll() {
        try {
            motoristaDal = new MotoristaDal();
        } catch (Exception e) {
        }
    }

    public void addAll(MotoristaModel motoristaModel, EnderecoModel endereco) throws Exception {
        try {
            motoristaDal.addAll(motoristaModel, endereco);
        } catch (Exception e) {
            throw e;
        }

    }

    public void updateAll(MotoristaModel motoristaModel, EnderecoModel endereco) throws Exception {
        try {
            motoristaDal.updateAll(motoristaModel, endereco);
        } catch (Exception e) {
            throw e;
        }
    }

    public void deleteAll(int MotoristaId, int Idendereco) throws Exception {
        try {
            motoristaDal.deleteAll(MotoristaId, Idendereco);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void add(MotoristaModel objeto) throws Exception {
        try {
            validate(objeto);
            motoristaDal.add(objeto);
        } catch (Exception e) {
            String erro = e.getMessage();
            if (erro.contains("duplicate key value violates unique constraint \"motorista_motorista_cpf_key\"")) {
                erro = "Ja existe esse CPF no nosso sistema de motorista.";
            }
            if (erro.contains("duplicate key value violates unique constraint \"motorista_motorista_rg_key\"")) {
                erro = "Ja existe esse RG no nosso sistema de motorista.";
            }
            if (erro.contains("duplicate key value violates unique constraint \"motorista_motorista_email_key\"")) {
                erro = "Ja existe esse Email no nosso sistema de motorista.";
            }
            throw new Exception(erro);
        }
    }

    @Override
    public void delete(int n) throws Exception {
        try {
            motoristaDal.delete(n);
        } catch (Exception e) {
          throw e;
        }
    }

    @Override
    public void update(MotoristaModel objeto) throws Exception {
        try {
            validate(objeto);
            motoristaDal.update(objeto);
        } catch (Exception e) {
            String erro = e.getMessage();
            if (erro.contains("duplicate key value violates unique constraint \"motorista_motorista_cpf_key\"")) {
                erro = "Ja existe esse CPF no nosso sistema de motorista.";
            }
            if (erro.contains("duplicate key value violates unique constraint \"motorista_motorista_rg_key\"")) {
                erro = "Ja existe esse RG no nosso sistema de motorista.";
            }
            if (erro.contains("duplicate key value violates unique constraint \"motorista_motorista_email_key\"")) {
                erro = "Ja existe esse Email no nosso sistema de motorista.";
            }
            throw new Exception(erro);
        }
    }


    @Override
    public Iterator getAll() throws Exception {
        try {
            return motoristaDal.getAll();
        } catch (Exception e) {
        }
        throw new IllegalArgumentException("Dados não acessiveis");
    }

    @Override
    public MotoristaModel getById(int n) throws Exception {
        try {
            return motoristaDal.getById(n);
        } catch (Exception e) {
        }
        throw new IllegalArgumentException("Dados não acessiveis");
    }

    @Override
    public MotoristaModel getByNome(String nome) throws Exception {
        try {
            return motoristaDal.getByNome(nome);
        } catch (Exception e) {
        }
        throw new IllegalArgumentException("Dados não acessiveis");
    }

    @Override
    public int addReturn(MotoristaModel objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void validate(MotoristaModel obj) throws Exception {
        if (obj.getMotorista_nome().isEmpty()) {
            throw new Exception("Preencha o nome");
        }
        if (obj.getMotorista_email().isEmpty()) {
            throw new Exception("Preencha o Email");
        }
        if (obj.getMotorista_rg().isEmpty()) {
            throw new Exception("Preencha o RG");
        }
        // Verifica se EMAIL é válido
        if (isValidEmailAddressRegex(obj.getMotorista_email()) == false) {
            throw new Exception("Não foi possível concluir sua solicitação"
                    + "\nO EMAIL informado não é válido");
        }
        //valida CPF
        if (isValidCPF(obj.getMotorista_cpf().replace(".", "").replace("-", "")) == false) {
            throw new Exception("Não foi possível concluir sua solicitação"
                    + "\nO CPF informado não é válido");
        }
        if (obj.getMotorista_telefone().isEmpty()) {
            throw new Exception("Preencha o Telefone");
        }
        //validaçoes CNH
        if (obj.getCnh_categoria().contains("Categoria CNH")) {
            throw new Exception("Preencha a categoria da CNH");
        }
        Date dataAtual = new Date();
        if (obj.getCnh_dataValidade().getTime() < dataAtual.getTime()) {
            throw new Exception("Você nao pode adicionar uma CNH vencida!");
        }
        if (obj.getCnh_numeroRegistro() == 0) {
            throw new Exception("Numero de registro invalido");
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

}
