package operaciones;
/**
2  * Ejemplo: Operaciones.
3  *
4  * @author asier - fprg5000
5  * @version 08.10.2023
6  */
public class Operaciones{
	/**
    13      * Constructor.
    14      * @param valor1 valor al que se suma
    15      * @param valor2 valor que suma
    16      * @return numero valor obtenido de la suma
    17      */
	public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
	/**
    13      * Constructor.
    14      * @param valor1 valor al que se resta
    15      * @param valor2 valor que resta
    16      * @return numero valor obtenido de la resta
    17      */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    /**
    13      * Constructor.
    14      * @param valor1 valor al que se multiplica
    15      * @param valor2 valor que multiplica
    16      * @return numero valor obtenido de la multiplica
    17      */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    /**
    13      * Constructor.
    14      * @param valor1 valor al que se divide
    15      * @param valor2 valor que divide
    16      * @return numero valor obtenido de la divide
    17      */
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    /**
    13      * Constructor.
    14      * @param valor1 valor, que con otro, se obtiene un resto
    15      * @param valor2 valor que, con otro, se obtiene un resto
    16      * @return numero valor obtenido del calculo
    17      */
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}