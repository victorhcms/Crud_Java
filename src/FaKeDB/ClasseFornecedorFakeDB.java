package FaKeDB;

import java.util.HashMap;

import Dominio.Cliente;
import Dominio.Fornecedor;

public class ClasseFornecedorFakeDB extends BaseFakeDB<Fornecedor> {
    
       
@Override
public HashMap<Long, Fornecedor> getTabela(){
    if (tabela == null) {
        this.tabela = new HashMap<>();
        this.CarregarDados();
    }
    return this.tabela;
}

public ClasseFornecedorFakeDB(){
    super();
}


@Override
    protected void CarregarDados() {
        this.tabela.put(1L, new Fornecedor(1L,"lucas", "rua manga", "14941978448","14417417"));
        this.tabela.put(2L, new Fornecedor(2L,"joelson", "rua canela", "16546458448","1898617"));
        this.tabela.put(3L, new Fornecedor(3L,"fabiano", "rua dinheiro", "1656548448","14498417"));
        this.tabela.put(4L, new Fornecedor(4L,"eduardo", "rua japao", "16546478448","1698417"));
        this.tabela.put(5L, new Fornecedor(5L,"victor", "rua longe", "14946548","14796417"));
    }

}
