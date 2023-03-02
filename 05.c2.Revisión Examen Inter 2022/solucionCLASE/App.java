import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class App
{
    private static int SIZE = 100;
    private static int ITERACIONES = Util.ITERACIONES;
 
    public static void main(String args[])
    {
        System.out.printf("\nIteraciones: %d.\n", ITERACIONES);
        
        long tiempo1 = 0;                                    // Inicializa el tiempo de cada agregación
        for(int i=0;i<ITERACIONES;i++)
            tiempo1 += App.addObjeto(list, Util.getRandom(SIZE));  //Acumula el tiempo de cada agregación
        tiempo1 /= ITERACIONES;                              // Calcula el tiempo medio empleado en una agregación
        System.out.printf("ADD: %.4f\n", tiempo1/1000.);     // Imprime el valor medio en microsegundos (nano/1000.) con 4 decimales (%.4f)
        
        tiempo1 = 0;
        for(int i=0;i<ITERACIONES;i++)
            tiempo1 += App.getObjeto(list, Util.getRandom(SIZE));         
        tiempo1 /= ITERACIONES;
        System.out.printf("GET: %.4f\n", tiempo1/1000.);
       
        tiempo1 = 0;
        for(int i=0;i<ITERACIONES;i++)
            tiempo1 += App.removeObjeto(list, Util.getRandom(SIZE));         
        tiempo1 /= ITERACIONES;
        System.out.printf("REMOVE: %.4f\n", tiempo1/1000.);
 
        tiempo1 = 0;
        for(int i=0;i<ITERACIONES;i++)
            tiempo1 += App.insertObjeto(list, Util.getRandom(SIZE));
        tiempo1 /= ITERACIONES;
        System.out.printf("INSERT: %.4f\n", tiempo1/1000.);
       
        tiempo1 = 0;
        for(int i=0;i<ITERACIONES;i++)
            tiempo1 += App.iterar(list);         
        tiempo1 /= ITERACIONES;
        System.out.printf("ITERATOR: %.4f\n", tiempo1/1000.);       
        
        tiempo1 = 0;
        for(int i=0;i<ITERACIONES;i++)
            tiempo1 += App.contains(list, Util.getRandom(SIZE));         
        tiempo1 /= ITERACIONES;
        System.out.printf("CONTAINS: %.4f\n", tiempo1/1000.);    
    }
 
    private static List<String> inicializarList(int size){
        List<String> lista = new ArrayList<>();
        //List<String> lista = new LinkedList<>();
      for(int i=0;i<size;i++)
        lista.add(String.valueOf(i));
    }
 
    private static long addObjeto( int size)
    {
        long inicioNano = System.nanoTime();
        inicializarList(size);          
        long finNano = System.nanoTime();  
        long nanoTiempo = finNano - inicioNano;
        return nanoTiempo;
    }

    private static long insertObjeto( int posicion){
        
        List<String> lista = inicializarList(size);
        long inicioNano = System.nanoTime();

        lista.add(posicion, String.valueOf(posicion));
        
        long finNano = System.nanoTime();  
        long nanoTiempo = finNano - inicioNano;
        return nanoTiempo;
    }
 
    static long removeObjeto( int posicion)
    {
        
        List<String> lista = inicializarList(size);
        long inicioNano = System.nanoTime();
        lista.remove(posicion);
        long finNano = System.nanoTime();  
        long nanoTiempo = finNano - inicioNano;
        return nanoTiempo;
    }
 
    private static long getObjeto( int posicion)
    {
        
        List<String> lista = inicializarList(size);
        long inicioNano = System.nanoTime();

        lista.get(posicion);
        
        long finNano = System.nanoTime();   
        long nanoTiempo = finNano - inicioNano;
        return nanoTiempo;
    }
   
    private static long iterar()
    {
        
        List<String> lista = inicializarList(size);
        long inicioNano = System.nanoTime();

        String x;
        for(String s:lista)
            x = s;

        long finNano = System.nanoTime();  
        long nanoTiempo = finNano - inicioNano;
        return nanoTiempo;
    } 
    
    private static long contains( int valor)
    {
        
        List<String> lista = inicializarList(size);
        long inicioNano = System.nanoTime();

        boolean x = lista.contains(String.valueOf(valor));
        
        long finNano = System.nanoTime();  
        long nanoTiempo = finNano - inicioNano;
        return nanoTiempo;
    }           
}



