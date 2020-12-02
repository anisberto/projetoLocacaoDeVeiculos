package br.com.pi.interfaces;

import java.util.Iterator;

public interface ICRUD_GENERIC<T> {

    public int addReturn(T objeto) throws Exception;
    
    public void add(T objeto) throws Exception;

    public void delete(int n)throws Exception;

    public void update(T objeto)throws Exception;

    public Iterator getAll()throws Exception;

    public T getById(int n)throws Exception;

    public T getByNome(String nome)throws Exception;

}
