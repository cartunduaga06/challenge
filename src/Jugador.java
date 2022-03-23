public class Jugador {
    public String nombre;
    public int puntaje;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public String getNombre() {
       return( nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", puntaje=" + puntaje +
                '}';
    }
}
