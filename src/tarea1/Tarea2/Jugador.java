/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1.Tarea2;

/**
 *
 * @author binalend
 */
public class Jugador extends Persona {

    private int juegosGanados;
    private int mayorPuntaje;

    public Jugador(String nombre, String identificacion, int edad,int juegosGanados, int mayorPuntaje) {
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

    

