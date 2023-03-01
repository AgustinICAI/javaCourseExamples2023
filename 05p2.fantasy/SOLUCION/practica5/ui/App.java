package practica5.ui;
import practica5.domain.*;
import practica5.util.Tiempo;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collection;

class App{

  static Liguilla liguilla = new Liguilla();

  public static void main (String argv[]){


    Collection<Usuario> usuarios = cargaUsuarios();

    LocalDate startDate = LocalDate.of(2023, Month.FEBRUARY,27);
    LocalDate endDate = startDate.plusWeeks(5);

    liguilla.cargarUsuarios(usuarios);
    liguilla.setStartDate(startDate);
    liguilla.setEndDate(endDate);

    for (LocalDate diaEnCurso = liguilla.getStartDate(); diaEnCurso.isBefore(liguilla.getEndDate()); diaEnCurso = diaEnCurso.plusWeeks(1)) {
      System.out.println("JORNADA DEL DÍA ----" + diaEnCurso+"----");
      liguilla.celebrarJornada();
      System.out.println("MOSTRANDO PUNTUACIONES PASADA LA JORNADA");
      for(Usuario u : usuarios)
        System.out.println(u.getAlias() + "-" + u.getPuntos());
      Tiempo.wait(300);
    }

  }

  private static ArrayList cargaUsuarios() {
    ArrayList<Usuario> usuarios = new ArrayList<>();


    Usuario u1 = new Usuario("Paco");
    Usuario u2 = new Usuario("Juan");
    Usuario u3 = new Usuario("Maria");
    usuarios.add(u1);
    usuarios.add(u2);
    usuarios.add(u3);

    u1.addMiembro(liguilla.getFullMiembro(new Jugador("Thibaut Courtois")));
    u1.addMiembro(liguilla.getFullMiembro(new Jugador("Eder Militao")));
    u1.addMiembro(liguilla.getFullMiembro(new Jugador("David Alaba")));
    u1.addMiembro(liguilla.getFullMiembro(new Jugador("Balde")));
    u1.addMiembro(liguilla.getFullMiembro(new Jugador("Christensen")));
    u1.addMiembro(liguilla.getFullMiembro(new Jugador("Aitor Paredes")));
    u1.addMiembro(liguilla.getFullMiembro(new Jugador("Daniel Vivian")));
    u1.addMiembro(liguilla.getFullMiembro(new Jugador("Sancet")));
    u1.addMiembro(liguilla.getFullMiembro(new Jugador("Carrasco")));
    u1.addMiembro(liguilla.getFullMiembro(new Jugador("Griezmann")));
    u1.addMiembro(liguilla.getFullMiembro(new Jugador("Depay")));
    u1.addMiembro(liguilla.getFullMiembro(new Entrenador("Simeone")));

    u2.addMiembro(liguilla.getFullMiembro(new Jugador("Thibaut Courtois")));
    u2.addMiembro(liguilla.getFullMiembro(new Jugador("Eder Militao")));
    u2.addMiembro(liguilla.getFullMiembro(new Jugador("David Alaba")));
    u2.addMiembro(liguilla.getFullMiembro(new Jugador("Thierry Correia")));
    u2.addMiembro(liguilla.getFullMiembro(new Jugador("Andre Almeida")));
    u2.addMiembro(liguilla.getFullMiembro(new Jugador("Guillamón")));
    u2.addMiembro(liguilla.getFullMiembro(new Jugador("Sergi Roberto")));
    u2.addMiembro(liguilla.getFullMiembro(new Jugador("De Jong")));
    u2.addMiembro(liguilla.getFullMiembro(new Jugador("Busquets")));
    u2.addMiembro(liguilla.getFullMiembro(new Jugador("Vinicius")));
    u2.addMiembro(liguilla.getFullMiembro(new Jugador("Asensio")));
    u2.addMiembro(liguilla.getFullMiembro(new Entrenador("Voro")));

    u3.addMiembro(liguilla.getFullMiembro(new Jugador("Thibaut Courtois")));
    u3.addMiembro(liguilla.getFullMiembro(new Jugador("Eder Militao")));
    u3.addMiembro(liguilla.getFullMiembro(new Jugador("David Alaba")));
    u3.addMiembro(liguilla.getFullMiembro(new Jugador("Carvajal")));
    u3.addMiembro(liguilla.getFullMiembro(new Jugador("Ceballos")));
    u3.addMiembro(liguilla.getFullMiembro(new Jugador("Mario Hermoso")));
    u3.addMiembro(liguilla.getFullMiembro(new Jugador("Koke")));
    u3.addMiembro(liguilla.getFullMiembro(new Jugador("Carrasco")));
    u3.addMiembro(liguilla.getFullMiembro(new Jugador("Berenguer")));
    u3.addMiembro(liguilla.getFullMiembro(new Jugador("Kessie")));
    u3.addMiembro(liguilla.getFullMiembro(new Jugador("Ansu Fati")));
    u3.addMiembro(liguilla.getFullMiembro(new Entrenador("Xavi Hernandez")));


    return usuarios;
  }

}
