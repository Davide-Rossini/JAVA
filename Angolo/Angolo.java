package Angolo;
public class Angolo {
    private int g;
    private int p;
    private int s;

    public Angolo(int g, int p, int s){
        setG(g);
        setP(p);
        setS(s);
    }

    public Angolo(Angolo a){
        g=a.getG();
        p=a.getP();
        s=a.getS();
    }

    private void setG(int g){
        if(g<0)g=0;
        else if(g>359)g=359;
        this.g=g;
    }
    private void setP(int p){
        if(p<0)p=0;
        else if(p>59)p=59;
        this.p=p;
    }
    private void setS(int s){
        if(s<0)s=0;
        else if(s>59)s=59;
        this.s=s;
    }

    public int getG() {
        return g;
    }

    public int getP() {
        return p;
    }

    public int getS() {
        return s;
    }

    public String toString(){
        String a=g+" "+p+" "+s+" ";
        return a;
    }

    public void AggiungiGradi(int n){
        int g=getG()+n;
        setG(g);
    }

    public void AggiungiPrimi(int n){
        int p=getP()+n;
        setP(p);
    }

    public void AggiungiSecondi(int n){
        int s=getS()+n;
        setS(s);
    }

    public int AngoloSecondi(){
         int secondi=getS()+60*getP()+60*60*getG();
         return secondi;
    }


}