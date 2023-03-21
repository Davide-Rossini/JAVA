public class Programma {
    private String denominazione;
    private String produttore;
    private double versione;
    private String OS;
    private int anno;
    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public void setVersione(double versione) {
        this.versione = versione;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public String getProduttore() {
        return produttore;
    }

    public double getVersione() {
        return versione;
    }

    public String getOS() {
        return OS;
    }

    public int getAnno() {
        return anno;
    }



    public Programma(String denominazione, String produttore, double versione, String OS, int anno){
        this.denominazione=denominazione;
        this.produttore=produttore;
        this.versione=versione;
        this.OS=OS;
        this.anno=anno;
    }

    public Programma(Programma p){
        produttore=p.getProduttore();
        denominazione=p.getDenominazione();
        versione=p.getVersione();
        OS=p.getOS();
        anno= p.getAnno();
    }

    public int compareAnno(Programma p){
        if(anno==p.getAnno())
            return 1; //uguali
        else
            return 0; //diversi
    }
    public static int compareAnno(Programma p1,Programma p2){
        return  p1.compareAnno(p2);
    }

    public int confrontaProgramma(Programma p1){
        if (getDenominazione()==p1.getDenominazione()&&getAnno()==p1.getAnno()&&getOS()==p1.getOS()&&getProduttore()==p1.getProduttore()&&getVersione()==p1.getVersione())return 1;
        else return 0;
    }

}