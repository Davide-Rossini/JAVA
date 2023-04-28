package MagazzinoThread;

public class Thread_class implements Runnable{
    @Override
    public void run() {
        int n;
        boolean vuoto = Magazzino.vuoto();
        while(!vuoto) {
            n = (int) (Math.random() * 5 + 1);
            Magazzino.compra(n);
            System.out.println("Acquistati " + n + " prodotti.");
            vuoto = Magazzino.vuoto();
        }

        System.out.println("Prodotti finiti");

    }
}

