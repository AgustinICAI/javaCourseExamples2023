package ExamenInter2023.domain;

import java.util.Collection;

public class PilotoManga {
    Piloto piloto;
    Collection<Double> tiempos;
    Kart kart;

    public PilotoManga(Piloto piloto, Collection<Double> tiempos, Kart kart) {
        this.piloto = piloto;
        this.tiempos = tiempos;
        this.kart = kart;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(piloto.getNombre()).append(", Kart ").append(kart.getId()).append(", ").append(tiempos);
        return sb.toString();
    }
}
