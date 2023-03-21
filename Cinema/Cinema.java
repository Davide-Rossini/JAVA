package Cinema;

public class Cinema {
    private Nodo head;
    private int elementi;
    private Nodo tail;

    public Cinema(){
        head = null;
        elementi = 0;
        tail = null;
    }
    public int getElementi() {
        return elementi;
    }

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
    public String toString(){
        String s = "";
        Nodo p = head;
        if(p == null){
            return "vuoto";
        }
        while(p!=null){
            s+= "persona :"+p.getInfo() +". ";
            p = p.getLink();
        }
        return s;
    }
}
