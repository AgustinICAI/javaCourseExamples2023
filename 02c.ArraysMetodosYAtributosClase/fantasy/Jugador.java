class Jugador{
  String nombreCompleto;
  String equipo;
  double valor;
  int puntos;
  String posicion;
  static String SEXO = "Masculino";
  
  Jugador (String nombreCompleto, String equipo, double valor, String posicion){
    this.nombreCompleto = nombreCompleto;
    this.equipo = equipo;
    this.valor = valor;
    this.posicion = posicion;
    puntos = 0;
    //this.puntos = 0;  
  }
  String getNombreCompleto(){
    return nombreCompleto;
  }  
  int getPuntos(){
    return puntos;
  }
  void setValor(double valor){
    this.valor = valor;
  }
  
  
  void addPuntos(int puntos){
    //this.puntos = this.puntos + puntos;
    this.puntos += puntos;
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
    return nombreCompleto + "-" + equipo + "-" + valor + "-" + puntos + "-" + posicion;
  }
  

}
