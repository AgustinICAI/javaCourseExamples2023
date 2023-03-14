package ExamenInter2023.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Piloto {
    String nombre;
    String dni;

    List<Double> topTiempos;
    //double[] topTiempos;

    Collection<Double> tiemposUltimaManga;
    public Piloto(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        topTiempos = new ArrayList<>();
        tiemposUltimaManga = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Collection<Double> getTopTiempos() {
        return topTiempos;
    }
    public double getMejorTiempo(){
        return topTiempos.get(0);
    }

    public Collection<Double> getTiemposUltimaManga() {
        return tiemposUltimaManga;
    }
}

