class Professore extends Persona{
    private String materia;
    private String scuola;
    private String ruolo;
    
    public Professore(String nome, String cognome, String materia, String scuola, String ruolo){
        super(nome, cognome);
        this.materia=materia;
        this.scuola=scuola;
        this.ruolo=ruolo;
    }
    
    public void stampa(){
        System.out.printf("Nome:'%s' Cognome:'%s' Materia:'%s' Scuola:'%s' Ruolo:'%s'\n",
        super.get_nome(),super.get_cognome(),this.materia,this.scuola,this.ruolo);
    }
    
}