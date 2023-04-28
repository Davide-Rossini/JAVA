package MagazzinoThread;

public class Main {
    public static void main(String[] args) {

        Magazzino m = new Magazzino();
        try{
            Thread_class t = new Thread_class();
            Thread_class t2 = new Thread_class();
            Thread_class t3 = new Thread_class();
            Thread th1 = new Thread(t);
            Thread th2 = new Thread(t2);
            Thread th3 = new Thread(t3);
            th1.start();
            th2.start();
            th3.start();
        } catch (Exception e) {
            System.out.println("Errore");
        }

    }
}
