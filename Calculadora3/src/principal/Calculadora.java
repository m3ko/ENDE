//package principal;
//
//import java.io.IOException;
//import java.util.logging.ConsoleHandler;
//import java.util.logging.FileHandler;
//import java.util.logging.Handler;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//import menu.Menu;
//import operaciones.Operaciones;
//
//public class Calculadora {
//	public static final Logger LOGGER = Logger.getLogger("Nombre del logger");
//	public static void main(String[] args)throws IOException {
//		/**
//		 * El main en el que se invocan los metodos.
//		 *
//		 * @author Niko Efrem
//		 * @version 31.01.2024
//		 */
//		Handler consoleHandler =new ConsoleHandler();
//		Handler fileHandler=null;
//		LOGGER.addHandler(consoleHandler);
//		
//		
//		LOGGER.setLevel(Level.ALL);
//		LOGGER.setUseParentHandlers(false);
//		int resultado = 0;
//		String operacion = "";
//		int[] operandos = new int[2];
//
//		
//		try {
//			fileHandler=new FileHandler("./logs/ficheroLog.log", true);
//			LOGGER.addHandler(fileHandler);
//		}catch(SecurityException e) {
//			e.printStackTrace();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//		Menu menu = new Menu();
//		Operaciones operaciones = new Operaciones();
//
//		do {
//			operandos = menu.pedirNumeros();
//			operacion = menu.menuOpciones();
//
//			if (operacion.equalsIgnoreCase("+")) {
//				resultado = operaciones.sumar(operandos[0], operandos[1]);
//				LOGGER.log(Level.FINE, "Suma realizada correctamente.");
//				System.out.println("Resultado: " + resultado);
//			} else if (operacion.equalsIgnoreCase("-")) {
//				resultado = operaciones.restar(operandos[0], operandos[1]);
//				LOGGER.log(Level.FINE, "Resta realizada correctamente.");
//				System.out.println("Resultado: " + resultado);
//			} else if (operacion.equalsIgnoreCase("*")) {
//				resultado = operaciones.multiplicar(operandos[0], operandos[1]);
//				LOGGER.log(Level.FINE, "Multiplicacion realizada correctamente.");
//				System.out.println("Resultado: " + resultado);
//			} else if (operacion.equalsIgnoreCase("/")) {
//				try {
//				resultado = operaciones.dividir(operandos[0], operandos[1]);
//				LOGGER.log(Level.FINE, "Division realizada correctamente.");
//				}catch(ArithmeticException e) {
//					LOGGER.log(Level.WARNING, "Intento de dividir por cero");
//					resultado=0;
//				}
//				System.out.println("Resultado: " + resultado);
//			} else if (operacion.equalsIgnoreCase("%")) {
//				resultado = operaciones.resto(operandos[0], operandos[1]);
//				LOGGER.log(Level.FINE, "Resto realizado correctamente.");
//				System.out.println("Resultado: " + resultado);
//			} else {
//				System.out.println("Operaci�n no v�lida");
//			}
//		} while (menu.repetir());
//	}
//}
package principal;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import logger.HTMLFormatter;
import menu.Menu;
import operaciones.Operaciones;

/**
 * Esta clase representa una calculadora con interfaz de consola.
 * Permite realizar operaciones matemáticas básicas.
 * Los resultados se registran en un archivo de log en formato HTML.
 * 
 * @author [Niko Efrem]
 * @version [07/02/2024]
 */
public class Calculadora {
    public static final Logger LOGGER = Logger.getLogger("Nombre del logger");

    public static void main(String[] args) throws IOException {
        Handler consoleHandler = new ConsoleHandler();
        Handler fileHandler = null;
        LOGGER.addHandler(consoleHandler);

        LOGGER.setLevel(Level.ALL);
        LOGGER.setUseParentHandlers(false);

        try {
            fileHandler = new FileHandler("./resultadosCalculadora.html", true);
            fileHandler.setFormatter(new HTMLFormatter());
            LOGGER.addHandler(fileHandler);
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

        int resultado = 0;
        String operacion = "";
        int[] operandos = new int[2];

        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();

        do {
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();

            if (operacion.matches("[+\\-*/%]")) {
                resultado = operaciones.calcular(operacion, operandos[0], operandos[1]);
                LOGGER.log(Level.INFO, operacion, new Object[] { operandos[0], operandos[1], resultado });
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Operación no válida");
            }

        } while (menu.repetir());
    }
}