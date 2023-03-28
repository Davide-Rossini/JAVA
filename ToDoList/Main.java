package ToDoList;

import java.util.Scanner;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ToDoList t = new ToDoList();
        int scelta = 0;
        do {
            System.out.println("1. Aggiungi attivita");
            System.out.println("2. Rimuovi attivita");
            System.out.println("3. Stampa attivita");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = input.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Attivita: ");
                    String attivita = input.next();
                    System.out.println("Priorita: ");
                    int priorita = input.nextInt();
                    Attivita a = new Attivita(attivita, priorita);
                    t.aggiungiAttivita(a);
                    break;
                case 2:
                    System.out.println("Indice: ");
                    int indice = input.nextInt();
                    t.rimuoviAttivita(indice+1);
                    break;
                case 3:
                    t.stampaLista();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Scelta sbagliata");
            }
        } while (scelta != 0);
    }
}