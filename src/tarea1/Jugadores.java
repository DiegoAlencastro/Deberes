package tarea1;

public class Jugadores extends Personas {

    private int juegosGanados;
    private int mayorPuntaje;

    public Jugadores(String nombre, String identificacion, int edad,int juegosGanados, int mayorPuntaje) {
        super.setNombre(nombre);
        super.setIdentificacion(identificacion);
        super.setEdad(edad);
        this.juegosGanados = juegosGanados;
        this.mayorPuntaje = mayorPuntaje;
    }

    public int getMayorPuntaje() {
        return mayorPuntaje;
    }

    public void setMayorPuntaje(int mayorPuntaje) {
        this.mayorPuntaje = mayorPuntaje;
    }

    public int getJuegosGanados() {
        return juegosGanados;
    }

    public void setJuegosGanados(int juegosGanados) {
        this.juegosGanados = juegosGanados;
    }

}
