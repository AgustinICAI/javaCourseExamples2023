class Usuario{
  String alias;
  double presupuesto;
  int puntos;
  Jugador plantilla[];
  //Jugador[] plantilla; 
  int numJugadores;
  final static int MAX_JUGADORES = 24;
  
  Usuario (String alias){
    this.alias = alias;
    presupuesto = 100000000;
    puntos = 0;
    plantilla = new Jugador[MAX_JUGADORES];
    numJugadores = 0;
  }
  /*
  void addJugador(Jugador jugador){
    if(numJugadores >= MAX_JUGADORES){
      System.err.println("No caben más jugadores. Máximo "+MAX_JUGADORES);
      return;
    }
    plantilla[numJugadores] = jugador;
    numJugadores+=1;
    
    /*
    if(numJugadores >= MAX_JUGADORES)
      System.err.println("No caben más jugadores. Máximo "+MAX_JUGADORES);
    else{
      plantilla[numJugadores] = jugador;
      numJugadores+=1;
    }
  }*/
  /*EJEMPLO DE AÑADIR USANDO UN BUCLE*/
  void addJugador(Jugador jugador){
    
    int i = 0;
    
    while(i < MAX_JUGADORES && plantilla[i] != null)
      i+=1;
    
    if(i>=MAX_JUGADORES)
      System.err.println("No caben más jugadores. Máximo "+MAX_JUGADORES);
    else
      plantilla[i]=jugador;
  }
  
  

  public String toString(){
    String cad = "USUARIO:" + alias + " - presupuesto: " + presupuesto + " - puntos: " + puntos;  
    cad += "\nJUGADORES "; // cad = cad + "\nJUGADORES "
    for(int i = 0; i < MAX_JUGADORES && plantilla[i] != null; i=i+1){
      /*Jugador j = plantilla[i];
      String stringJugador = j.toString();
      cad += "\n" + sJugador;
      */
      cad += "\n" + plantilla[i].toString();
    } 
    return cad;  
  }

}
