package Repositorio;

import java.util.List;

public interface IBaseRepositorio<TFakaDB, TDominio> {

TDominio Create(TDominio instancia);

TDominio Read(Long chave);

List<TDominio> ReadAll();

TDominio Update(Long chave, TDominio instancia);

TDominio Delete(Long chave);
}
