package FaKeDB;

import java.lang.management.ThreadInfo;
import java.time.LocalDate;
import java.util.HashMap;

import Dominio.Cliente;

public class ClasseClienteFaKeDB extends BaseFakeDB<Cliente>{
    
@Override
public HashMap<Long, Cliente> getTabela(){
    if (tabela == null) {
        this.tabela = new HashMap<>();
        this.CarregarDados();
    }
    return this.tabela;
}

public ClasseClienteFaKeDB(){
    super();
}

@Override
    protected void CarregarDados() {
        this.tabela.put(1L, new Cliente(1L,"lucas", "rua manga", "67-419448","14417417"));
        this.tabela.put(2L, new Cliente(2L,"matheus", "rua canada", "6458448","1898617"));
        this.tabela.put(3L, new Cliente(3L,"pedro", "rua das barbosas", "54118448","14498417"));
        this.tabela.put(4L, new Cliente(4L,"luizao", "rua chocolate", "161478448","1698417"));
        this.tabela.put(5L, new Cliente(5L,"noiza", "rua carteira", "14946548","14796417"));
    }


}
