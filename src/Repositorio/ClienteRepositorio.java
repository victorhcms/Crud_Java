package Repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Dominio.Cliente;
import FaKeDB.ClasseClienteFaKeDB;

public class ClienteRepositorio extends BaseRepositorio<ClasseClienteFaKeDB, Cliente> implements IBaseRepositorio<ClasseClienteFaKeDB, Cliente> {
    
    public ClienteRepositorio(){
        this.fakaDB = new ClasseClienteFaKeDB();
        this.dados = this.fakaDB.getTabela();
    }

    @Override
    public Cliente Create(Cliente instancia) {
     Long posicao = Long.valueOf(this.dados.size()) - 1;
     Long novaPosicao = posicao + 1;
     Long novaChave = this.Read(posicao).getId() + 1;
     instancia.setId(novaChave);
     this.dados.put(novaPosicao, instancia);
        return instancia;
    }

    public ArrayList<Cliente> ReadAllAsArrayList(){
          ArrayList<Cliente> list = new ArrayList<>();
       for(Map.Entry<Long, Cliente> produto : this.dados.entrySet()){
            list.add(produto.getValue());
       }
        return list;
    }

    @Override
    public Cliente Read(Long chave) {
       if (this.dados.containsKey(chave)) {
        return this.dados.get(chave);
       }else{
        return null;
       }
    }

    @Override
    public List<Cliente> ReadAll() {
        return this.ReadAllAsArrayList();
    }

    @Override
    public Cliente Update(Long chave, Cliente instancia) {
        if (this.dados.containsKey(chave)) {
            Cliente objVelho = this.dados.get(chave);
            if (this.dados.replace(chave, objVelho, instancia)) {
                return instancia;
            }else{
                return null;
            }
           
        }else{
            return null;
        }
       
    }

    @Override
    public Cliente Delete(Long chave) {
      if (this.dados.containsKey(chave)) {
        Cliente apagado = this.dados.remove(chave);
        return apagado;
      }else{
        return null;
        }
    }

}
