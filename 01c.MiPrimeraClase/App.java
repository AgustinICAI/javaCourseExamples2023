class App{
  
  public static void main(String argv[]){
    
    Interprete i1 = new Interprete();
    Interprete i2 = new Interprete();
    
    i1.setNombre("Penelope");
    i1.setApellidos("Cruz");
    i1.setAltura(1.65);
    i1.setPeso(56);
    
    i2.setNombre("Javier");
    i2.setApellidos("Bardem");
    i2.setAltura(1.75);
    i2.setPeso(80);
    
    System.out.println(i1.toString());
    System.out.println(i2.toString());
    
    System.out.println(i1.getNombre() + "- En forma:" + i1.estaEnForma());
    System.out.println(i2.getNombre() + "- En forma:" + i2.estaEnForma());
    
    boolean estaEnFormaI1 = i1.estaEnForma();
    if (estaEnFormaI1 == true){
      System.out.println(i1.getNombre() + "- Está en forma");
    }else{
      System.out.println(i1.getNombre() + "- No está en forma");    
    }
    
    if (i1.estaEnForma()){
      System.out.println(i1.getNombre() + "- Está en forma");
    }else{
      System.out.println(i1.getNombre() + "- No está en forma");    
    }
    
    
  }

}
