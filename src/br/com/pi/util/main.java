package br.com.pi.util;

import br.com.pi.model.PessoaPF;

public class main {
    public static void main(String[] args) {
        PessoaPF cliente = new PessoaPF();

        cliente.setNome("watlas");
        cliente.setIdade(20);

        System.out.println(cliente.getIdade() + cliente.getNome());
    }
}
