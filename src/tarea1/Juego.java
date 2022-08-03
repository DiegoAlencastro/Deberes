package tarea1;

public class Juego {

    private String nombre;
    private int niveles;

    public Juego(String nombrejuego, int niveles) {
        this.nombre = nombrejuego;
        this.niveles = niveles;
    }

    public void setNombre(String nombrejuego) {
        this.nombre = nombrejuego;
    }

    public String getNombre() {
        return this.nombre;

    }

    public void setNiveles(int niveles) {
        this.niveles = niveles;
    }

    public int getNiveles() {
        return this.niveles;
    }
    
    
}
