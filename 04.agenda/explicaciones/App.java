public class App{


  public static void main(String argv[]){    
    
    OpcionAgenda opcionSeleccionada = OpcionAgenda.OTRA_OPCION;
    
    while(opcionSeleccionada!=OpcionAgenda.SALIR)
    {
      System.out.println(App.mostrarMenu());
      String txtOpcionSeleccionada = Leer.porTeclado();
      opcionSeleccionada = OpcionAgenda.values()[Integer.parseInt(txtOpcionSeleccionada)];
      //opcionSeleccionada = Leer.porTecladoNumero();  
      
      switch(opcionSeleccionada){
        case ANADIR_PERSONA:
          System.out.println("Indique el nombre de la persona a añadir");
          break;
        
        case BORRAR_PERSONA:
          System.out.println("Indique el nombre de la persona a borrar");
          break;
          
        default:
          System.out.println("Tiene que marcar una opción de la lista");
      }      
      
      
      System.out.println("Se ha seleccionado la opcion " + opcionSeleccionada);
    }
  
  
  
  }

  public static String mostrarMenu(){
    StringBuilder sb = new StringBuilder();
    OpcionAgenda[] opciones = OpcionAgenda.values();
    for (int i = 1; i < opciones.length; i = i+1)
      sb.append(opciones[i].getDescripcion()).append("\n");
    

    return sb.toString();
  
  }



}
