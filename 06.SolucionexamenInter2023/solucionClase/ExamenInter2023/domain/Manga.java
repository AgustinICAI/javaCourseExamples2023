package ExamenInter2023.domain;

import java.util.ArrayList;
import java.util.Collection;

public class Manga {
    /*
    Collection<Piloto> pilotos;
    Collection<Collection<Double>> tiemposPilotos = new ArrayList<>();
    Collection<Kart> tiemposPilotos;
    */

    Collection<PilotoManga> pilotosManga;
    String fecha;

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(PilotoManga pilotoManga : pilotosManga){
            sb.append("> ").append(pilotoManga);
        }
        return sb.toString();
    }
}
