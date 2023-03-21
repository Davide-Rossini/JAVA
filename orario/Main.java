import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("inserisci l'ora");
        int h = Integer.parseInt(tastiera.nextLine());
        System.out.println("inserisci i minuti");
        int m = Integer.parseInt(tastiera.nextLine());
        System.out.println("inserisci secondi");
        int s = Integer.parseInt(tastiera.nextLine());

        if (h>=24 || h<0||m>=60 || m<0||s>=60 || s<0) {
            throw new ArithmeticException("ora sbagliata!");
        }
        else {
            System.out.println("ora corretta");
        }
    }
}
