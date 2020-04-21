class Persona{
    
    private String cognome;
    private String nome;
    
    public Persona(String nome, String cognome){
        this.cognome=cognome;
        this.nome=nome;
    }
    
    public void set_nome(String nome){
        this.nome=nome;
    }
    
    public void set_cognome(String cognome){
        this.cognome=cognome;
    }
    
    public String get_nome(){
        return this.nome;
    }
    
    public String get_cognome(){
        return this.cognome;
    }
}