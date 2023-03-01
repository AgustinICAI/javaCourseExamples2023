package practica5.domain;

public class Entrenador extends Miembro{

  public enum SistemaDeJuego{
    AGRESIVO,DEFENSIVO;
  }

  private Sexo sexo;
  private SistemaDeJuego sistemaDeJuego;



  public Entrenador (String nombreCompleto, Equipo equipo, Miembro.Sexo sexo, SistemaDeJuego sistemaDeJuego,double factorCalidad){
    super(nombreCompleto, equipo, factorCalidad);
    this.sexo = sexo;
    this.sistemaDeJuego = sistemaDeJuego;

    //this.puntos = 0;  
  }
  public Entrenador(String entrenador){
    super(entrenador);
  }
  public String celebrar(String estadoAnimo){
    return "Corriendo por la banda " +estadoAnimo;
  }


  public void setSexo(Miembro.Sexo sexo){
    this.sexo = sexo;
  }
  
  public Sexo getSexo(){
    return sexo;
  }
  
  
  public String toString(){
    return "ENTRENADOR " + super.toString() + "-" + sistemaDeJuego + "-" + sexo;
  }
  

}
