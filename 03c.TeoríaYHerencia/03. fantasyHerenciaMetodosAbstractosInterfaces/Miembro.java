abstract class Miembro {
  String nombreCompleto;
  String equipo;
  double valor;
  int puntos;
  enum Sexo {FEMENINO,MASCULINO};
  
  Miembro(String nombreCompleto, String equipo, double valor){
    this.nombreCompleto = nombreCompleto;
    this.equipo = equipo;
    this.valor = valor;
    puntos = 0;  
  }
  
  public boolean equals(Object o){
    if(o instanceof Miembro){
      Miembro m = (Miembro)o;
      return this.nombreCompleto.equals(m.getNombreCompleto()) &&
       this.equipo.equals(m.getEquipo());
    }
    else return false;
  }
  
  abstract String celebrar(String estadoAnimo);

  String celebrarSinMetodoAbstracto(String estadoAnimo)
  {
    return "";
  }

  
  String getNombreCompleto(){
    return nombreCompleto;
  } 
  
  String getEquipo(){
    return equipo;
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
