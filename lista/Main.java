public class Main {
    public static void main(String[] args) {
        Parola p = new Parola();
        p.inserisciInTesta('s');
        p.inserisciInTesta('o');
        p.inserisciInTesta('p');
        p.inserisciInTesta('a');
        //p.inserisciInPosizione('c', 1);
        //p.eliminaInPosizione(5);
        p.primoultimo();
        System.out.println(p.toString());

    }
}
