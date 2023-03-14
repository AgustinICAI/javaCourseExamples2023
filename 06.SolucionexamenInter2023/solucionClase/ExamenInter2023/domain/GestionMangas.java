package ExamenInter2023.domain;

import java.util.Collection;

public class GestionMangas {
    Collection<Manga> mangas;

    int countMangasPorDia(String fecha){
        int count = 0;
        for(Manga manga : mangas)
            if(manga.getFecha().equals(fecha))
                count += 1;
        return count;
    }




}
