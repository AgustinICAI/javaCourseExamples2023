import java.util.Arrays;

/** @author David Contreras */

public class App
{
    private static Agenda agenda = new Agenda("AGENDA");

    public static void main(String[] args)
    {

        int opcion=0;
        OpcionAgenda opcionAgenda;
        do
        {
            opcion = App.menu(agenda.getNombre());
            //En caso de que se introduzca otra cosa
            if(opcion >= OpcionAgenda.values().length || opcion < 0)
                opcion = 0;
            App.limpiar();
            opcionAgenda = OpcionAgenda.values()[opcion];
            App.evaluar(opcionAgenda);
            App.limpiar();            
        }while(opcionAgenda != OpcionAgenda.SALIR);

    }
    
    static int menu(String nombre)
    {
        System.out.println("################################");
        System.out.println("#####        " +  nombre + "      #######");
        System.out.println("################################");
        for(int i = 1; i < OpcionAgenda.values().length; i++)
            System.out.printf("###  %-23s####%n", OpcionAgenda.values()[i].getDescripcion());
            System.out.println("################################");
        System.out.print("  > ");
        int opc = Integer.parseInt(Leer.porTeclado());
        return opc;
    }
    
    static void evaluar(OpcionAgenda x)
    {
    	String nombre = "";
        String nif = "";
    	int edad = 0;
        switch(x)
        {
        	case CREAR_PERSONA:
        	    System.out.println("*** NUEVA PERSONA ***");
        	    if(!agenda.isFull())
        	    {
	        	    System.out.println("Datos de la persona");
	        	    System.out.print("Nombre: ");
	        	    nombre = Leer.porTeclado();
                    System.out.print("NIF: ");
                    nif = Leer.porTeclado();
	        	    System.out.print("Edad: ");
	                edad = Integer.parseInt(Leer.porTeclado());
	        	    agenda.add(new Persona(nombre, nif, edad));
    		     }
    		     else
    		     {
    			    System.out.println("No se pueden añadir mas personas. Array lleno");
                    System.out.print("Pulse enter para continuar...");
                    Leer.porTeclado();        	        				    
    		     }
	        	   
        	    break;
            case BUSCAR_PERSONA:
        	    System.out.println("*** BUSCAR PERSONA ***");        	    
        	    System.out.println("Datos de la persona");
        	    System.out.print("NIF: ");
        	    nif = Leer.porTeclado();
                int pos = agenda.indexOf(new Persona(nif));
                if (pos != -1)
                    System.out.print("Encontrado en la posici�n " + pos);
                else
                    System.out.print("No encontrado");

                System.out.print("\nPulse enter para continuar...");
                Leer.porTeclado();        	        
        	    break;
            case ELIMINAR_PERSONA:
        	    System.out.println("*** ELIMINAR PERSONA ***");        	    
                pos = App.mostrarPersonasElegirPosicion();
                agenda.remove(pos);

        	    System.out.print("Objeto borrado");
        	    System.out.print("\nPulse enter para continuar...");
                Leer.porTeclado();        	                	    
        	    break;
            case MODIFICAR_PERSONA:
        	    System.out.println("*** MODIFICAR PERSONA ***");        	    
                pos = App.mostrarPersonasElegirPosicion();
                Persona p = agenda.get(pos);
                if(p!=null)
                {
            	    System.out.print("\nIntroduzca la nueva edad: ");
                    edad = Integer.parseInt(Leer.porTeclado());
                    p.setEdad(edad);
                }
                else
                    System.out.print("\nPersona no encontrada");
        	    break;
            case VACIAR_AGENDA:
                agenda.vaciar();
                System.out.print("Agenda borrada");
                System.out.print("\nPulse enter para continuar...");
                Leer.porTeclado();
                break;
            case MOSTRAR_CONTENIDO:
        	    System.out.print(agenda.toString());
        	    System.out.print("\nPulse enter para continuar...");
                Leer.porTeclado();        	        
        	    break;
            case OTRA_OPCION:
        	    break;

        	default:
        }
    }
    
    private static void limpiar()
    {
	    for(int i=0;i<25;i++)
           	 System.out.println();
    }
    
    private static int mostrarPersonasElegirPosicion()
    {
        System.out.println("Posición de la persona a modificar: ");
        System.out.print(agenda);
        System.out.print("  > ");
        int pos = Integer.parseInt(Leer.porTeclado());
        return pos;
    }    

}
