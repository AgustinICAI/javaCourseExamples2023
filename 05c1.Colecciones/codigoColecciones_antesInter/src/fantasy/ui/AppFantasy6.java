package fantasy.ui;
import fantasy.domain.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.List;
class AppFantasy6{

  public static void main (String argv[]){
    
    
    //ArrayList al = new ArrayList();
    Collection<Miembro> c1 = new ArrayList<>();
    
    c1.add(new Jugador("Rodrigo de Paul", "Atletico del Madrid", 5000000, Posicion.CENTROCAMPISTA));
    c1.add(new Jugador("Koke", "Atletico del Madrid", 10000000, Posicion.CENTROCAMPISTA)); 
    c1.add(new Jugador("Koke", "Real Madrid", 10000000, Posicion.CENTROCAMPISTA)); 
    c1.add(new Jugador("Rodrigo de Paul", "Real Madrid", 5000000, Posicion.CENTROCAMPISTA)); 
    c1.add(new Jugador("Rodrigo de Paul", "Real Madrid", 5000000, Posicion.CENTROCAMPISTA)); 
    while(c1.contains(new Jugador("Koke")))
      c1.remove(new Jugador("Koke"));    
        
    c1.removeIf(e -> e.getEquipo().equals("Real Madrid"));
      
    System.out.println(c1.contains(new Jugador("Koke")));  
    
    //Collection no tiene un remove(int i) c1.remove(3);
    
    List l1 = (List) c1;
    
    //System.out.println("resultado del borrado " + l1.remove(3));
    //System.out.println("Jugador en posicion 0: " + l1.get(0));    
    
    Collection c2 = new LinkedList();
    
    
    
    
    //System.out.println(c1);
    for(Object o : c1){
      System.out.println(o);
      if(o instanceof Jugador){
        Jugador j = (Jugador)o;
        System.out.println(j.getEquipo());
      }
    }
    
    
    
    /*
    Jugador j1 = new Jugador("Rodrigo de Paul", "Atletico del Madrid", 5000000, Posicion.CENTROCAMPISTA);
    Jugador j2 = new Jugador("Koke", "Atletico del Madrid", 10000000, Posicion.CENTROCAMPISTA); 
    Jugador j3 = new Jugador("Rodrigo de Paul", "Real Madrid", 5000000, Posicion.CENTROCAMPISTA);
    Jugador j4 = j1;
    Entrenador e1 = new fantasy.domain.Entrenador("Cholo Simeone","Atletico del Madrid", 40000000,Miembro.Sexo.MASCULINO, "Argentino");

    System.out.println(j1==j3);
    System.out.println(j4==j1);
    
    System.out.println(j1.equals(j3));
    
    System.out.println(j4.toString());
    
    Miembro m1 = j4;
    
    System.out.println(m1.toString());
    */
    
    
  }

}
