class Interprete{
  String nombre;
  String apellidos;
  int edad;
  double altura; //metros
  double peso; //kilogramos
  
  String getNombre(){
    return nombre;
  }
  
  String getApellidos(){
    return apellidos;
  }
  
  int getEdad(){
    return edad;
  }
  
  double getAltura(){
    return altura;
  }
  
  double getPeso(){
    return peso;
  }

  void setNombre(String nombre){
    this.nombre=nombre;
  }  
  void setApellidos(String apellidos){
    this.apellidos=apellidos;
  }
  
  void setEdad(int edad){
    this.edad=edad;
  }  
  void setAltura(double altura){
    this.altura=altura;
  }
  void setPeso(double peso){
    this.peso=peso;
  }
  
  boolean estaEnForma(){
    double imc = peso/(altura*altura);
    //OTRAS OPCIONES VÁLIDAS
    //double imc = this.peso/(this.altura*this.altura);
    //double imc = getPeso()/(getAltura()*getAltura());
    
    if(imc > 18 && imc < 25){
      return true;
    }
    else{
      return false;
    }
    
  }
  
  public String toString(){
    return "Nombre: " + nombre + ", Apellidos: " + apellidos +
           ", Edad: "  + edad   + ", Altura: " + altura + 
           ", Peso: "  + peso;
  }

}
