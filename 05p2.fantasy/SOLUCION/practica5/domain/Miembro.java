package practica5.domain;

public abstract class Miembro {
  private static final double MAX_FACTOR_CALIDAD = 10;
  private static final double MIN_FACTOR_CALIDAD = 0;
  private String nombreCompleto;
  private Equipo equipo;
  private int puntos;
  double factorCalidad;


  public enum Sexo {FEMENINO,MASCULINO};
  
  public Miembro(String nombreCompleto, Equipo equipo, double factorCalidad){
    this.nombreCompleto = nombreCompleto;
    this.equipo = equipo;
    this.factorCalidad = factorCalidad;
    puntos = 0;
  }
  public Miembro(String nombreCompleto){
    this.nombreCompleto = nombreCompleto;
  }
  
  public boolean equals(Object o){
    if(o instanceof Miembro m)
      return this.nombreCompleto.equals(m.getNombreCompleto());
    else return false;
  }
  
  public abstract String celebrar(String estadoAnimo);
  /*
  String celebrarSinMetodoAbstracto(String estadoAnimo)
  {
    return "";
  }
  */
  
  public String getNombreCompleto(){
    return nombreCompleto;
  } 
  
  public Equipo getEquipo(){
    return equipo;
  }  
  public int getPuntos(){
    return puntos;
  }
  

  void addPuntos(int puntos){
    //this.puntos = this.puntos + puntos;
    this.puntos += puntos;
  }
  
  public String toString(){
    return nombreCompleto + "-" + equipo + "-" + puntos;
  }

  public double getFactorCalidad() {
    return factorCalidad;
  }

  public void setFactorCalidad(double factorCalidad) {
    if(factorCalidad>MAX_FACTOR_CALIDAD)
      factorCalidad  = MAX_FACTOR_CALIDAD;
    else if(factorCalidad<MIN_FACTOR_CALIDAD)
      this.factorCalidad = MIN_FACTOR_CALIDAD;
    else this.factorCalidad = factorCalidad;
  }

  public void generarPuntuacionJornada() {
    this.addPuntos((int)(Math.random()*(this.getFactorCalidad() + equipo.getFactorCalidad())));
  }


}
