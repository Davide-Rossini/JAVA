package Negozio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Negozio n = new Negozio();
        int scelta = 0;
        do {
            System.out.println("1. Aggiungi prodotto");
            System.out.println("2. Rimuovi prodotto");
            System.out.println("3. Stampa prodotti");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = input.nextInt();
            switch (scelta) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = input.next();
                    System.out.print("Prezzo: ");
                    double prezzo = input.nextDouble();
                    Prodotti p = new Prodotti(nome, prezzo);
                    n.aggiungiProdotto(p);
                    break;
                case 2:
                    System.out.print("Nome: ");
                    String nome1 = input.next();
                    n.rimuoviProdotto(nome1);
                    break;
                case 3:
                    n.stampaLista();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        } while (scelta != 0);
    }


}
