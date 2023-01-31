class Usuario{
  String alias;
  double presupuesto;
  int puntos;
  Jugador plantilla[];
  Entrenador entrenador;
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
  
  void addJugador(Jugador jugador){
    if(numJugadores >= MAX_JUGADORES){
      System.err.println("No caben más jugadores. Máximo "+MAX_JUGADORES);
      return;
    }
    plantilla[numJugadores] = jugador;
    numJugadores+=1;
    
  }

  void addJugador(Jugador[] jugadores){

    for(Jugador jugador : jugadores)
      this.addJugador(jugador);
  }

  void setEntrenador(Entrenador entrenador){
    this.entrenador = entrenador;
  }

  public String toString(){
    String cad = "USUARIO:" + alias + " - presupuesto: " + presupuesto + " - puntos: " + puntos;  
    cad += "\n  JUGADORES "; // cad = cad + "\nJUGADORES "
    for(int i = 0; i < MAX_JUGADORES && plantilla[i] != null; i=i+1){
      cad += "\n    " + plantilla[i].toString();
    }
    cad += "\n  ENTRENADOR ";
    cad += "\n    "+entrenador.toString();
    return cad;  
  }

}
