class AppFantasy{

  public static void main (String argv[]){
    
    Usuario u1 = new Usuario("PEPE");
    Jugador j1 = new Jugador("Rodrigo de Paul", "Atletico del Madrid", 5000000, "Centrocampista"); 
    Jugador j2 = new Jugador("Koke", "Atletico del Madrid", 10000000, "Centrocampista"); 
    u1.addJugador(j1);
    u1.addJugador(j2);
    u1.addJugador(new Jugador("Marcos Llorente", "Atletico del Madrid", 10000000, "Centrocampista"));
    
    System.out.println(u1.toString());    
    
    Usuario u2 = new Usuario("PACO");
    u2.addJugador(new Jugador("Kondoglia", "Atletico del Madrid", 10000000, "Centrocampista"));
    u2.addJugador(new Jugador("Pablo Barrios", "Atletico del Madrid", 10000000, "Centrocampista"));
    
    System.out.println(u2.toString());
        
        
        
        
        
    //Usuario.MAX_JUGADORES = 30;
    Jugador.SEXO = "Femenino";        
        
        
  }

}
