package Dominio;

public abstract class BasePessoa  extends BaseDominio {

    private String nome;

    private String endereco;

    private String telefone;

    public String getNome() {
        return nome;
    }


    public BasePessoa(Long id) {
        super(id);
    }


    public BasePessoa(Long id, String nome, String endereco, String telefone) {
        super(id);
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    
}
