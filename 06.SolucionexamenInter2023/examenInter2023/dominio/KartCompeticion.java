package examenInter2023.dominio;

import java.util.Collection;

public class KartCompeticion extends KartConReglajes{
    private int caballos;

    public KartCompeticion(int id, Collection<String> reglajes, int cilindrada, int caballos) {
        super(id, reglajes, cilindrada);
        this.caballos = caballos;
    }

    @Override
    public String toString() {
        return "{KartCompeticion{" +
                super.toString() +
                " caballos=" + caballos +
                "}}";
    }
}
