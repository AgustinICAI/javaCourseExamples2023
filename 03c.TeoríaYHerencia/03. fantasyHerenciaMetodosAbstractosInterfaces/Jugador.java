class Jugador extends Miembro implements Expulsable {
  Posicion posicion; 
  
  static Miembro.Sexo SEXO = Miembro.Sexo.MASCULINO;
  
  
  
  Jugador (String nombreCompleto, String equipo, double valor, Posicion posicion){
    super(nombreCompleto, equipo, valor);
    this.posicion = posicion;  
  }
  
  public String expulsar(){
    return "El jugador " + nombreCompleto + " ha sido expulsado";
  }
  
  
  public int calcularNumeroPartidosSancion(){
    return 2;
  }
  
  String celebrar(String estadoAnimo){
    return "Bailando muy " +estadoAnimo;
  }

  static void setSEXO(Miembro.Sexo sexo){
    SEXO = sexo;
  }
  
  static Miembro.Sexo getSEXO(){
    return SEXO;
  }
  

  
  
  public String toString(){
  /*String cad = nombreCompleto + "-" + equipo + "-" + valor + "-" + puntos + "-" + posicion;
    return cad;*/
    return "JUGADOR "+ super.toString() + "-" + posicion + "-" + Jugador.SEXO;
  }
  

}
