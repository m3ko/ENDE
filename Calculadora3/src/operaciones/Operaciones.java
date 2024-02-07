package operaciones;

/**
 * Esta clase contiene métodos para realizar operaciones matemáticas básicas.
 * Incluye sumar, restar, multiplicar, dividir y calcular el resto.
 * 
 * @author [Niko Efrem]
 * @version [07/02/2024]]
 */
public class Operaciones {
    /**
     * Método para calcular el resultado de una operación matemática.
     * 
     * @param operacion La operación a realizar (+, -, *, /, %).
     * @param valor1    El primer operando.
     * @param valor2    El segundo operando.
     * @return El resultado de la operación.
     */
    public int calcular(String operacion, int valor1, int valor2) {
        int resultado = 0;

        switch (operacion) {
            case "+":
                resultado = sumar(valor1, valor2);
                break;
            case "-":
                resultado = restar(valor1, valor2);
                break;
            case "*":
                resultado = multiplicar(valor1, valor2);
                break;
            case "/":
                resultado = dividir(valor1, valor2);
                break;
            case "%":
                resultado = resto(valor1, valor2);
                break;
            default:
                System.out.println("Operación no válida");
        }

        return resultado;
    }

    // Métodos para operaciones matemáticas básicas

    /**
     * Método para sumar dos números.
     * 
     * @param valor1 El primer número.
     * @param valor2 El segundo número.
     * @return La suma de los dos números.
     */
    public int sumar(int valor1, int valor2) {
        return valor1 + valor2;
    }

    /**
     * Método para restar dos números.
     * 
     * @param valor1 El número del que se resta.
     * @param valor2 El número a restar.
     * @return La diferencia entre los dos números.
     */
    public int restar(int valor1, int valor2) {
        return valor1 - valor2;
    }

    /**
     * Método para multiplicar dos números.
     * 
     * @param valor1 El primer número.
     * @param valor2 El segundo número.
     * @return El producto de los dos números.
     */
    public int multiplicar(int valor1, int valor2) {
        return valor1 * valor2;
    }

    /**
     * Método para dividir dos números.
     * 
     * @param valor1 El número dividendo.
     * @param valor2 El número divisor.
     * @return El cociente de la división.
     */
    public int dividir(int valor1, int valor2) {
        return valor1 / valor2;
    }

    /**
     * Método para calcular el resto de una división.
     * 
     * @param valor1 El número dividendo.
     * @param valor2 El número divisor.
     * @return El resto de la división.
     */
    public int resto(int valor1, int valor2) {
        return valor1 % valor2;
    }
}