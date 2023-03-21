
public class Calcolatrice {
    String nome;
    double nx;
    double ny;
    int numOp;
    static int DefOp;

    public Calcolatrice (String nome) {
        this.nome=nome;
    }

    public Calcolatrice (Calcolatrice p) {
        this.nome = p.getNome();
    }

    public static void setDefOp(int DefOp) {
        Calcolatrice.DefOp = DefOp;
    }

    public void setX(double nx) {
        this.nx=nx;
    }

    public void setY(double ny) {
        this.ny=ny;
    }

    public String getNome(){return nome;}

    public int getNumOp() {return numOp;}

    public int getDefOp() {return DefOp;}

    public double getX() {return nx;}

    public double getY() {return ny;}

    public void setNumOp(int numOp) {
        this.numOp = numOp;
    }

    public double somma(){
        double ris = nx+ny;
        return ris;
    }

    public double sottrazione(){
        double ris = nx-ny;
        return ris;
    }

    public double prodotto(){
        double ris = nx*ny;
        return ris;
    }

    public double divisione(){
        double ris = nx/ny;
        return ris;
    }

    public boolean verificaCambioPile() {
        if (getNumOp() >= getDefOp()) {
            boolean cambio = true;
            return cambio;
        }
        else {
            boolean cambio = false;
            return cambio;
        }
    }

    public boolean eseguiCambioPile(){
        if (verificaCambioPile() == true) {
            setNumOp(0);
            boolean cambiato = true;
            return cambiato;
        }
        else {
            boolean cambiato = false;
            return cambiato;
        }
    }
    
    public String toString(){
        String s = "nome: "+nome;
        return s;
    }

    public String verificaOperazione(char o, double ris) {
        if (o == 'S') {
            if (nx + ny==ris){
                return "Bravo hai indovinato";
            }
            else {
                return "Hai sbagliato, riprova!";
            }
        }
        else if (o=='P') {
            if (nx * ny==ris){
                return "Bravo hai indovinato!";
            }
            else {
                return "Hai sbagliato, riprova!";
            }
        }
        else if (o=='M'){
            if (nx - ny == ris){
                return "Bravo hai indovinato!";
            }
            else {
                return "Hai sbagliato, riprova!";
            }
        }
        else if (o=='D'){
            if (nx/ny==ris){
                return "Bravo hai indovinato!";
            }
            else {
                return "Hai sbagliato, riprova!";
            }
        }
        else return "Errore!";

    }

    public void azzeraNumeri(double nx, double ny) {
        nx = 0;
        ny = 0;
    }

}
