package Repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Dominio.Cliente;
import Dominio.Fornecedor;
import FaKeDB.ClasseClienteFaKeDB;
import FaKeDB.ClasseFornecedorFakeDB;

public class FornecedorRepossitorio extends BaseRepositorio<ClasseFornecedorFakeDB, Fornecedor>
        implements IBaseRepositorio<ClasseFornecedorFakeDB, Fornecedor> {

    public FornecedorRepossitorio() {
        this.fakaDB = new ClasseFornecedorFakeDB();
        this.dados = this.fakaDB.getTabela();
    }

    @Override
    public Fornecedor Create(Fornecedor instancia) {
        Long posicao = Long.valueOf(this.dados.size()) - 1;
        Long novaPosicao = posicao + 1;
        Long novaChave = this.Read(posicao).getId() + 1;
        instancia.setId(novaChave);
        this.dados.put(novaPosicao, instancia);
        return instancia;
    }

    public ArrayList<Fornecedor> ReadAllAsArrayList() {
        ArrayList<Fornecedor> list = new ArrayList<>();
        for (Map.Entry<Long, Fornecedor> produto : this.dados.entrySet()) {
            list.add(produto.getValue());
        }
        return list;
    }

    @Override
    public Fornecedor Read(Long chave) {
        if (this.dados.containsKey(chave)) {
            return this.dados.get(chave);
        } else {
            return null;
        }
    }

    @Override
    public List<Fornecedor> ReadAll() {
        return this.ReadAllAsArrayList();
    }

    @Override
    public Fornecedor Update(Long chave, Fornecedor instancia) {
        if (this.dados.containsKey(chave)) {
            Fornecedor objVelho = this.dados.get(chave);
            if (this.dados.replace(chave, objVelho, instancia)) {
                return instancia;
            } else {
                return null;
            }

        } else {
            return null;
        }

    }

    @Override
    public Fornecedor Delete(Long chave) {
        if (this.dados.containsKey(chave)) {
            Fornecedor apagado = this.dados.remove(chave);
            return apagado;
        } else {
            return null;
        }
    }

}
