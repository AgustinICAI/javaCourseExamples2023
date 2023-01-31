class Jugador extends Miembro{
  String posicion;
  static String SEXO = "Masculino";
  
  Jugador (String nombreCompleto, String equipo, double valor, String posicion){
    super(nombreCompleto, equipo, valor);
    this.posicion = posicion;  
  }

  static void setSEXO(String sexo){
    SEXO = sexo;
  }
  
  static String getSEXO(){
    return SEXO;
  }
  
  
  public String toString(){
  /*String cad = nombreCompleto + "-" + equipo + "-" + valor + "-" + puntos + "-" + posicion;
    return cad;*/
    return super.toString() + "-" + posicion + "-" + Jugador.SEXO;
  }
  

}
