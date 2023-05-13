package Notaio;

public class Acquirente {
    private String nome;
    private String cognome;
    private String email;
    private String telefono;
    private String chiVende;
    private double prezzo;
    private double caparra;
    private boolean acquistoConMutuo;

    public Acquirente(String nome,String cognome,String email,String telefono,String chiVende,double prezzo,double caparra,boolean acquistoConMutuo){
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.telefono = telefono;
        this.chiVende =  chiVende;
        this.prezzo = prezzo;
        this.caparra=caparra;
        this.acquistoConMutuo = acquistoConMutuo;
    }

}
