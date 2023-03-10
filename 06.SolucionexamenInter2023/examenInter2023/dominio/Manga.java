package examenInter2023.dominio;

import java.util.ArrayList;
import java.util.Collection;

public class Manga {
    String fecha;
    Collection<VueltasPilotoKart> vueltasPiloto = new ArrayList<>();

    public Manga(String fecha){
        this.fecha = fecha;
    }

    public void addVueltasPiloto(VueltasPilotoKart ptm){
        this.vueltasPiloto.add(ptm);
    }

    public String getFecha() {
        return fecha;
    }

    public Collection<VueltasPilotoKart> getVueltasPilotoKart() {
        return vueltasPiloto;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(VueltasPilotoKart vpk : this.vueltasPiloto){
            sb.append(vpk).append("\n");
        }
        return sb.toString();
    }


}
