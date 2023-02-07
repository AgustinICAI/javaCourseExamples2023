abstract class Miembro{
  String nombreCompleto;
  String equipo;
  double valor;
  int puntos;
  
  Miembro(String nombreCompleto, String equipo, double valor){
    this.nombreCompleto = nombreCompleto;
    this.equipo = equipo;
    this.valor = valor;
    puntos = 0;  
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
  
  public String toString(){
    return nombreCompleto + "-" + equipo + "-" + valor + "-" + puntos;
  }
  
  
  
}
