package CartellaClinica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Clinica {
    ArrayList<CartellaClinica> clinica = new ArrayList<CartellaClinica>(); // creo l'arraylist clinica

    public void aggiungi(CartellaClinica a){ // metodo aggiungi, passo la cartella clinica e utilizzo il metodo add per aggiungerlo all'arraylist
        clinica.add(a);
    }

    public CartellaClinica cancella(String cognomePaziente){ //metodo cancella di tipo CartellaClinica per il ritorno del metodo remove(), passo il cognome
        if(clinica.size() == 0){ // controllo se l'arraylist è vuoto
            System.out.println("Errore, la clinica è vuota\n"); 
            return null; //ritorno null per poter fare un ulteriore controllo alla fine del metodo
        }
        else for (CartellaClinica c : clinica){ // for each per scorrere l'arraylist e controllare se il cognome è uguale a quello passato, se lo è rimuovo la cartella clinica
            if (c.getCognomePaziente().equals(cognomePaziente)){
                clinica.remove(c);
                System.out.println("Cartella rimossa\n");
                return c;
            }
        }
        System.out.println("Cartella non trovata\n"); // se si arriva a questo punto significa che il cognome inserito non è stato trovato nell'arraylist e ritorno null
        return null;
    }

    public void visualizza(){ //metodo visualizza
        int count = 1; //faccio partire un contatore a 1 per stampare il numero della cartella clinica
        if (clinica.size() == 0){ //controllo se l'arraylist è vuoto
            System.out.println("Errore, la clinica è vuota\n");
            return;
        }
        else for(CartellaClinica f : clinica){ //for each per stampare tutte le cartelle cliniche dell'arraylist
            System.out.println("Cartella clinica "+count+"\n");
            System.out.println("Nome: "+f.getNomePaziente()+"\n");
            System.out.println("Cognome: "+f.getCognomePaziente()+"\n");
            System.out.println("Data di nascita: "+f.getDataNascita()+"\n");
            System.out.println("Codice fiscale: "+f.getCodiceFiscale()+"\n");
            System.out.println("Numero di telefono: "+f.getNumeroTelefono()+"\n");
            System.out.println("Data della visita: "+f.getDataVisita()+"\n");
            System.out.println("Diagnosi: "+f.getDiagnosi()+"\n");
            count ++; //incremento il contatore per poter aggiornare il numero della cartella clinica
        }
    }

    public void cerca(String cognomePaziente){ //metodo cerca
        if(clinica.size() == 0){ // controllo se l'arraylist è vuoto
            System.out.println("Errore, la clinica è vuota\n");
            return;
        }
        else for (CartellaClinica c : clinica){ // for each per cercare la cartella clinica con il cognome passato
            if (c.getCognomePaziente().equals(cognomePaziente)){ // se la trova stampa la cartella clinica
            System.out.println("Nome: "+c.getNomePaziente()+"\n");
            System.out.println("Cognome: "+c.getCognomePaziente()+"\n");
            System.out.println("Data di nascita: "+c.getDataNascita()+"\n");
            System.out.println("Codice fiscale: "+c.getCodiceFiscale()+"\n");
            System.out.println("Numero di telefono: "+c.getNumeroTelefono()+"\n");
            System.out.println("Data della visita: "+c.getDataVisita()+"\n");
            System.out.println("Diagnosi: "+c.getDiagnosi()+"\n");
            }
        }
        System.out.println("Cartella non trovata\n"); // se si arriva a questo punto significa che il cognome inserito non è stato trovato nell'arraylist
    }

    public void ordina(){ // metodo ordina
        if(clinica.size() == 0){ // controllo se l'arraylist è vuoto
            System.out.println("Errore, la clinica è vuota\n");
            return;
        }
        else {
                Collections.sort (clinica, new Comparator<CartellaClinica>(){ //riordino clinica istanziando un comparator, utilizzando il metodo compare, passando 2 cartelle cliniche dove si confronterà il cognome e ritorno il valore del metodo compare
                public int compare(CartellaClinica f, CartellaClinica g){
                    return f.getCognomePaziente().compareTo(g.getCognomePaziente());
                }
            });
        }
    }
}
