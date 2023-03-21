import java.util.Set;

public class GestioneOrari {
    private int h;
    private int m;
    private int s;

    public GestioneOrari(int h, int m, int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setM(int m) {
        this.m = m;
    }
    public void setS(int s) {
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    private static boolean orarioValido (int h, int m, int s) {
        return (h>=0 && h<24 && m>=0 && m<60 && s>=0 && s<60);
    }
     

    public static int differenzaOrari (int h1, int m1, int s1, int h2, int m2, int s2) throws OrarioNonValido {
        if (!orarioValido (h1, m1, s1) )
          throw new OrarioNonValido (h1, m1, s1);
        else if (!orarioValido (h2, m2, s2) )
          throw new OrarioNonValido (h2, m2, s2);
        else{
            int sec1, sec2;
               sec1 = h1*3600 + m1 * 60 + s1;
               sec2 = h2*3600 + m2*60 + s2;
               return (sec2-sec1);
        }
        }
                    
     }
