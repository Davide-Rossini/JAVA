import java.util.InputMismatchException;
import java.util.Scanner;
public class ContoCorrente {
    private float valore;
    private String numConto;


    public ContoCorrente(float valore, String numConto){
        this.numConto = numConto;
        this.valore= valore;
    }
    public void setNumConto(String numConto) {
        this.numConto = numConto;
    }

    public void setValore(float valore) {
        this.valore = valore;
    }

    public String getNumConto() {
        return numConto;
    }

    public float getValore() {
        return valore;
    }

    public String stampaSaldo(){
        String s;
        s= "il saldo è: "+valore;
        return s;
    }

    public void versa(){
        Scanner s  = new Scanner(System.in);
        System.out.println("Inserisci l'importo che vuoi versare: ");
        float versato = Float.parseFloat(s.nextLine());
        valore = valore + versato;
        System.out.println("nuovo saldo: "+valore);

    }
    
    public void preleva()throws Exception{
        try{
            Scanner s  = new Scanner(System.in);
            System.out.println("Inserisci l'importo che vuoi prelevare: ");
            float prelievo = Float.parseFloat(s.nextLine());
            if (prelievo > valore){
                throw new Exception("saldo inferiore all'importo");
            }
            else{valore = valore - prelievo; System.out.println("nuovo saldo: "+valore);}
        }
        catch(NumberFormatException e){
            System.out.println("Inserire un numero!");
        }
        
    }
    
}