package ToDoList;

public class Attivita {
    private String attivita;
    private int priorita;

    public Attivita(String attivita, int priorita) {
        this.attivita = attivita;
        this.priorita = priorita;
    }

    public String getAttivita() {
        return attivita;
    }

    public void setAttivita(String attivita) {
        this.attivita = attivita;
    }

    public int getPriorita() {
        return priorita;
    }

    public void setPriorita(int priorita) {
        if(priorita > 0 && priorita <=5)
        this.priorita = priorita;
        else{System.out.println("Priorita fuori dai parametri");}
    }

}
