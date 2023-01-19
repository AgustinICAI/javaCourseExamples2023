class App{
  
  public static void main(String argv[]){
    
    Interprete i1 = new Interprete("Penelope", "Cruz", 1.65, 56);
    
    Interprete i2 = new Interprete();
    i2.setNombre("Javier");
    i2.setApellidos("Bardem");
    i2.setAltura(1.75);
    i2.setPeso(80);
    
    Interprete i3 = new Interprete("Tom","Cruisse",62, 1.70, 70);

    
    System.out.println(i1.toString());
    System.out.println(i2.toString());
    System.out.println(i3.toString());
        
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
