package practica5.domain;


public class Equipo {
    public enum NombreEquipo
    {
        REAL_MADRID,BARCELONA,ATLETICO_MADRID,ATHLETIC,VALENCIA;
    }
    NombreEquipo nombreEquipo;
    double factorCalidad;

    public Equipo(NombreEquipo nombreEquipo, double factorCalidad) {
        this.nombreEquipo = nombreEquipo;
        this.factorCalidad = factorCalidad;
    }

    public void actualizarFactorCalidad(){
        setFactorCalidad(getFactorCalidad() + Math.random()*1);
    }
    public double getFactorCalidad() {
        return factorCalidad;
    }

    public void setFactorCalidad(double factorCalidad) {
        this.factorCalidad = factorCalidad;
    }
}
