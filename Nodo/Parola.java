package Nodo;

public class Parola {
    private Nodo head;
    private int elementi;

    public Parola(){
        head = null;
        elementi = 0;
    }

    public void inserisciInTesta(char lettera){
        Nodo n = new Nodo(lettera);
        n.setLink(head);
        head = n;
        elementi++;
    }

    public void eliminaInTesta(){
        if(head == null){
            return;
        }
        head = head.getLink();
        elementi--;
    }

    public void inserisciInCoda(char lettera){
        Nodo pn = new Nodo(lettera);
        if(head == null){
            return;
        }
        Nodo p = head;
        while(p.getLink() != null){
            p = p.getLink();
        }
        p.setLink(pn);
        elementi++;
    }

    public void eliminaInCoda(){
        Nodo p = head, pp=head;
        if(head == null){
            return;
        }
        
        while(p.getLink() != null) {
            pp=p;
            p = p.getLink();
        }
        pp.setLink(null);
        elementi--;
    }

    public void inserisciInPosizione(char lettera, int posizione){
        Nodo p = new Nodo(lettera);
        Nodo pp;
        if(posizione <= 0){
            return;
        }
        if(posizione == 1){
            inserisciInTesta(lettera);
        }
        else{
            int i = 1;
            pp = head;
            while(i < posizione-1){
                pp = pp.getLink();
                i++;
            }
            p.setLink(pp.getLink());
            pp.setLink(p);
            elementi++;
        }

    
    }

    public void eliminaInPosizione(int posizione){
        Nodo pp = head, p = head;
        int i = 1;
        if(posizione <= 0){
            return;
        }
        if(posizione > elementi){
            return;
        }
        if(posizione == 1){
            eliminaInTesta();
        }
        else{
            while(i < posizione){
                pp = p;
                p = p.getLink();
                i++;
            }
            pp.setLink(p.getLink());
            elementi--;
        }
        
    }
    public String toString(){
        String s = "";
        Nodo p = head;
        if(p == null){
            return "vuoto";
        }
        while(p!=null){
            s+= "lettera :"+p.getInfo() +". ";
            p = p.getLink();
        }
        return s;
    }
    public void primoultimo(){
        Nodo pp = head, p = head;
        if(head == null){
            return;
        }
        while(p.getLink()!= null){
            p = p.getLink();
        }
        p.setLink(head);
        head = head.getLink();
        p.getLink().setLink(null);
    }
    public boolean find(char s, char info){
        Nodo p = head;
        while(p.getInfo() != info){
            p = p.getLink();
        }
            if(p.getLink() != null){
                System.out.println("collegato");
                return true;
            }
            else{
                System.out.println("non collegato");
                return false;
            }
        }
    public void invertiLista(){
        Nodo corrente = head, precedente = null;
        while(corrente != null){
            Nodo successivo = corrente.getLink();
            corrente.setLink(precedente);
            precedente = corrente;
            corrente = successivo;
        }
        head = precedente;

        
    }
}


    //per CODA
    /*
    public void enqueue(Persona p){
        Nodo n = new Nodo(p);
        if (head == null){
            head = n;
            tail = n;
        }
        else{
            tail.setLink(n);
            tail = n;
        }
        elementi++;
    }
    public Persona dequeue(){
        if(head == null){
            return null;
        }
        Persona p = head.getInfo();
        head = head.getLink();
        elementi--;
        return p;
    }
    */
    
