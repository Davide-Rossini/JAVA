public class Main {
    public static void main(String[] args) {
        try{
            int ss = GestioneOrari.differenzaOrari(23, 10, 10, 23, 10, 50);
            System.out.println("nel primo la differenza dei secondi è:"+ss);

        }catch(OrarioNonValido exception){
            System.out.println("errore nell'orario specificato "+exception.getH()+":"+exception.getM()+":"+exception.getS());
        }
        try{
            int ss = GestioneOrari.differenzaOrari(21, 10, 10, 22, 0, 0);
            System.out.println("nel secondo i secondi di differenza sono:"+ss);
        }catch(OrarioNonValido exception){
            System.out.println("errore nell'orario specificato "+exception.getH()+":"+exception.getM()+":"+exception.getS());
        }   
    }
}
