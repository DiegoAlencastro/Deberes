/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1.Tarea2;

/**
 *
 * @author binalend
 */
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

