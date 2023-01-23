class Usuario{
  String alias;
  double presupuesto;
  int puntos;
  Jugador plantilla[];
  //Jugador[] plantilla; 
  int numJugadores;
  
  Usuario (String alias){
    this.alias = alias;
    presupuesto = 100000000;
    puntos = 0;
    plantilla = new Jugador[24];
    numJugadores = 0;
  }

  void addJugador(Jugador jugador){
    if(numJugadores >= 24){
      System.err.println("No caben más jugadores. Máximo 24");
      return;
    }
    plantilla[numJugadores] = jugador;
    numJugadores+=1;
    
    /*
    if(numJugadores >= 24)
      System.err.println("No caben más jugadores. Máximo 24");
    else{
      plantilla[numJugadores] = jugador;
      numJugadores+=1;
    }*/
  }  



}
