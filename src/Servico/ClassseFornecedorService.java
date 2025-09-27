package Servico;
import java.util.ArrayList;
import Dominio.Fornecedor;
import Repositorio.FornecedorRepossitorio;

public class ClassseFornecedorService extends BaseServico<FornecedorRepossitorio, Fornecedor>{
 
    
    public ClassseFornecedorService(){
        this.repo = new FornecedorRepossitorio();
            
        }
    
        @Override
        public ArrayList<Fornecedor> Browse() {
           return this.repo.ReadAllAsArrayList();
        }
    
        @Override
        public Fornecedor Read(java.lang.Long chave) {
          return this.repo.Read(chave);
        }
    
    
        @Override
        public Fornecedor Editar(Long chave, Fornecedor instancia) {
            return this.repo.Update(chave, instancia);
        }
    
        @Override
        public Fornecedor Add(Fornecedor instancia) {
           return this.repo.Create(instancia);
        }
    
        @Override
        public Fornecedor Delete(java.lang.Long instancichave) {
          return this.repo.Delete(instancichave);
        }
    }