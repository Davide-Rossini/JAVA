package Studenti;

public class Persona {
    private String nome;
    private String cognome;
    private int voto_1;
    private int voto_2;
    private int voto_3;

    public Persona(String nome, String cognome, int voto_1, int voto_2, int voto_3) {
        this.nome = nome;
        this.cognome = cognome;
        this.voto_1 = voto_1;
        this.voto_2 = voto_2;
        this.voto_3 = voto_3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getVoto_1() {
        return voto_1;
    }

    public void setVoto_1(int voto_1) {
        this.voto_1 = voto_1;
    }

    public int getVoto_2() {
        return voto_2;
    }

    public void setVoto_2(int voto_2) {
        this.voto_2 = voto_2;
    }

    public int getVoto_3() {
        return voto_3;
    }

    public void setVoto_3(int voto_3) {
        this.voto_3 = voto_3;
    }

    @Override
    public String toString() {
        return "Persona{" + "nome=" + nome + ", cognome=" + cognome + ", voto_1=" + voto_1 + ", voto_2=" + voto_2 + ", voto_3=" + voto_3 + '}';
    }
    

    
    
}