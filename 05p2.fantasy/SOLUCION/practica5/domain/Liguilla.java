package practica5.domain;

import practica5.domain.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Liguilla {
    private LocalDate endDate;
    private LocalDate startDate;
    Collection<Usuario> usuarios;
    ArrayList<Jugador> jugadores;
    ArrayList<Entrenador> entrenadores;
    Collection<Equipo> equipos;


    public Liguilla() {
        init();
    }

    public Miembro getFullMiembro(Miembro miembro){
        if(miembro instanceof Jugador)
            return jugadores.get(jugadores.indexOf(miembro));
        else if(miembro instanceof Entrenador)
            return entrenadores.get(entrenadores.indexOf(miembro));
        else return null;
    }

    public void init(){
        equipos = new ArrayList<>();
        jugadores = new ArrayList<>();
        entrenadores = new ArrayList<>();

        Equipo realMadrid = new Equipo(Equipo.NombreEquipo.REAL_MADRID,4);
        Equipo athletic = new Equipo(Equipo.NombreEquipo.ATHLETIC,2);
        Equipo barcelona = new Equipo(Equipo.NombreEquipo.BARCELONA,4);
        Equipo atletico = new Equipo(Equipo.NombreEquipo.ATLETICO_MADRID,5);
        Equipo valencia = new Equipo(Equipo.NombreEquipo.VALENCIA,1);
        equipos.add(realMadrid);
        equipos.add(athletic);
        equipos.add(barcelona);
        equipos.add(atletico);
        equipos.add(valencia);

        jugadores.add(new Jugador("Thibaut Courtois", realMadrid,2,Posicion.PORTERO));
        jugadores.add(new Jugador("Eder Militao", realMadrid,2,Posicion.DEFENSA));
        jugadores.add(new Jugador("David Alaba", realMadrid,4,Posicion.DEFENSA));
        jugadores.add(new Jugador("Nacho", realMadrid,5,Posicion.DEFENSA));
        jugadores.add(new Jugador("Carvajal", realMadrid,2,Posicion.DEFENSA));
        jugadores.add(new Jugador("Ceballos", realMadrid,1,Posicion.CENTROCAMPISTA));
        jugadores.add(new Jugador("Hazard", realMadrid,3,Posicion.CENTROCAMPISTA));
        jugadores.add(new Jugador("Mariano", realMadrid,3,Posicion.CENTROCAMPISTA));
        jugadores.add(new Jugador("Benzema", realMadrid,5,Posicion.DELANTERO));
        jugadores.add(new Jugador("Vinicius", realMadrid,3,Posicion.DELANTERO));
        jugadores.add(new Jugador("Asensio", realMadrid,2,Posicion.DELANTERO));
        entrenadores.add(new Entrenador("Carlo Ancelotti", realMadrid, Miembro.Sexo.MASCULINO, Entrenador.SistemaDeJuego.AGRESIVO, 2));


        jugadores.add(new Jugador("Mamardashvili", valencia,2,Posicion.PORTERO));
        jugadores.add(new Jugador("Lato", valencia,2,Posicion.DEFENSA));
        jugadores.add(new Jugador("Diakhaby", valencia,4,Posicion.DEFENSA));
        jugadores.add(new Jugador("Comert", valencia,5,Posicion.DEFENSA));
        jugadores.add(new Jugador("Thierry Correia", valencia,2,Posicion.DEFENSA));
        jugadores.add(new Jugador("Andre Almeida", valencia,1,Posicion.CENTROCAMPISTA));
        jugadores.add(new Jugador("Guillamón", valencia,3,Posicion.CENTROCAMPISTA));
        jugadores.add(new Jugador("Yunus Musah", valencia,3,Posicion.CENTROCAMPISTA));
        jugadores.add(new Jugador("Samunel Limo", valencia,5,Posicion.DELANTERO));
        jugadores.add(new Jugador("Hugo Duro", valencia,3,Posicion.DELANTERO));
        jugadores.add(new Jugador("Samu Castillejo", valencia,2,Posicion.DELANTERO));
        entrenadores.add(new Entrenador("Voro", valencia, Miembro.Sexo.MASCULINO, Entrenador.SistemaDeJuego.AGRESIVO, 2));

        jugadores.add(new Jugador("Oblak", atletico,2,Posicion.PORTERO));
        jugadores.add(new Jugador("Savic", atletico,2,Posicion.DEFENSA));
        jugadores.add(new Jugador("Gimenez", atletico,4,Posicion.DEFENSA));
        jugadores.add(new Jugador("Mario Hermoso", atletico,5,Posicion.DEFENSA));
        jugadores.add(new Jugador("Marcos Llorente", atletico,2,Posicion.CENTROCAMPISTA));
        jugadores.add(new Jugador("Pablo Barrios", atletico,1,Posicion.CENTROCAMPISTA));
        jugadores.add(new Jugador("Koke", atletico,3,Posicion.CENTROCAMPISTA));
        jugadores.add(new Jugador("Saul Ñiguez", atletico,3,Posicion.CENTROCAMPISTA));
        jugadores.add(new Jugador("Carrasco", atletico,5,Posicion.DELANTERO));
        jugadores.add(new Jugador("Griezmann", atletico,3,Posicion.DELANTERO));
        jugadores.add(new Jugador("Depay", atletico,2,Posicion.DELANTERO));
        entrenadores.add(new Entrenador("Simeone", atletico, Miembro.Sexo.MASCULINO, Entrenador.SistemaDeJuego.AGRESIVO, 2));

        jugadores.add(new Jugador("Aguirrezabala", athletic,2,Posicion.PORTERO));
        jugadores.add(new Jugador("De Marcos", athletic,2,Posicion.DEFENSA));
        jugadores.add(new Jugador("Aitor Paredes", athletic,4,Posicion.DEFENSA));
        jugadores.add(new Jugador("Daniel Vivian", athletic,5,Posicion.DEFENSA));
        jugadores.add(new Jugador("Yuri", athletic,2,Posicion.DEFENSA));
        jugadores.add(new Jugador("Sancet", athletic,1,Posicion.CENTROCAMPISTA));
        jugadores.add(new Jugador("Vesga", athletic,3,Posicion.CENTROCAMPISTA));
        jugadores.add(new Jugador("Munain", athletic,3,Posicion.CENTROCAMPISTA));
        jugadores.add(new Jugador("Willians", athletic,5,Posicion.DELANTERO));
        jugadores.add(new Jugador("Guruzeta", athletic,3,Posicion.DELANTERO));
        jugadores.add(new Jugador("Berenguer", athletic,2,Posicion.DELANTERO));
        entrenadores.add(new Entrenador("Ernesto Valverde", athletic, Miembro.Sexo.MASCULINO, Entrenador.SistemaDeJuego.AGRESIVO, 2));

        jugadores.add(new Jugador("Ter Stegen", barcelona,2,Posicion.PORTERO));
        jugadores.add(new Jugador("Kounde", barcelona,2,Posicion.DEFENSA));
        jugadores.add(new Jugador("Ronald Araujo", barcelona,4,Posicion.DEFENSA));
        jugadores.add(new Jugador("Christensen", barcelona,5,Posicion.DEFENSA));
        jugadores.add(new Jugador("Balde", barcelona,2,Posicion.DEFENSA));
        jugadores.add(new Jugador("Sergi Roberto", barcelona,1,Posicion.CENTROCAMPISTA));
        jugadores.add(new Jugador("De Jong", barcelona,3,Posicion.CENTROCAMPISTA));
        jugadores.add(new Jugador("Busquets", barcelona,3,Posicion.CENTROCAMPISTA));
        jugadores.add(new Jugador("Kessie", barcelona,5,Posicion.DELANTERO));
        jugadores.add(new Jugador("Raphinha", barcelona,3,Posicion.DELANTERO));
        jugadores.add(new Jugador("Ansu Fati", barcelona,2,Posicion.DELANTERO));
        entrenadores.add(new Entrenador("Xavi Hernandez", barcelona, Miembro.Sexo.MASCULINO, Entrenador.SistemaDeJuego.AGRESIVO, 2));



    }


    public void cargarUsuarios(Collection<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void celebrarJornada() {
        System.out.println("Generando puntuación jugadores ...");
        for (Jugador j : jugadores)
            j.generarPuntuacionJornada();
        System.out.println("Generando puntuación entrenadores ...");
        for (Entrenador e : entrenadores)
            e.generarPuntuacionJornada();

        System.out.println("Actualizando factores de calidad pasada la jornada ...");
        for (Equipo e : equipos)
            e.actualizarFactorCalidad();
        for(Jugador j : jugadores)
            j.actualizarFactorCalidad();

    }
}
