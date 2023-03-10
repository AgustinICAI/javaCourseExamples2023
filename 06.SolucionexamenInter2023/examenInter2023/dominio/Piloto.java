package examenInter2023.dominio;

public class Piloto {
    String dni;
    String nombre;
    static final int NUM_TIEMPOS_ALMACENAR = 5;
    double[] mejoresTiempos;
    double[] tiemposUltimaManga;


    public Piloto(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        mejoresTiempos = new double[NUM_TIEMPOS_ALMACENAR];
        for(int i = 0; i < mejoresTiempos.length; i++)
            mejoresTiempos[i] = Integer.MAX_VALUE;
    }

    double getMejorTiempo(){
        return mejoresTiempos[0];
    }

    public double[] getTiemposUltimaManga() {
        return tiemposUltimaManga;
    }

    public String getNombre() {
        return nombre;
    }

    String getDni() {
        return this.getDni();
    }

    public void actualizarTiempos(VueltasPilotoKart ptm) {
        this.tiemposUltimaManga = ptm.getTiempos();
        for(double tiempo: ptm.getTiempos()){
            if(tiempo < mejoresTiempos[4]) {//Si el tiempo es peor que el peor tiempo almacenado, no hacer nada
                int posTiempo = 0;
                while (mejoresTiempos[posTiempo] < tiempo) //Buscando posición del nuevo tiempo
                    posTiempo +=1;
                double tiempoAnterior;
                do {
                    tiempoAnterior = mejoresTiempos[posTiempo];
                    mejoresTiempos[posTiempo] = tiempo;
                    tiempo = tiempoAnterior;
                    posTiempo += 1;
                }while (posTiempo < mejoresTiempos.length);


                 //Metiendo nuevo tiempo

            }
        }
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", mejorTiempo='" + this.getMejorTiempo() + '\'' +
                '}';
    }
}
