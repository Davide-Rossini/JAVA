class PortaCD{
    private int n;
    private CD c[];

    public PortaCD(int n){
        this.n = n;
    }

    public CD getCD(int pos){
        if(pos<n && pos>=0){
            return c[pos];
        }else{
            return null;
        }
    }

    public void setCD(CD c,int pos){
        this.c[pos]=new CD(c);
    }

    public void killCD(int pos) {
        if(pos<n&&pos>=0)c[pos]=null;
    }

    public int getN(){
        int conta = 0;
        for(int i = 0; i < n; i++){
            if(c[i]!=null){
                conta++;
            }
        }
        return conta;
    }

    public int cercaCDperTitolo(String titolo){
        int pos=0;
        for(int i = 0; i < n; i++){
            if(c[i].equals(titolo)){
                pos = i;
                break;
            }else{
                pos = -1;
            }
        }
        return pos;
    }
    
    public String toString(){
        String s = "";
        for(int i = 0; i < n; i++){
            s = "Il " + (i+1) + "Titolo: "+c[i].getTitolo()+" Autore: "+c[i].getAutore()+" Brani: "+c[i].getBrani()+" Durata: "+c[i].getDurata();
        }
        return s;
    }
    public  int confrontaCollezione(PortaCD p){
        int conta=0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (p.getCD(i)==c[j]);
                conta++;
            }
        }
        return conta;
    }
}