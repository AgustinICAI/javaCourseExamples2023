package ExamenInter2023.domain;

import java.util.Collection;

public class KartConReglajes extends Kart{
    Collection<String> reglajes;
    int cilindrada;

    public KartConReglajes(int id, Collection<String> reglajes, int cilindrada) {
        super(id);
        this.reglajes = reglajes;
        this.cilindrada = cilindrada;
    }
}
