package Nodo;

public class Main {
    public static void main(String[] args) {
        Parola p = new Parola();
        p.inserisciInTesta('o');
        p.inserisciInTesta('a');
        p.inserisciInTesta('i');
        p.inserisciInTesta('c');
        //p.inserisciInPosizione('c', 1);
        //p.eliminaInPosizione(5);
        //p.find('c', 's');
        //p.invertiLista();    
        //p.toString();
        p.primoultimo();    
        System.out.println(p.toString());
        
    }
}
