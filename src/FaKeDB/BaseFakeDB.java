package FaKeDB;

import java.util.HashMap;

/**
 * BaseFakeDB
 */
public abstract class BaseFakeDB<TDominio> {

    protected HashMap<Long, TDominio> tabela;

    public abstract HashMap<Long, TDominio> getTabela();

    public BaseFakeDB() {
        this.tabela = new HashMap<>();
        this.CarregarDados();
    } 

    protected abstract void CarregarDados();

    
}