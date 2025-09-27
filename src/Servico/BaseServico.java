package Servico;

import java.util.ArrayList;

public abstract class BaseServico <TRepositorio, TDominio> {

    protected TRepositorio repo;

    //BREAD
    
    public abstract ArrayList<TDominio> Browse();
    public abstract TDominio Read(Long chave);
    public abstract TDominio Editar(Long chave, TDominio instancia);
    public abstract TDominio Add(TDominio instancia);
    public abstract TDominio Delete(Long instancichave);
 
 


    
}
