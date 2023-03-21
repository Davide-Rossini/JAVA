public class Main {
    public static void main(String[] args) {
        Calcolatrice.setDefOp(5000);
        Calcolatrice c1;
        Calcolatrice c2;
        Calcolatrice c;

        c = new Calcolatrice ("c");
        c1 = new Calcolatrice ("Marco"); 
        c2 = new Calcolatrice ("Alice");


        c1.setX(4);
        c1.setY(5);
        c.setX(c1.getX()+1);
        c.setY(c1.getY()+1);

        
        Calcolatrice c3 = c2;


        c2.setX(3);
        c2.setY(5);

        System.out.println (c1.prodotto());


        System.out.println (c2.verificaOperazione('P', 15));


        c2.setX(3*5);
        c2.setY(2*7);
        System.out.println(c2.sottrazione());

        System.out.println(c1.getNumOp());

        if (c1.verificaCambioPile()==false) {
            System.out.println(c1);
        }
        if (c2.verificaCambioPile()==false){
            System.out.println(c2);
        }

        c1.eseguiCambioPile();

    }
     
}
