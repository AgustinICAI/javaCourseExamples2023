class AppFantasy2{

  public static void main (String argv[]){
    
    Usuario[] usuarios = new Usuario[50];    
    
    Usuario u1 = new Usuario("PEPE");
    u1.addJugador(new Jugador("Rodrigo de Paul", "Atletico del Madrid", 5000000, "Centrocampista")); 
    u1.addJugador(new Jugador("Koke", "Atletico del Madrid", 10000000, "Centrocampista")); 
    u1.addJugador(new Jugador("Marcos Llorente", "Atletico del Madrid", 10000000, "Centrocampista"));
    //u1.addEntrenador(new Entrenador("Cholo Simeone","Atletico del Madrid", 40000000, "Argentino"));
    usuarios[0] = u1;
    usuarios[0].setEntrenador(new Entrenador("Cholo Simeone","Atletico del Madrid", 40000000,"Masculino", "Argentino"));
    
        
    Usuario u2 = new Usuario("PACO");
    u2.addJugador(new Jugador("Kondoglia", "Atletico del Madrid", 10000000, "Centrocampista"));
    u2.addJugador(new Jugador("Pablo Barrios", "Atletico del Madrid", 10000000, "Centrocampista"));
    u2.setEntrenador(new Entrenador("Xavi Hernandez","Barcelona F.C.", 10000000,"Masculino", "Tocar y tocar"));
    usuarios[1] = u2;
    
    for(int i = 0; i < usuarios.length;i=i+1)
      if(usuarios[i]!=null)
        System.out.println(usuarios[i].toString());  
    
    //NO SE PUEDE HACER PORQUE MIEMBRO ES ABSTRACTO
    //Miembro m = new Miembro("Juan","mi equipo",123121);
    //Upcasting
    Miembro m = new Entrenador("Cholo Simeone","Atletico del Madrid", 40000000,"Masculino", "Argentino");
    
        
  }

}
