package practica5.domain;

public class Jugador extends Miembro implements Expulsable {
  private Posicion posicion; 
  public static final Sexo SEXO = Sexo.MASCULINO;

  public Jugador (String nombreCompleto, Equipo equipo, double factorCalidad, Posicion posicion){
    super(nombreCompleto, equipo,factorCalidad);
    this.posicion = posicion;
    this.factorCalidad = factorCalidad;
  }
  public Jugador(String nombreCompleto){
    super(nombreCompleto);
  }
  
  public String expulsar(){
    return "El jugador " + getNombreCompleto() + " ha sido expulsado";
  }
  
  
  public int calcularNumeroPartidosSancion(){
    return 2;
  }
  
  public String celebrar(String estadoAnimo){
    return "Bailando muy " +estadoAnimo;
  }
  /*
  public static void setSEXO(Sexo sexo){
    SEXO = sexo;
  }*/
  
  public static Sexo getSEXO(){
    return SEXO;
  }
  
  public void actualizarFactorCalidad(){
    setFactorCalidad(getFactorCalidad() + Math.random()*3);
  }
  
  
  public String toString(){
  /*String cad = nombreCompleto + "-" + equipo + "-" + valor + "-" + puntos + "-" + posicion;
    return cad;*/
    return "JUGADOR "+ super.toString() + "-" + posicion + "-" + factorCalidad;
  }
  

}
