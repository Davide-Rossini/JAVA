package Comparable;

import java.util.Scanner;

public class Gruppo {
    private Persona gruppo[];
    private static int n;

    public Gruppo(){
        n = 5;
        gruppo = new Persona[n];
    }

    public void aggiungiPersona(){
        if(gruppo.length > n){
            return;
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci il nome");
        String nome = s.nextLine();
        System.out.println("Inserisci il cognome");
        String cognome = s.nextLine();
        System.out.println("Inserisci l'eta");
        int eta = Integer.parseInt(s.nextLine());
        System.out.println("Inserisci il sesso");
        char sesso = s.next().charAt(0);
    }
}
