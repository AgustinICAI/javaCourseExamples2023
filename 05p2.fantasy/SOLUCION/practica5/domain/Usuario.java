package practica5.domain;

public class Usuario implements Expulsable{
  String alias;
  double presupuesto;

  Miembro[] plantilla;
  
  int numEntrenadores;
  int numJugadores;
  final static int MAX_JUGADORES = 11;
  final static int MAX_ENTRENADORES = 1;
    
  public Usuario(String alias){
    this.alias = alias;
    presupuesto = 100000000;
    plantilla = new Miembro[MAX_JUGADORES + MAX_ENTRENADORES];
    numJugadores = 0;
    numEntrenadores = 0;
  }

  public String expulsar(){
    return "El USUARIO " + alias + " ha sido expulsado";
  }

  public Miembro[] getPlantilla() {
    return plantilla;
  }

  public int calcularNumeroPartidosSancion(){
    return 3;
  }



  public void addMiembro(Miembro miembro){
    if(miembro instanceof Jugador && numJugadores >= MAX_JUGADORES){
        System.err.println("No caben más Jugadores. Máximo "+MAX_JUGADORES);
        return;
    }
    else if(miembro instanceof Entrenador && numEntrenadores >= MAX_ENTRENADORES){
        System.err.println("No caben más Entrenadores. Máximo "+MAX_ENTRENADORES);
        return;
    }
    
    plantilla[numJugadores + numEntrenadores] = miembro;    
    
    if(miembro instanceof Jugador)
      numJugadores+=1;      
    else if (miembro instanceof Entrenador)
      numEntrenadores+=1;
       
  }

  public int getPuntos(){
    int puntos = 0;
    for (Miembro m : plantilla)
      puntos += m.getPuntos();
    return puntos;
  }

  public String getAlias() {
    return alias;
  }

  void addMiembro(Miembro[] miembros){

    for(Miembro miembro : miembros)
      this.addMiembro(miembro);
  }

  public String toString(){
    String cad = "USUARIO:" + alias + " - presupuesto: " + presupuesto + " - puntos: " + getPuntos();
    cad += "\n  MIEMBROS ";
    for(int i = 0; i < (MAX_JUGADORES+MAX_ENTRENADORES) && plantilla[i] != null; i=i+1){
      cad += "\n    " + plantilla[i].toString();
    }
    return cad;  
  }

}
