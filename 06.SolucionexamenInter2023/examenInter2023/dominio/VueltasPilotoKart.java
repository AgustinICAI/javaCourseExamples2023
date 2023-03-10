package examenInter2023.dominio;

import java.util.Arrays;

public class VueltasPilotoKart {
    Piloto piloto;
    double[] tiempos;
    Kart kart;

    public VueltasPilotoKart(Piloto piloto, double[] tiempos, Kart kart) {
        this.piloto = piloto;
        this.tiempos = tiempos;
        this.kart = kart;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public double[] getTiempos() {
        return tiempos;
    }

    public Kart getKart() {
        return kart;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Piloto ").append(piloto.getNombre()).append(", Kart ").append(kart.getId()).append(", ").append(Arrays.toString(tiempos));
        return sb.toString();

    }
}
