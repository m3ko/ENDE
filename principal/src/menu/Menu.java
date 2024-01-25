package menu;
import java.util.Scanner;
/**
2  * Ejemplo: menu
3  *
4  * @author asier - fprg5000
5  * @version 08.10.2023
6  */
public class Menu {
    private static Scanner teclado = new Scanner(System.in);
    
    /**
    49      * Pide que se ingrese por teclado los valores especificados.
    50      * @return ret numeros ingresados por teclado.
    51      */
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    /**
    49      * Selecciona la operacion a hacer con los valores anteriormente dados .
    50      * @return ret operacion.
    51      */
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    /**
    49      * Repite el programa en el caso de que el Usuario quiera.
    50      * @return ret peticion del usuario.
    51      */
    public boolean repetir() {
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("�Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
}