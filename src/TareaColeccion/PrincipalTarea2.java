/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaColeccion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author binalend
 */
public class PrincipalTarea2 {
    public static void main(String[] args) {

        String opcionMenuPrincipal;
        String opcionMenuInterno;
        ArrayList<Juego> listaObjetosJuegos = new ArrayList();
        ArrayList<Empleado> listaObjetosEmpleados = new ArrayList();
        ArrayList<Jugador> listaObjetosJugadores = new ArrayList();
        do {
            System.out.println("- Menu principal -");
            System.out.println("1.- Mantenimiento de juegos");
            System.out.println("2.- Mantenimiento de empleados");
            System.out.println("3.- Mantenimiento de jugadores");
            System.out.println("4.- Salir");
            Scanner entradaData = new Scanner(System.in);
            System.out.print("Ingrese opción: ");
            opcionMenuPrincipal = entradaData.nextLine();

            if (opcionMenuPrincipal.equals("1")) {
                do {
                    System.out.println("1.- Listar juegos");
                    System.out.println("2.- Ingresar juego");
                    System.out.println("3.- Buscar juego");
                    System.out.println("4.- Eliminar juegos");
                    System.out.println("5.- Salir de la opcion");
                    System.out.print("Ingrese opción: ");
                    opcionMenuInterno = entradaData.nextLine();
                    if (opcionMenuInterno.equals("1")) {
                        System.out.println("----------------------------------");
                        System.out.println("Listar juegos");
                        if (listaObjetosJuegos.isEmpty()) {
                            System.out.println("No hay juegos agregados");
                        } else {
                            for (int i = 0; i < listaObjetosJuegos.size(); i++) {
                                Juego objJuego = listaObjetosJuegos.get(i);
                                System.out.println("******************");
                                System.out.println("Juego: " + i);
                                System.out.println("Nombre: " + objJuego.getNombre());
                                System.out.println("Niveles: " + objJuego.getNiveles());
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("2")) {
                        System.out.println("----------------------------------");
                        System.out.println("Ingresar juego");
                        String nombrejuego;
                        System.out.print("Ingrese el nombre del juego: ");
                        nombrejuego = entradaData.nextLine();
                        int niveles = 0;
                        System.out.print("Ingrese el numero de niveles: ");
                        String nivelesTexto = entradaData.nextLine();
                        niveles = Integer.parseInt(nivelesTexto);
                        Juego objJuego = new Juego(nombrejuego, niveles);
                        listaObjetosJuegos.add(objJuego);
                        System.out.println("Juego creado");
                    }
                    if (opcionMenuInterno.equals("3")) {
                        System.out.println("----------------------------------");
                        System.out.println("Buscar juego");
                        System.out.print("Ingrese el nombre: ");
                        String nombrejuego = entradaData.nextLine();
                        for (int i = 0; i < listaObjetosJuegos.size(); i++) {
                            Juego dato = listaObjetosJuegos.get(i);
                            if (nombrejuego.equals(dato.getNombre())) {

                                System.out.println("Juego encontrado");
                                System.out.println("Juego: " + i);
                                System.out.println("Nombre: " + dato.getNombre());
                                System.out.println("Niveles: " + dato.getNiveles());
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("4")) {
                        System.out.println("----------------------------------");
                        System.out.println("Eliminar juego");
                        System.out.print("Ingrese el nombre: ");
                        String nombrejuego = entradaData.nextLine();
                        for (int i = 0; i < listaObjetosJuegos.size(); i++) {
                            Juego dato = listaObjetosJuegos.get(i);
                            if (nombrejuego.equals(dato.getNombre())) {
                                System.out.println("*****");
                                listaObjetosJuegos.remove(dato);
                                System.out.println("Juego eliminado");
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("5")) {
                        System.out.println("----------------------------------");
                        System.out.println("Salir de la opcion");
                    }

                } while (!opcionMenuInterno.equals("5"));
            }
            if (opcionMenuPrincipal.equals("2")) {
                do {
                    System.out.println("1.- Listar empleados");
                    System.out.println("2.- Ingresar empleado");
                    System.out.println("3.- Buscar empleado");
                    System.out.println("4.- Eliminar empleado");
                    System.out.println("5.- Salir de la opcion");
                    System.out.print("Ingrese opción: ");
                    opcionMenuInterno = entradaData.nextLine();
                    if (opcionMenuInterno.equals("1")) {
                        System.out.println("----------------------------------");
                        System.out.println("Listar empleados");
                        if (listaObjetosJuegos.isEmpty()) {
                            System.out.println("No hay empleados agregados");
                        } else {
                            for (int i = 0; i < listaObjetosJuegos.size(); i++) {
                                Empleado objEmpleado = listaObjetosEmpleados.get(i);
                                System.out.println("******************");
                                System.out.println("Empleado: " + i);
                                System.out.println("Nombre: " + objEmpleado.getNombre());
                                System.out.println("Identificacion: " + objEmpleado.getIdentificacion());
                                System.out.println("Edad: " + objEmpleado.getEdad());
                                System.out.println("Cargo: " + objEmpleado.getCargo());
                                System.out.println("Salario: " + objEmpleado.getSalario());
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("2")) {
                        System.out.println("----------------------------------");
                        String nombreEmpleado;
                        System.out.print("Ingrese el nombre del empleado: ");
                        nombreEmpleado = entradaData.nextLine();
                        String identificacionEmpleado;
                        System.out.print("Ingrese la identificacion del empleado: ");
                        identificacionEmpleado = entradaData.nextLine();
                        String edadEmpleado;
                        System.out.print("Ingrese la edad del empleado ");
                        edadEmpleado = entradaData.nextLine();
                        String cargoEmpleado;
                        System.out.print("Ingrese el cargo del empleado: ");
                        cargoEmpleado = entradaData.nextLine();
                        String salarioEmpleado;
                        System.out.print("Ingrese el salario del empleado: ");
                        salarioEmpleado = entradaData.nextLine();

                        Empleado objEmpleado = new Empleado(nombreEmpleado, identificacionEmpleado, Integer.parseInt(edadEmpleado), cargoEmpleado, Integer.parseInt(salarioEmpleado));

                        listaObjetosEmpleados.add(objEmpleado);
                        System.out.println("Empleado agregado");
                    }
                    if (opcionMenuInterno.equals("3")) {
                        System.out.println("----------------------------------");
                        System.out.println("Buscar empleado");
                        System.out.print("Ingrese el nombre de empleado: ");
                        String nombreEmpleado = entradaData.nextLine();
                        for (int i = 0; i < listaObjetosJuegos.size(); i++) {
                            Empleado objEmpleado = listaObjetosEmpleados.get(i);
                            if (nombreEmpleado.equals(objEmpleado.getNombre())) {
                                System.out.println("******************");
                                System.out.println("Empleado: " + i);
                                System.out.println("Nombre: " + objEmpleado.getNombre());
                                System.out.println("Identificacion: " + objEmpleado.getIdentificacion());
                                System.out.println("Edad: " + objEmpleado.getEdad());
                                System.out.println("Cargo: " + objEmpleado.getCargo());
                                System.out.println("Salario: " + objEmpleado.getSalario());
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("4")) {
                        System.out.println("----------------------------------");
                        System.out.println("Buscar empleado");
                        System.out.print("Ingrese el nombre: ");
                        String nombreEmpleado = entradaData.nextLine();
                        for (int i = 0; i < listaObjetosEmpleados.size(); i++) {
                            Empleado objEmpleado = listaObjetosEmpleados.get(i);
                            if (nombreEmpleado.equals(objEmpleado.getNombre())) {
                                System.out.println("*****");
                                listaObjetosJuegos.remove(objEmpleado);
                                System.out.println("Juego eliminado");
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("5")) {
                        System.out.println("----------------------------------");
                        System.out.println("Salir de la opcion");
                    }

                } while (!opcionMenuInterno.equals("5"));
            }
            if (opcionMenuPrincipal.equals("3")) {
                do {
                    System.out.println("1.- Listar jugadores");
                    System.out.println("2.- Ingresar jugador");
                    System.out.println("3.- Buscar jugador");
                    System.out.println("4.- Eliminar jugador");
                    System.out.println("5.- Salir de la opcion");
                    System.out.print("Ingrese opcion: ");
                    opcionMenuInterno = entradaData.nextLine();
                    if (opcionMenuInterno.equals("1")) {
                        System.out.println("----------------------------------");
                        System.out.println("Listar jugadores");
                        if (listaObjetosJugadores.isEmpty()) {
                            System.out.println("No hay jugadores agregados");
                        } else {
                            for (int i = 0; i < listaObjetosJugadores.size(); i++) {
                                Jugador objJugador = listaObjetosJugadores.get(i);
                                System.out.println("******************");
                                System.out.println("Empleado: " + i);
                                System.out.println("Nombre: " + objJugador.getNombre());
                                System.out.println("Identificacion: " + objJugador.getIdentificacion());
                                System.out.println("Edad: " + objJugador.getEdad());
                                System.out.println("Juegos ganados: " + objJugador.getJuegosGanados());
                                System.out.println("Puntaje mas alto: " + objJugador.getMayorPuntaje());
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("2")) {
                        System.out.println("----------------------------------");
                        String nombreJugador;
                        System.out.print("Ingrese el nombre del jugador: ");
                        nombreJugador = entradaData.nextLine();
                        String identificacionJugador;
                        System.out.print("Ingrese la identificacion del jugador: ");
                        identificacionJugador = entradaData.nextLine();
                        String edadJugador;
                        System.out.print("Ingrese la edad del jugadore ");
                        edadJugador = entradaData.nextLine();
                        String juegosGanados;
                        System.out.print("Ingrese el numero de juegos ganados: ");
                        juegosGanados = entradaData.nextLine();
                        String mayorPuntajeJugador;
                        System.out.print("Ingrese el mayor puntaje del jugador: ");
                        mayorPuntajeJugador = entradaData.nextLine();

                        Jugador objJugador = new Jugador(nombreJugador, identificacionJugador, Integer.parseInt(edadJugador) , Integer.parseInt(juegosGanados), Integer.parseInt(mayorPuntajeJugador));

                        listaObjetosJugadores.add(objJugador);
                        System.out.println("Jugador agregado");
                    }
                    if (opcionMenuInterno.equals("3")) {
                        System.out.println("----------------------------------");
                        System.out.println("Buscar Jugador");
                        System.out.print("Ingrese el nombre de Jugador: ");
                        String nombreJugador= entradaData.nextLine();
                        for (int i = 0; i < listaObjetosJuegos.size(); i++) {
                            Jugador objJugador = listaObjetosJugadores.get(i);
                            if (nombreJugador.equals(objJugador.getNombre())) {
                                System.out.println("******************");
                                System.out.println("Jugador: " + i);
                                System.out.println("Nombre: " + objJugador.getNombre());
                                System.out.println("Identificacion: " + objJugador.getIdentificacion());
                                System.out.println("Edad: " + objJugador.getEdad());
                                System.out.println("Juegos ganados: " + objJugador.getJuegosGanados());
                                System.out.println("Mayor puntaje: " + objJugador.getMayorPuntaje());
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("4")) {
                        System.out.println("----------------------------------");
                        System.out.println("Buscar Jugador");
                        System.out.print("Ingrese el nombre: ");
                        String nombreJugador = entradaData.nextLine();
                        for (int i = 0; i < listaObjetosEmpleados.size(); i++) {
                            Jugador objJugador = listaObjetosJugadores.get(i);
                            if (nombreJugador.equals(objJugador.getNombre())) {
                                System.out.println("*****");
                                listaObjetosJuegos.remove(objJugador);
                                System.out.println("Juego eliminado");
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("5")) {
                        System.out.println("----------------------------------");
                        System.out.println("Salir de la opcion");
                    }

                } while (!opcionMenuInterno.equals("5"));
            }
            if (opcionMenuPrincipal.equals("3")) {
                System.out.println("Salir del programa");
            }

        } while (!opcionMenuPrincipal.equals("4"));

    }

}


