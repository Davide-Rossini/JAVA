class Main {
    public static void main(String[] args) {
          CD cd1=new CD("Burattino senza fili","E.Bennato",8,40);
          CD cd2=new CD("Bufalo Bill","F.De Gregori",10,45);
          System.out.println(cd1.toString());
          System.out.println(cd2.toString());
          if (cd1.compareDurata(cd2)==0)
              System.out.println("I due cd hanno la stessa durata");
          else if(cd1.compareDurata(cd2)==1)
                 System.out.println("Il primo Cd ha una durata maggiore");
               else
            System.out.println("Il secondo Cd ha una durata maggiore");
    }
  }