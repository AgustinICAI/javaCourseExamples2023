class AppFantasy2{

  public static void main (String argv[]){
    
    Usuario[] usuarios = new Usuario[50];    
    
    Usuario u1 = new Usuario("PEPE");
    u1.addJugador(new Jugador("Rodrigo de Paul", "Atletico del Madrid", 5000000, "Centrocampista")); 
    u1.addJugador(new Jugador("Koke", "Atletico del Madrid", 10000000, "Centrocampista")); 
    u1.addJugador(new Jugador("Marcos Llorente", "Atletico del Madrid", 10000000, "Centrocampista"));
    usuarios[0] = u1;
        
    Usuario u2 = new Usuario("PACO");
    u2.addJugador(new Jugador("Kondoglia", "Atletico del Madrid", 10000000, "Centrocampista"));
    u2.addJugador(new Jugador("Pablo Barrios", "Atletico del Madrid", 10000000, "Centrocampista"));
    usuarios[1] = u2;
    
    for(int i = 0; i < usuarios.length;i=i+1)
      if(usuarios[i]!=null)
        System.out.println(usuarios[i].toString());
        
    
    
    char c = 'a';
    char[] sexo = new char[8];
    sexo[0] = 'f';
    sexo[1] = 'e';    
    sexo[2] = 'm';
    sexo[3] = 'e';
    sexo[4] = 'n';
    sexo[5] = 'i';
    sexo[6] = 'n';
    sexo[7] = 'o';
        
    //Usuario.MAX_JUGADORES = 30;
    Jugador.SEXO = "Femenino";        
     
    String cadena = new String(sexo);
    
    String cadena2 = "femenino";

        
  }

}
