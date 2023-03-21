import java.util.Scanner;

public class MultaTutor {
    //attributi
    private String targa;
    private double tempo;
    private static double spazio;
    private static double limite;
    private static double importo;


    public MultaTutor(String targa, double tempo){//costruttore che gli passo targa e tempo
        setTarga(targa);//setto targa e tempo
        setTempo(tempo);
    }
    //metodi set
    public void setTarga(String targa){
        this.targa = targa;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    // metodi set valori statici
    public static void setImporto(double importo) {
        MultaTutor.importo = importo;
    }

    public static void setSpazio(double spazio) {
        MultaTutor.spazio = spazio;
    }

    public static void setLimite(double limite) {
        MultaTutor.limite = limite;
    }
    //metodi get
    public static double getImporto() {
        return importo;
    }

    public static double getSpazio() {
        return spazio;
    }

    public String getTarga() {
        return targa;
    }

    public static double getLimite() {
        return limite;
    }

    public double getTempo() {
        return tempo;
    }
    //metodo to string
    public String toString(String s){ //passo la stringa s
        s = "targa: "+targa+" tempo: "+tempo; //concateno i valori
        return s; //ritorno la stringa
    }

    public boolean multare(){ //metodo multare 
        boolean multa; // creo variabile multa
        if (calcoloVelocita()>limite){ //multa  = true solo se la velocita è > limite
            multa = true;
        }
        else {multa = false;} //altrimenti multa = false
        return multa;// ritorno multa
    }

    public double calcoloVelocita(){ //metodo calcolovelocita
        double velocita; // creo variabile velocita
        velocita = spazio/tempo; // formula velocita
        return velocita; //ritorno velocita
    }

    public double importoMulta(){ //metodo per calcolare l'importo della multa
        if (multare() == true){ //se il metodo multare ritorna true
        double diff; //creo variabile diff
        double ris; //creo variabile ris
        diff = calcoloVelocita() - limite; //diff è la differenza tra la velocita e il limite
        ris = diff * importo; //ris è il calcolo della multa, moltiplicando diff e importo
        return ris; //ritorno ris
        }
        else {return 0;} //se multare non è true ritorno 0
    }

    public void inserisci(){
        Scanner s = new Scanner(System.in);
        System.out.println("inserisci la targa");
        targa = s.nextLine();
    }


}