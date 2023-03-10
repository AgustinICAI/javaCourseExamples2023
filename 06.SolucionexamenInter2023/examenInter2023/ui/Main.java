package examenInter2023.ui;

import examenInter2023.dominio.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Piloto p1 = new Piloto("1111","Paco");
        Piloto p2 = new Piloto("2222","María");
        Piloto p3 = new Piloto("3333","Pepe");

        //Introduciendo en programa datos de prueba para mostrar la resolución de los apartados
        double[] tiemposMangaP1 = {35.0, 34.3, 30.3};
        VueltasPilotoKart vpk1 = new VueltasPilotoKart(p1, tiemposMangaP1, new Kart(111));
        double[] tiemposMangaP2 = {31.0, 32.3, 29.3, 35.0, 32.3, 29.3};
        VueltasPilotoKart vpk2 = new VueltasPilotoKart(p2, tiemposMangaP2, new Kart(222));
        double[] tiemposMangaP3 = {40.0, 42.0};
        VueltasPilotoKart vpk3 = new VueltasPilotoKart(p3, tiemposMangaP3, new Kart(333));
        Manga m1 = new Manga("08/03/2023");
        m1.addVueltasPiloto(vpk1);
        m1.addVueltasPiloto(vpk2);
        m1.addVueltasPiloto(vpk3);
        GestionMangas gm = new GestionMangas();
        gm.add(m1);

        //Apartado A
        System.out.println(Arrays.toString(p1.getTiemposUltimaManga()));

        //Apartado B
        String fecha = "08/03/2023";
        System.out.println("numero mangas día " + fecha + ": "+gm.getNumMangasDia(fecha));

        //Apartado C
        System.out.println(m1);

        //Apartado D, ejemplo de funcionamiento
        LinkedList<Kart> kartsAsignar = new LinkedList<>();
        kartsAsignar.add(new Kart(444));
        kartsAsignar.add(new KartConReglajes(555,new ArrayList<String>(),300));
        kartsAsignar.add(new KartCompeticion(666,new ArrayList<String>(),300,30));
        Kart k1p1 = GestionKarts.asignarKart(kartsAsignar,p1);
        Kart k2p2 = GestionKarts.asignarKart(kartsAsignar,p2);
        Kart k3p3 = GestionKarts.asignarKart(kartsAsignar,p3);

    }
}