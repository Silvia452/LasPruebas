package ejercicio1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ClaseCadena {

    public static void main(String[] args) {
        String iniciales = ClaseCadena.DevuelveIniciales("Andreas Dulac");
        System.out.println(iniciales);
    }

    public static String DevuelveIniciales(String nombresApellidos) {
        String iniciales = "";  // variable que contendrá las iniciales
        String[] palabras = nombresApellidos.split(" "); // dividimos la cadena por espacios
        for (String palabra : palabras) {  // recorremos las palabras
            if (!palabra.isEmpty()) { // si la palabra no está vacía
                iniciales += palabra.charAt(0) + "."; // añadimos la primera letra y un punto
            }
            return " ";

        }
        return iniciales.toUpperCase();
    }



}
