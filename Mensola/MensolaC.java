
public class MensolaC {
// Attributi
 private static final int MAX_NUM_VOLUMI=15;
 private Libro volumi[];

 public MensolaC() {
  volumi=new Libro[MAX_NUM_VOLUMI];
 }

 public MensolaC(MensolaC mensola) {
 int posizione;
 volumi=new Libro[MAX_NUM_VOLUMI];
 for(posizione=0; posizione<MAX_NUM_VOLUMI; posizione++) {
  if (mensola.getVolume(posizione)!=null)
   volumi[posizione]=new Libro(mensola.getVolume(posizione));
 }
}

// Metodi
 public int setVolume(Libro libro, int posizione) {
  try {
// inserimento copia di libro in posizione
      
   if (volumi[posizione]!=null){
      if (getNumVolumi()==MAX_NUM_VOLUMI) 
       return -2; // mensola piena
      else
       for (int p=getNumVolumi();p>=posizione;p--)
           volumi[p+1]=volumi[p];
      }
   else
    if (posizione!=getNumVolumi())
        posizione=getNumVolumi();
      volumi[posizione]=new Libro(libro);
      return posizione; // restituisce la posizione di inserimento
  }
  catch (ArrayIndexOutOfBoundsException exception) {
   return -1; // posizione non valida
  }
 }
 public Libro getVolume(int posizione) {
  try {
  // restituisce una copia del libro in posizione
   return new Libro(volumi[posizione]);
  }
 catch (ArrayIndexOutOfBoundsException exception) {
  return null; // posizione non valida: nessun libro restituito
 }
  catch (NullPointerException exception) {
   return null; // posizione vuota: nessun libro restituito
  }
 }

 public void compattaVolumi(){
  int i=0,j=0,k=0;
  for (j=0;j<MAX_NUM_VOLUMI;j++)
    if (volumi[j]==null)
        for (i=j;i<MAX_NUM_VOLUMI-1;i++){
            volumi[i]=volumi[i+1];
            volumi[i+1]=null;
        }
 }
  
public int rimuoviVolume(int posizione) {
 int i;   
 try {
  volumi[posizione]=null; // rimozione libro in posizione
  compattaVolumi();
  return posizione; // restituisce la posizione liberata
 }
 catch (ArrayIndexOutOfBoundsException exception) {
  return -1; // posizione non valida
 }
}

public int getNumMaxVolumi() {
 return MAX_NUM_VOLUMI;
}
public int getNumVolumi() {
 int posizione, n=0;
 for (posizione=0; posizione<MAX_NUM_VOLUMI; posizione++)
  if (volumi[posizione]!=null)
   n++;
  return n;
 }

 public static void main (String[] args) throws java.io.IOException {
  MensolaC mensola = new MensolaC();
  int ris;
  Libro[] libri = new Libro[5];
      libri[0] = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1000);
      libri[1] = new Libro("c", "J.R.R. Tolkien", 1000);
      libri[2] = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1000);
      libri[3] = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1000);
      libri[4] = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1000);
      libri[5] = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1000);
  System.out.println("Numero volumi: "+mensola.getNumVolumi());
  // inserimento volumi
  for(int i = 0; i<6;i++){
    mensola.setVolume(libri[i], i);
  }
  System.out.println(mensola.getVolume(1).getTitolo());

  
  System.out.println("Numero volumi: "+mensola.getNumVolumi());
  // visualizzazione elenco volumi
  for ( int posizione=0; posizione<mensola.getNumMaxVolumi(); posizione++) {
    Libro libro = mensola.getVolume(posizione);
    if (libro != null)
      System.out.println( "posizione: "+posizione+" -> "+libro.getTitolo()+" "+libro.prezzo()+"�");
  }
  mensola.rimuoviVolume(0);
   for ( int posizione=0; posizione<mensola.getNumMaxVolumi(); posizione++) {
    Libro libro = mensola.getVolume(posizione);
    if (libro != null)
      System.out.println( "posizione: "+posizione+" -> "+libro.getTitolo()+" "+libro.prezzo()+"�");
  }
} 
}