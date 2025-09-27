package Repositorio;

import java.util.HashMap;

public abstract class BaseRepositorio<TFakaDB, TDominio> {
    protected TFakaDB fakaDB;
    protected HashMap<Long, TDominio> dados;
}
