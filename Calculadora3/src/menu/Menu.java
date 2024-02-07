package menu;

import java.util.Scanner;

/**
 * Esta clase representa un menú para la calculadora.
 * Proporciona métodos para solicitar números, mostrar opciones y repetir la operación.
 * También se encarga de gestionar la entrada del usuario.
 * 
 * @author [Niko Efrem]
 * @version [07/02/2024]
 */
public class Menu {
    private static Scanner teclado = new Scanner(System.in);

    /**
     * Método para solicitar dos números al usuario.
     * 
     * @return Un arreglo de dos enteros ingresados por el usuario.
     */
    public int[] pedirNumeros() {
        int[] ret = new int[2];
        System.out.print("Operando 1: ");
        ret[0] = teclado.nextInt();
        System.out.print("Operando 2: ");
        ret[1] = teclado.nextInt();
        return ret;
    }

    /**
     * Método para mostrar las opciones de operación disponibles.
     * 
     * @return La operación seleccionada por el usuario.
     */
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print("Operaciones [+ - * / %]: ");
            ret = teclado.next();
        } while (!ret.matches("[+\\-*/%]"));
        return ret;
    }

    /**
     * Método para repetir la operación o salir del programa.
     * 
     * @return true si el usuario desea continuar, false si desea salir.
     */
    public boolean repetir() {
        boolean ret = false;
        String respuesta;
        do {
            System.out.print("¿Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!respuesta.matches("[sSnN]"));

        if (respuesta.equalsIgnoreCase("s")) {
            ret = true;
        }
        return ret;
    }
}