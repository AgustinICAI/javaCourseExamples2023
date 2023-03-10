package examenInter2023.dominio;

import java.util.ArrayList;
import java.util.Collection;

public class GestionMangas {
    private Collection<Manga> mangasHistoricas = new ArrayList<>();

    ArrayList<Piloto> pilotos = new ArrayList<>();

    public void add(Manga m1) {
        mangasHistoricas.add(m1);
        //Actualizando pilotos
        for (VueltasPilotoKart ptm : m1.getVueltasPilotoKart())
            ptm.getPiloto().actualizarTiempos(ptm);
    }

    public int getNumMangasDia(String fecha){
        int count = 0;
        for(Manga manga : mangasHistoricas)
            if(manga.getFecha().equals(fecha))
                count += 1;
        return count;
    }


}
