package com.generation;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        String mensaje = saludar("Ricardo Alvarez");
        System.out.println(mensaje);
        int resultado = suma(5, 3);
        System.out.println(resultado);
        int resultado1 = suma(80, 500);
        System.out.println(resultado1);
        int resultadoR = resta(600, 500);
        System.out.println(resultadoR);
        alerta("Mensaje de prueba");
        Scanner SC = new Scanner(System.in);
         */
       /* System.out.println(Math.PI);
        Double num1 = 13.75;
        Double num2 = 9.0;

        System.out.println(Math.sqrt(num2));*/
        String mensaje1 = "hola";
        String mensaje2 = "hola";
//        length nos devuelve el numero de caracteres de un string
        System.out.println(mensaje1.length());
//        equals compara dos strings y devulve verdadero si son iguales
//        equalsIgnoreCase compara dos strings sin importar si estan escritas en mayusculas o minusculas
        System.out.println (mensaje1.equals(mensaje2));
    }

    public static String saludar(String nombre){
        return "Hola como stas " + nombre;
    }

    public static int suma(int num1, int num2){
        return num1 + num2;

    }
    public static int resta(int num1, int num2){
        return num1 - num2;
    }

    public static void alerta(String mensaje){
        System.out.println(mensaje);
    }
}
