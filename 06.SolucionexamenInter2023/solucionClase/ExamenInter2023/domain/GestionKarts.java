package ExamenInter2023.domain;

import java.util.ArrayList;

public class GestionKarts {
    public static Kart asignarKart (ArrayList<Kart> karts, Piloto p){
        for(Kart k : karts){
            if(p.getMejorTiempo() > 35 && !(k instanceof KartCompeticion) && !(k instanceof  KartConReglajes))
                return k;
            else if (p.getMejorTiempo() > 32 && !(k instanceof KartCompeticion))
                return k;
            else if (p.getMejorTiempo() <= 32 && k instanceof KartCompeticion)
                return k;
        }
        System.err.println("No existen Karts para asignar a este piloto " + p);
        return null;
    }
}
