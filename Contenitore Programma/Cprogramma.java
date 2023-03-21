public class Cprogramma {
    int n;
    Programma p[];
    public Cprogramma(int n){
        setN(n);
        p = new Cprogramma[n];
    }

    public Cprogramma(Cprogramma c){

        n=c.getN();
        p = new Cprogramma[n];
    }

    public int getN() {
        return n;
    }

    private void setN(int n) {
        this.n = n;
    }

    public Programma getP(int pos){
        if(pos<n&&pos>=0) return p[pos];
        else return null;
    }

    public void setP(Programma p,int pos){
        this.p[pos]=new Programma(p);
    }

    public void killP(int pos) {
        if(pos<n&&pos>=0)p[pos]=null;
    }

    public int getNum(){
        int cont=0;
        for (int i=0;i<n;i++){
            if (p[i]!=null)cont++;
        }
        return cont;
    }
    
    public int cercaProgrammaPerDenominazione(String d){
        int r=-1;//programma non presente
        for(int i=0;i<n;i++){
            if(p[i]!=null&&p[i].getDenominazione()==d)r= i;
        }
        return r;
    }
    
    public String toString(){
        String s="";
        for(int i=0;i<n;i++){
            if(p[i]==null)s="";
            else s=p[i].getDenominazione();
        }
        return s;
    }
    
    public int confrontaContenitore(Cprogramma c1){
        int c=0;
        for (int i=0;i<n;i++){
            if(p[i]!=null){
                for (int j=0;j<n;j++){
                    if (c1.getP(j)!=null&&c1.getP(j).confrontaProgramma(p[i])==1)c++;
                }
            }
        }
        return c;
        }
        
    }