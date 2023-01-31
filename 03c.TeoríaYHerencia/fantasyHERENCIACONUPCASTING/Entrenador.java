class Entrenador extends Miembro{
  String sexo;
  String sistemaDeJuego;
  
  Entrenador (String nombreCompleto, String equipo, double valor, String sexo, String sistemaDeJuego){
    super(nombreCompleto, equipo, valor);    
    this.sexo = sexo;
    this.sistemaDeJuego = sistemaDeJuego;

    //this.puntos = 0;  
  }

  void setSexo(String sexo){
    this.sexo = sexo;
  }
  
  String getSexo(){
    return sexo;
  }
  
  
  public String toString(){
    return super.toString() + "-" + sistemaDeJuego + "-" + sexo;
  }
  

}
