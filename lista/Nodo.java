public class Nodo {
    private char info;
    private Nodo link;

    public Nodo(char info){
        this.info = info;
        link  = null; 
    }
    public void setInfo(char info) {
        this.info = info;
    }
    public void setLink(Nodo link) {
        this.link = link;
    }
    public char getInfo() {
        return info;
    }
    public Nodo getLink() {
        return link;
    }
}
