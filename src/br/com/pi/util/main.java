package br.com.pi.util;

import br.com.pi.bll.PessoaBll;
import br.com.pi.model.Pessoa;
import br.com.pi.model.PessoaPF;

public class main {
    public static void main(String[] args) {
     try {
         Pessoa p = new Pessoa();

         PessoaBll a = new PessoaBll();

         p.setPessoa_email("teste@a.com");
         p.setPessoa_telefone("20202020");
         p.setPessoa_nome("watlas");
         a.add(p);
    }catch (Exception e){
         System.out.println(e.getMessage());

     }


}}
