package Negozio;

import java.util.ArrayList;

public class Prodotti {

    private String nome;
    private double prezzo;

    private ArrayList<Prodotti> prodotti = new ArrayList<Prodotti>();

    public Prodotti(String nome, double prezzo){
        this.nome=nome;
        this.prezzo=prezzo;
    }

    public String getNome(){
        return nome;
    }
    public double getPrezzo(){
        return prezzo;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setPrezzo(double prezzo){
        this.prezzo=prezzo;
    }

    
}
