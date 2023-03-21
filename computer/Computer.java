import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Scanner;


public class Computer implements Serializable{
    private int codice;
    private String marca;
    private String modello; 
    private double vel_processore;
    private int dim_ram;
    private double dim_disco;
    private double dim_monitor;
    private int anno_acquisto;

    public Computer(String marca, String modello, double vel_processore, int dim_ram, double dim_disco, double dim_monitor, int anno_acquisto){
        this.marca = marca;
        this.modello = modello;
        this.vel_processore = vel_processore;
        this.dim_ram = dim_ram;
        this.dim_disco = dim_disco;
        this.dim_monitor = dim_monitor;
        this.anno_acquisto = anno_acquisto;
        this.codice = codice +1;

    }

    public void setAnno_acquisto(int anno_acquisto) {
        this.anno_acquisto = anno_acquisto;
    }
    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setDim_disco(double dim_disco) {
        this.dim_disco = dim_disco;
    }
    public void setDim_monitor(double dim_monitor) {
        this.dim_monitor = dim_monitor;
    }
    public void setDim_ram(int dim_ram) {
        this.dim_ram = dim_ram;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public void setVel_processore(double vel_processore) {
        this.vel_processore = vel_processore;
    }
    public int getAnno_acquisto() {
        return anno_acquisto;
    }
    public int getCodice() {
        return codice;
    }
    public double getDim_disco() {
        return dim_disco;
    }
    public double getDim_monitor() {
        return dim_monitor;
    }
    public int getDim_ram() {
        return dim_ram;
    }
    public String getMarca() {
        return marca;
    }
    public String getModello() {
        return modello;
    }
    public double getVel_processore() {
        return vel_processore;
    }
}
class ContComputer{
    private Computer[] c;
    private static int n_max = 100;

    public ContComputer(){
        
        c = new Computer[n_max];
    }

    public void aggiungiComputer(Computer a){
        for (int i = 0; i<n_max; i++){
            if(c[i] == null){
                c[i] = a;
                System.out.println("Computer inserito con codice: "+a.getCodice());
                break;
            }
        }
    }

    public void eliminaComputer(int codice){
        for(int i = 0; i<n_max; i++){
            if(c[i] != null && c[i].getCodice()==codice){
                System.out.println("computer "+c[i].getCodice()+" eliminato");
                c[i] = null;
                break;
            }
        }
    }
    public void ricercaCodice(int codice){
        for(int i = 0; i<n_max; i++){
            if(c[i] != null && c[i].getCodice()==codice){
                System.out.println("computer "+c[i].getCodice()+" trovato nel posto "+i);
                break;
            }
        }
    }
    public void computerCaratteristiche(double vel_processore, double dim_ram, double dim_disco){
        for(int i = 0; i<n_max; i++){
            if(c[i] != null && c[i].getVel_processore() > vel_processore && c[i].getDim_ram() > dim_ram && c[i].getDim_disco() > dim_disco){
                System.out.println("Computer migliore trovato:\n -codice:  "+c[i].getCodice()+"\n -marca: "+c[i].getMarca()+"\n -modello: "+c[i].getModello()+"\n -velocita del processore: "+c[i].getVel_processore()+"\n -dimensioni della RAM: "+c[i].getDim_ram()+"\n -dimensione disco: "+c[i].getDim_disco()+"\n dimensioni del monitor: "+c[i].getDim_monitor()+"\n anno di acquisto: "+c[i].getAnno_acquisto());
            }
        }
    }
    public void salvaComputer()throws java.io.IOException{
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream("computer.bin"));
        try{
            this.c = (Computer[])stream.readObject();
        }
        catch (ClassNotFoundException exception){

        }
        stream.close();
    }
    public static void main(String[] args) throws IOException {
        ContComputer p = new ContComputer();
        int scelta = 0;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("1) aggiungi computer\n 2) elimina computer\n 3) ricerca per codice\n 4) ricerca di tutti i computer con caratteristiche migliori\n 5) salva su file\n 0) exit");
            scelta = Integer.parseInt(s.nextLine());
            switch (scelta) {
                case 1:
                    System.out.println("inserisci la marca: ");
                    String marca = s.nextLine();
                    System.out.println("inserisci il modello: ");
                    String modello = s.nextLine();
                    System.out.println("inserisci la velocita del processore: ");
                    double vel_processore = Double.parseDouble(s.nextLine());
                    System.out.println("inserisci la dimensione della memoria RAM: ");
                    int dim_ram = Integer.parseInt(s.nextLine());
                    System.out.println("inserisci la dimensione del disco: ");
                    double dim_disco = Double.parseDouble(s.nextLine());
                    System.out.println("inserisci la dimensione del monitor: ");
                    double dim_monitor = Double.parseDouble(s.nextLine());
                    System.out.println("inserisci l'anno di acquisto': ");
                    int anno_acquisto = Integer.parseInt(s.nextLine());
                    Computer g = new Computer(marca, modello, vel_processore, dim_ram, dim_disco, dim_monitor, anno_acquisto);
                    p.aggiungiComputer(g);
                    break;
                case 2:
                    System.out.println("Inserisci il codice per eliminare: ");
                    int codice = Integer.parseInt(s.nextLine());
                    p.eliminaComputer(codice);
                    break;
                case 3: 
                    System.out.println("Inserisci il codice per eliminare: ");
                    int code = Integer.parseInt(s.nextLine());
                    p.ricercaCodice(code);
                    break;
                case 4: 
                    System.out.println("inserisci la velocita del processore: ");
                    double velprocessore = Double.parseDouble(s.nextLine());
                    System.out.println("inserisci la dimensione della memoria RAM: ");
                    int dimram = Integer.parseInt(s.nextLine());
                    System.out.println("inserisci la dimensione del disco: ");
                    double dimdisco = Double.parseDouble(s.nextLine());
                    p.computerCaratteristiche(velprocessore, dimram, dimdisco);
                    break;
                case 5:
                    p.salvaComputer();
                    break;
                default:
                    break;
            }
        }while(scelta != 0);
    }
}

