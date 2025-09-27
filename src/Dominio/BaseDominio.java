package Dominio;

public abstract class BaseDominio {
    
    private Long id;

   
    public BaseDominio(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    

}
