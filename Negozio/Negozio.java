package Negozio;

import java.util.ArrayList;
import java.util.Iterator;

public class Negozio {
    
    private ArrayList<Prodotti> prodotti = new ArrayList<Prodotti>();
    
    
    public Negozio(){
        prodotti = new ArrayList<Prodotti>();
    }

    
    public void aggiungiProdotto(Prodotti p){
        prodotti.add(p);
    }

    public void rimuoviProdotto(String nome){
        for(int i=0; i<prodotti.size(); i++){
            if(prodotti.get(i).getNome().equals(nome)){
                prodotti.remove(i);
            }
        }
    }

    public void stampaLista(){
        for(int i=0; i<prodotti.size(); i++){
            System.out.println(prodotti.get(i).getNome());
        }
    }
}