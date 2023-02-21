package fantasy.ui;
import fantasy.domain.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
class AppFantasy6{

  public static void main (String argv[]){
    
    
    //ArrayList al = new ArrayList();
    Collection c1 = new ArrayList();
    
    c1.add(new Jugador("Rodrigo de Paul", "Atletico del Madrid", 5000000, Posicion.CENTROCAMPISTA));
    c1.add(new Jugador("Koke", "Atletico del Madrid", 10000000, Posicion.CENTROCAMPISTA)); 
    c1.add(new Jugador("Koke", "Real Madrid", 10000000, Posicion.CENTROCAMPISTA)); 
    c1.add(new Jugador("Rodrigo de Paul", "Real Madrid", 5000000, Posicion.CENTROCAMPISTA)); 


    System.out.println("Rodrigo".hashCode());
    Jugador j1 = new Jugador("Rodrigo de Paul", "Real Madrid", 5000000, Posicion.CENTROCAMPISTA);
    
    System.out.println(j1.hashCode());
    
    
    
    
  }

}
