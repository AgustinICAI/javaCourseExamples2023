class AppFantasy2{

  public static void main (String argv[]){
    
    Usuario[] usuarios = new Usuario[50];    
    
    Usuario u1 = new Usuario("PEPE");
    u1.addMiembro(new Jugador("Rodrigo de Paul", "Atletico del Madrid", 5000000, "Centrocampista")); 
    u1.addMiembro(new Jugador("Koke", "Atletico del Madrid", 10000000, "Centrocampista")); 
    u1.addMiembro(new Jugador("Marcos Llorente", "Atletico del Madrid", 10000000, "Centrocampista"));
    u1.addMiembro(new Entrenador("Cholo Simeone","Atletico del Madrid", 40000000,"Masculino", "Argentino"));
    usuarios[0] = u1;    
        
    Usuario u2 = new Usuario("PACO");
    u2.addMiembro(new Jugador("Kondoglia", "Atletico del Madrid", 10000000, "Centrocampista"));
    u2.addMiembro(new Jugador("Pablo Barrios", "Atletico del Madrid", 10000000, "Centrocampista"));
    u2.addMiembro(new Entrenador("Xavi Hernandez","Barcelona F.C.", 10000000,"Masculino", "Tocar y tocar"));
    usuarios[1] = u2;
    
    for(int i = 0; i < usuarios.length;i=i+1)
      if(usuarios[i]!=null)
        System.out.println(usuarios[i].toString());  
    
        
  }

}
