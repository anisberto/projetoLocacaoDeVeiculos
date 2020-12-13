/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi.design_patterns.factory;

/**
 *
 * @author watlas
 */
public enum EnumClasses {
    
  Pessoa, Pessoapf, Pessoapj;


    public static EnumClasses getPessoa() {
        return Pessoa;
    }

    public static EnumClasses getPessoapf() {
        return Pessoapf;
    }

    public static EnumClasses getPessoapj() {
        return Pessoapj;
    }


    
}
