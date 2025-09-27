package Dominio;

public class Cliente extends BasePessoa {
    
    public String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cliente(Long id, String nome, String endereco, String telefone, String cpf) {
        super(id, nome, endereco, telefone);
        this.cpf = cpf;
    }

  
    

    
}
