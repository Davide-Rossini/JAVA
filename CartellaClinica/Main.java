package CartellaClinica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Clinica c = new Clinica(); //creo la clinica
        Scanner s = new Scanner(System.in); //creo scanner per gli input
        int scelta = 0; // creo scelta che verra poi inserita in input
        do {
            System.out.println("1) Aggiungi\n2) Cancella\n3) Visualizza\n4) Cerca\n5) Ordina\n0) Exit\n");
            scelta = Integer.parseInt(s.nextLine()); //input di scelta
            switch (scelta) {
                case 1: //aggiungi
                    System.out.println("Inserisci il nome:\n");
                    String nome = s.nextLine();
                    System.out.println("Inserisci il cognome:\n");
                    String cognome = s.nextLine();
                    System.out.println("Inserisci la data di nascita:\n");
                    String d_nascita = s.nextLine();
                    System.out.println("Inserisci il codice fiscale:\n");
                    String c_fiscale = s.nextLine();
                    System.out.println("Inserisci il numero di telefono:\n");
                    String n_telefono = s.nextLine();
                    System.out.println("Inserisci la data della visita:\n");
                    String d_visita = s.nextLine();
                    System.out.println("Inserisci la diagnosi:\n");
                    String diagnosi = s.nextLine();
                    CartellaClinica g = new CartellaClinica(nome, cognome, d_nascita, c_fiscale, n_telefono, d_visita, diagnosi);
                    c.aggiungi(g);
                    break;
                case 2: //cancella
                    System.out.println("Inserisci il cognome:\n");
                    String cognome_2 = s.nextLine();
                    c.cancella(cognome_2);
                    break;
                case 3://visualizza
                    c.visualizza();
                    break;
                case 4: //cerca
                    System.out.println("Inserisci il cognome:\n");
                    String cognome_3 = s.nextLine();
                    c.cerca(cognome_3);
                    break;
                case 5://ordina
                    c.ordina();
                    c.visualizza();
                    break;
                default:
                    break;
            }
        } while (scelta != 0);
    }
}
