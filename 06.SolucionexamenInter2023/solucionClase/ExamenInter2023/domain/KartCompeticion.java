package ExamenInter2023.domain;

import java.util.Collection;

public class KartCompeticion extends KartConReglajes{
    int caballos;

    public KartCompeticion(int id, Collection<String> reglajes, int cilindrada, int caballos) {
        super(id, reglajes, cilindrada);
        this.caballos = caballos;
    }
}
