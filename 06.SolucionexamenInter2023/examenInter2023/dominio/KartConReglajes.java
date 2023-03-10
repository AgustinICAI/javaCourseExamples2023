package examenInter2023.dominio;

import java.util.ArrayList;
import java.util.Collection;

public class KartConReglajes extends Kart {
    private Collection<String> reglajes = new ArrayList<>();
    int cilindrada;

    public KartConReglajes(int id, Collection<String> reglajes, int cilindrada) {
        super(id);
        this.reglajes = reglajes;
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "{KartConReglajes{" +
                super.toString() +
                "reglajes=" + reglajes +
                ", cilindrada=" + cilindrada +
                "}}";
    }
}
