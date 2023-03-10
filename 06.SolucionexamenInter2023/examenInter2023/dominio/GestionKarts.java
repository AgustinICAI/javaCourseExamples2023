package examenInter2023.dominio;

import java.util.Collection;

public class GestionKarts {

    private static Kart getKartPorTiempo(Collection<Kart> karts, Piloto piloto){
        for(Kart k : karts)
            if(piloto.getMejorTiempo() < 32 && k instanceof KartCompeticion)
                return k;
            else if (piloto.getMejorTiempo() > 32 && piloto.getMejorTiempo() < 36 && k instanceof KartConReglajes && !(k instanceof KartCompeticion))
                return k;
            else if (piloto.getMejorTiempo() > 36 && !(k instanceof KartConReglajes) && !(k instanceof KartCompeticion))
                return k;

        return null;
    }
    public static Kart asignarKart(Collection<Kart> karts, Piloto piloto){
        Kart k = getKartPorTiempo(karts, piloto);
        if(k==null) {
            System.err.println("No quedan Karts para asignar para " + piloto);
            return null;
        }
        System.out.println( k +" asignado a " + piloto);
        karts.remove(k);
        return k;

    }

}
