public class Persona implements Comparable{
    String dni;
    String nombre;
    String apellido;

    public Persona(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Persona persona)
            return dni.equals(persona.getDni());
        else return false;
    }
    //SOLO SI TRABAJAMOS CON HASHSET, SINO NO HACE FALTA
    @Override
    public int hashCode() {
        return dni.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        Persona p = (Persona)o;
        int resultadoApellido =  this.apellido.compareTo(p.getApellido());
        if (resultadoApellido == 0)
            return this.nombre.compareTo(p.getNombre());
        else return resultadoApellido;

    }
}
