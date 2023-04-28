package MagazzinoThread;

public class Magazzino {
    private static int prodotto;

    public Magazzino() {
        prodotto = 100;
    }

    public static int getProdotto() {return prodotto;}

    public static int compra(int n) {
        if(vuoto())
            return -1;
        else
            prodotto -= n;

        return 0;
    }
    public static boolean vuoto() {
        return prodotto == 0;
    }
}
