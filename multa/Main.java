public class Main {
    public static void main(String[] args) {
        MultaTutor.setImporto(4.5); //setto i valori statici
        MultaTutor.setLimite(90);
        MultaTutor.setSpazio(5000);

        MultaTutor a; //creo i riferimenti
        MultaTutor b;
        MultaTutor c;
        MultaTutor d;

        a = new MultaTutor("ET654GG", 20); //creo gli oggetti
        b = new MultaTutor("RT846SD", 38.2);
        c = new MultaTutor( "HH235SS", 10.1);
        d = new MultaTutor("", 0);

        d.inserisci();



        
        
        


        
        System.out.println(d.getTarga());

        //System.out.println(a.multare()); //segnala se la prima macchina è da multare
        //System.out.println(b.calcoloVelocita()); // segnala la velocita della seconda macchina
        //System.out.println(c.importoMulta()); //stampa l'importo della multa della terza macchina
        //String s = "Ciao";
        //System.out.println(c.toString(s));
    }
}
