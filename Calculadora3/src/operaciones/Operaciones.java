package operaciones;
public class Operaciones{
	 /**
	    * Constructor: SUMAR
	    * @param valor1: el valor del primer numero
	    * @param valor2: el valor del segundo numero
	    * @return resultado: el resultado de la suma de los dos numeros
	    */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    
    /**
	    * Constructor: 
	    * @param valor1: el numero al que vamos a restar
	    * @param valor2: el numero que restamos al valor 1
	    * @return resultado: el resultado de la resta de los dos numeros
	    */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    
    /**
	    * Constructor: 
	    * @param valor1: el numero que vamos a multiplicar
	    * @param valor2: el otro numero que vamos a multiplicar
	    * @return resultado: el resultado de la multiplicacion
	    */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    
    /**
	    * Constructor: 
	    * @param valor1: el numero que vamos a dividir
	    * @param valor2: el numero con el que vamos a dividir el valor 1
	    * @return resultado: el resultado de la division
	    */
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
    /**
	    * Constructor: 
	    * @param valor1: el numero que vamos a dividir
	    * @param valor2: el numero con el que vamos a dividir el valor 1
	    * @return resultado: el resto de la division que hemos echo
	    */
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}