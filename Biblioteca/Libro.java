package Biblioteca;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Libro implements Serializable{
    private String autore;
    private String titolo;
    private int anno;
    private String editore;

    public Libro(String autore, String titolo, int anno, String editore){
        this.titolo = titolo;
        this.anno = anno;
        this.editore = editore;
        this.autore = autore;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }
    public void setAutore(String autore) {
        this.autore = autore;
    }
    public void setEditore(String editore) {
        this.editore = editore;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public int getAnno() {
        return anno;
    }
    public String getAutore() {
        return autore;
    }
    public String getEditore() {
        return editore;
    }
    public String getTitolo() {
        return titolo;
    }
    }
    class Biblioteca{
        private Libro libri[];

        public Biblioteca(){
            libri = new Libro[1000];
        }
        public void aggiungiLibro(Libro libro){
            for(int i = 0; i < 1000; i++){
                if (libri[i] == null){
                    libri[i] = libro;
                    System.out.println("Libro inserito nel posto "+i);
                    break;
                }
            }
            
            
        }
        public void ricercaTitolo(String titolo){
            for(int k = 0; k < 1000; k++){
                if(libri[k]!= null && libri[k].getTitolo().equals(titolo)){
                    System.out.println("Libro trovato nel posto "+k);
                    break;
                }
            }
        }
        public void ricercaAutore(String autore){
            for(int k = 0; k < 1000; k++){
                if(libri[k]!= null && libri[k].getAutore().equals(autore)){
                    System.out.println("Libro "+libri[k].getTitolo()+" trovato nel posto "+k);
                }
            }
        }

        public void numeroLibri(){
            for(int i = 0; i < 1000; i++){
                if(libri[i]== null){
                    System.out.println("Sono inseriti "+i+1+" libri");
                    break;
                }
            }
        }
        public void salvaBiblioteca()throws java.io.IOException{
            FileOutputStream file = new FileOutputStream("biblioteca.bin");
            ObjectOutputStream oos = new ObjectOutputStream(file);
            oos.writeObject(libri);
            oos.close();
        }

        public void Clear() throws FileNotFoundException, IOException{
            FileOutputStream file = new FileOutputStream("biblioteca.bin");
            ObjectOutputStream oos = new ObjectOutputStream(file);
            for(int i = 0; i < 1000; i++){
                libri[i] = null;
            }
        }
        public void salvaSuFile(String biblioteca) throws IOException {
            FileWriter fw = new FileWriter(biblioteca);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i = 0; i < libri.length; i++) {
                if (libri[i] != null) {
                    pw.println("Autore: "+libri[i].getAutore() + "\nTitolo: " + libri[i].getTitolo() + "\nAnno: " + libri[i].getAnno() + "\nEditore: " + libri[i].getEditore()+"\n");
                }
            }
            pw.close();
            bw.close();
            fw.close();
        }
    
    
    public static void main(String[] args) throws IOException {
        
        Biblioteca a = new Biblioteca();
        Scanner s = new Scanner(System.in);
        int scelta = 0;
        do{
            System.out.println("1) aggiungi libro\n 2) ricerca da titolo\n 3) libri di un autore\n 4) numero libri\n 5) salvataggio file\n 6) clear\n 7) crea file txt\n 0) exit");
            scelta =  Integer.parseInt(s.nextLine());
        switch(scelta){
            default: 
                System.out.println("confermare? reinserire la scelta");
                //scelta = Integer.parseInt(s.nextLine());
            case 1:
                try{
                    System.out.println("Inserisci l'autore: ");
                    String autore = s.nextLine();
                    System.out.println("Inserisci il titolo: ");
                    String titolo = s.nextLine();
                    System.out.println("Inserisci l'anno: ");
                    int anno = Integer.parseInt(s.nextLine());
                    System.out.println("Inserisci l'editore: ");
                    String editore = s.nextLine();
                    Libro l = new Libro(autore, titolo, anno, editore);
                    a.aggiungiLibro(l);
                }catch(NumberFormatException e){
                    System.out.println("Inserire correttamente l'anno!");
                }
                break;
            case 2:
                System.out.println("Inserisci il titolo del libro che vuoi cercare: ");
                String titolo_ricerca = s.nextLine();
                a.ricercaTitolo(titolo_ricerca);
                break;
            case 3:
                System.out.println("Inserisci l'autore per la ricerca: ");
                String autore_ricerca = s.nextLine();
                a.ricercaAutore(autore_ricerca);
                break;
            case 4:
                a.numeroLibri();
                break;
            case 5: 
                a.salvaBiblioteca();
                break;
            case 6: 
                a.Clear();
                break;
            case 7: 
                a.salvaSuFile("biblioteca.txt");
                break;
        }
        }while(scelta != 0);
        /*
        List<Libro> libri_a = new ArrayList<>();

            
            JFrame frame = new JFrame("Biblioteca");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setVisible(true);
            
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(0, 1));
            frame.add(panel);

            
            JScrollPane scroll = new JScrollPane(panel);
            scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            frame.add(scroll);

            JTextField autoreField = new JTextField();
            JTextField titoloField = new JTextField();
            JTextField annoField = new JTextField();
            JTextField editoreField = new JTextField();
            

            panel.add(new JLabel("Autore:"));
            panel.add(autoreField);
            panel.add(new JLabel("Titolo:"));
            panel.add(titoloField);
            panel.add(new JLabel("Anno:"));
            panel.add(annoField);
            panel.add(new JLabel("Editore:"));
            panel.add(editoreField);
            

            JButton addButton = new JButton("Aggiungi Libro");
            panel.add(addButton);

        
        frame.getRootPane().setDefaultButton(addButton);
        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                autoreField.requestFocusInWindow();
            }
        });
        

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String autore = autoreField.getText();
                String titolo = titoloField.getText();
                int anno = Integer.parseInt(annoField.getText());
                String editore = editoreField.getText();

                
                Libro v = new Libro(autore, titolo, anno, editore);

                
                libri_a.add(v);

                
                autoreField.setText("");
                titoloField.setText("");
                annoField.setText("");
                editoreField.setText("");
                
            }
        });
        JButton printButton = new JButton("Stampa Biblioteca");
        panel.add(printButton);

        
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                int count = 0;
                for (Libro v : libri_a) {
                    
                    count++;
                    
                    panel.add(new JLabel("|                Posto: " + count));
                    panel.add(new JLabel("|                Autore: " + v.getAutore()));
                    panel.add(new JLabel("|                Titolo: " + v.getTitolo()));
                    panel.add(new JLabel("|                Anno: " + v.getAnno()));
                    panel.add(new JLabel("|                Editore: " + v.getEditore()));
                    panel.add(new JLabel("----------------------------------------------- "));
                }
            }
        });
        */
    }
}



