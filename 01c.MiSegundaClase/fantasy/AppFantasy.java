class AppFantasy{

  public static void main (String argv[]){
    Jugador j1 = new Jugador("Rodrigo de Paul", "Atletico del Madrid", 5000000, "Centrocampista"); 
    //Primera jornada
    j1.addPuntos(3);
    j1.setValor(4500000);

    //Segunda jornada
    j1.addPuntos(5);
    j1.setValor(4600000);
    
    System.out.println(j1.getNombreCompleto() + "-"+j1.getPuntos());
  
  }

}
