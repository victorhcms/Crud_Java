package Servico;

import java.util.ArrayList;

import Dominio.Cliente;
import Repositorio.ClienteRepositorio;

public class ClasseClienteServico extends BaseServico<ClienteRepositorio, Cliente>{
    
    
    public ClasseClienteServico(){
    this.repo = new ClienteRepositorio();
        
    }

    @Override
    public ArrayList<Cliente> Browse() {
       return this.repo.ReadAllAsArrayList();
    }

    @Override
    public Cliente Read(java.lang.Long chave) {
      return this.repo.Read(chave);
    }


    @Override
    public Cliente Editar(Long chave, Cliente instancia) {
        return this.repo.Update(chave, instancia);
    }

    @Override
    public Cliente Add(Cliente instancia) {
       return this.repo.Create(instancia);
    }

    @Override
    public Cliente Delete(java.lang.Long instancichave) {
      return this.repo.Delete(instancichave);
    }
}