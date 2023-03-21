package Barca;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Scanner;
class Barca implements Serializable{
    private String nome;
    private String nazionalita;
    private int lunghezza;
    private int stazza;
    private String tipologia;

    public Barca(String nome, String nazionalita, int lunghezza, int stazza, String tipologia) {
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.lunghezza = lunghezza;
        this.stazza = stazza;
        this.tipologia = tipologia;
    }

    public String getNome() {
        return nome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public int getStazza() {
        return stazza;
    }

    public String getTipologia() {
        return tipologia;
    }
}

class PortoTuristico {
    private Barca[] postiBarca;

    public PortoTuristico() {
        postiBarca = new Barca[100];
    }

    public boolean assegnaPosto(Barca barca, int numeroPosto) {
      
        if (numeroPosto < 1 || numeroPosto > 100) {
            System.out.println("Numero posto non valido");
            return false;
        }
        if (numeroPosto <= 20 && barca.getLunghezza() > 10) {
            System.out.println("Questo posto non può ospitare barche più lunghe di 10 metri");
            return false;
        }
        if (barca.getTipologia().equals("vela") && numeroPosto > 50) {
            postiBarca[numeroPosto - 1] = barca;
            System.out.println("La barca " + barca.getNome() + " è stata assegnata al posto " + numeroPosto);
            return true;
        }
        else if (barca.getTipologia().equals("motore")) {
            postiBarca[numeroPosto - 1] = barca;
            System.out.println("La barca " + barca.getNome() + " è stata assegnata al posto " + numeroPosto);
            return true;
        }
        else {
            System.out.println("Questo posto non è disponibile per le barche a vela");
            return false;
        }
    }

    public void liberaPosto(int numeroPosto, int numeroGiorni) {
        if (postiBarca[numeroPosto - 1] == null) {
            System.out.println("Il posto " + numeroPosto + " non è occupato");
            return;
            }
            Barca barca = postiBarca[numeroPosto - 1];
            postiBarca[numeroPosto - 1] = null;
            double costoAffitto;
            if (barca.getTipologia().equals("vela")) {
                costoAffitto = barca.getLunghezza() * 10 * numeroGiorni;
            }
            else {
                costoAffitto = barca.getStazza() * 20 * numeroGiorni;
            }
            System.out.println("La barca " + barca.getNome() + " ha lasciato il posto " + numeroPosto + " e deve pagare un affitto di $" + costoAffitto);
        }

    public void Clear() throws FileNotFoundException, IOException{
        for(int i = 0; i < 100; i++){
            postiBarca[i] = null;
        }
    }
    public String toString(){
        String s = ""; 
        for(int k = 0; k < 100; k++){
            if(postiBarca[k]!= null)
            s += " / "+postiBarca[k].getNome();
        }
        return s;
    }
        
        public void trovaBarca(String nome) {
            for (int i = 0; i < 100; i++){
                if(postiBarca[i] != null && postiBarca[i].getNome().equals(nome)){
                    System.out.println("barca trovata nel posto "+i);
                }
            }
        }
        public void salvaPortoTuristico()throws java.io.IOException{
            ObjectInputStream stream = new ObjectInputStream(new FileInputStream("posti.bin"));
            try{
                this.postiBarca = (Barca[])stream.readObject();
            }
            catch (ClassNotFoundException exception){

            }
            stream.close();
        }
        public static void main(String[] args) throws IOException {
            
            PortoTuristico b = new PortoTuristico();
            int f;
            do{
                System.out.println(" 1: assegna posto\n 2: trova barca\n 3: libera posto\n 4: stampa\n  5: clear 0: exit");
                Scanner s = new Scanner(System.in);
                f = Integer.parseInt(s.nextLine());

                switch(f){
                    case 1:
                        System.out.println("inserisci il nome della barca: ");
                        String nome = s.nextLine();
                        System.out.println("inserisci la nazionalita della barca: ");
                        String nazionalita = s.nextLine();
                        System.out.println("inserisci la lunghezza della barca: ");
                        int lunghezza = Integer.parseInt(s.nextLine());
                        System.out.println("inserisci la stazza della barca: ");
                        int stazza = Integer.parseInt(s.nextLine());
                        System.out.println("inserisci la tipologia della barca: ");
                        String tipologia = s.nextLine();
                        Barca g = new Barca(nome, nazionalita, lunghezza, stazza, tipologia);
                        System.out.println("inserisci il posto: ");
                        int posto = Integer.parseInt(s.nextLine());
                        b.assegnaPosto(g, posto);
                        break;
                    case 2:
                        System.out.println("inserisci il nome: ");
                        nome = s.nextLine();
                        b.trovaBarca(nome);
                        break;
                    case 3:
                        System.out.println("inserisci il posto: ");
                        posto = Integer.parseInt(s.nextLine());
                        System.out.println("insersisci i giorni di sosta: ");
                        int giornisosta = Integer.parseInt(s.nextLine());
                        b.liberaPosto(posto, giornisosta);
                        break;
                    case 4: 
                        System.out.println(b.toString());
                        break;
                    case 5:
                        b.salvaPortoTuristico();
                        break;
                    case 6:
                        b.Clear();
                        break;
                    default:
                        System.out.println("confermare? reinserire il numero: ");
                        f = Integer.parseInt(s.nextLine());
                }
            } while(f != 0);
            

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
            JTextField stazzaField = new JTextField();
            JTextField tipologiaField = new JTextField();

            panel.add(new JLabel("Nome:"));
            panel.add(nomeField);
            panel.add(new JLabel("Nazionalita:"));
            panel.add(nazionalitaField);
            panel.add(new JLabel("Lunghezza:"));
            panel.add(lunghezzaField);
            panel.add(new JLabel("Stazza:"));
            panel.add(stazzaField);
            panel.add(new JLabel("Tipologia:"));
            panel.add(tipologiaField);

            JButton addButton = new JButton("Aggiungi Barca al database");
            panel.add(addButton);

        
        frame.getRootPane().setDefaultButton(addButton);
        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nomeField.requestFocusInWindow();
            }
        });
        

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nome = nomeField.getText();
                String nazionalita = nazionalitaField.getText();
                int lunghezza = Integer.parseInt(lunghezzaField.getText());
                int stazza = Integer.parseInt(stazzaField.getText());
                String tipologia = tipologiaField.getText();

                
                Barca v = new Barca(nome, nazionalita, lunghezza, stazza, tipologia);

                
                barche.add(v);

                
                nomeField.setText("");
                nazionalitaField.setText("");
                lunghezzaField.setText("");
                stazzaField.setText("");
                tipologiaField.setText("");
            }
        });
        JButton printButton = new JButton("Stampa database");
        panel.add(printButton);

        
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                int count = 0;
                for (Barca v : barche) {
                    
                    count++;
                    
                    panel.add(new JLabel("|                Barca: " + count));
                    panel.add(new JLabel("|                Nome: " + v.getNome()));
                    panel.add(new JLabel("|                Nazionalita: " + v.getNazionalita()));
                    panel.add(new JLabel("|                Lunghezza: " + v.getLunghezza()));
                    panel.add(new JLabel("|                Stazza: " + v.getStazza()));
                    panel.add(new JLabel("|                Tipologia: " + v.getTipologia()));
                    panel.add(new JLabel("----------------------------------------------- "));
                }
            }
        });
        */
        }

        }
      