package ToDoList;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Attivita> lista = new ArrayList<Attivita>();

    public ToDoList() {
        lista = new ArrayList<Attivita>();
    }

    public void aggiungiAttivita(Attivita a) {
        lista.add(a);
        for (int i = 0; i < lista.size(); i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i).getPriorita() < lista.get(j).getPriorita()) {
                    Attivita temp = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, temp);
                }
            }
        }
    }

    public void rimuoviAttivita(int indice) {
        lista.remove(indice);
    }

    public void modificaPriorita(int indice, int priorita) {
        lista.get(indice).setPriorita(priorita);
    }

    public void stampaLista() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getAttivita() + " " + lista.get(i).getPriorita());
        }
    }
}
