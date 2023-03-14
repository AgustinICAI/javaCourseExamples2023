import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Collection<Persona> personas = new TreeSet<>();
        personas.add(new Persona("44","Juan","perez"));
        personas.add(new Persona("55","Pedro","juarez"));
        personas.add(new Persona("55","Maria","juarez"));

        for(Persona p : personas)
            System.out.println(p);



    }
}