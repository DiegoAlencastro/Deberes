/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaHerencia;

/**
 *
 * @author donel
 */
public class TareaHerencia {

    public static void main(String[] args) {

        Juego objJuego1;
        Juego objJuego2;
        objJuego1 = new Juego("Mario Bros", 10);
        objJuego2 = new Juego("Pacman", 8);

        System.out.println("- Datos juego 1 -");
        System.out.println("Nombre: " + objJuego1.getNombre());
        System.out.println("Niveles: " + objJuego1.getNiveles());

        System.out.println("- Datos juego 2 -");
        System.out.println("Nombre: " + objJuego2.getNombre());
        System.out.println("Niveles: " + objJuego2.getNiveles());

        Empleado objEmpleado = new Empleado("Luis Mendoza", "1721594447", 25, "Gerente", 450);
        System.out.println("- Datos empleado -");
        System.out.println("Nombre: " + objEmpleado.getNombre());
        System.out.println("Identificacion: " + objEmpleado.getIdentificacion());
        System.out.println("Edad: " + objEmpleado.getEdad());
        System.out.println("Cargo: " + objEmpleado.getCargo());
        System.out.println("Salario: " + objEmpleado.getSalario());

        Jugador objJugador = new Jugador("Jorge Lopez", "1721594449", 18, 25, 500);
        System.out.println("- Datos jugador -");
        System.out.println("Nombre: " + objJugador.getNombre());
        System.out.println("Identificacion: " + objJugador.getIdentificacion());
        System.out.println("Edad: " + objJugador.getEdad());
        System.out.println("Juegos ganados: " + objJugador.getJuegosGanados());
        System.out.println("Mayor puntaje: " + objJugador.getMayorPuntaje());
    }
}
