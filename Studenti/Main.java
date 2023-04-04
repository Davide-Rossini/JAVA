package Studenti;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> studenti = new ArrayList<>();
        Persona s = new Persona("andrea", "culiotti", 10, 6, 5);
        Persona l = new Persona("skerdi", "lincoln", 2, 6, 9);

        studenti.add(s);
        studenti.add(l);

        int voti = 3;
        Iterator<Persona> iteratore = studenti.iterator();
        while(iteratore.hasNext()){
            Persona a = iteratore.next();
            int media = (a.getVoto_1() + a.getVoto_2() + a.getVoto_3())/voti;
            if(media < 6){
                iteratore.remove();
            }
        }

        for (Persona i:studenti){
            System.out.println(studenti);
        }
    }
}

