class Entrenador extends Miembro{
  Miembro.Sexo sexo;
  String sistemaDeJuego;
  
  Entrenador (String nombreCompleto, String equipo, double valor, Miembro.Sexo sexo, String sistemaDeJuego){
    super(nombreCompleto, equipo, valor);    
    this.sexo = sexo;
    this.sistemaDeJuego = sistemaDeJuego;

    //this.puntos = 0;  
  }
  
  String celebrar(String estadoAnimo){
    return "Corriendo por la banda " +estadoAnimo;
  }


  void setSexo(Miembro.Sexo sexo){
    this.sexo = sexo;
  }
  
  Miembro.Sexo getSexo(){
    return sexo;
  }
  
  
  public String toString(){
    return "ENTRENADOR " + super.toString() + "-" + sistemaDeJuego + "-" + sexo;
  }
  

}
