package Angolo;
public class Main {
    public static void main(String[] args) {
        Angolo a = new Angolo(300, 4,42);
        a.AggiungiGradi(20);
        a.AggiungiPrimi(51);
        a.AggiungiSecondi(2);
        System.out.println(a.toString());
        System.out.println(a.AngoloSecondi());
    }
}
