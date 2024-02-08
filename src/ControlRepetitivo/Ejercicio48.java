package ControlRepetitivo;

import java.util.Scanner;

public class Ejercicio48 {

	public static void ejecutar() {
		
		Scanner leer = new Scanner(System.in);

        double f, c, r, k;

        System.out.println("-- BIENVENIDO --");
        System.out.println();

        
        System.out.println("(28 a 54 oF EN INTERVALOS DE 1 oF)");
        System.out.printf("%-15s%-15s%-15s%-15s%n", "FAHRENHEIT", "CELSIUS", "KELVIN", "RANKINE");

        for (f = 28; f <= 54; f++) {
            c = 5 * (f - 32) / 9;
            r = f + 459.67;
            k = c + 273.15;
            
            System.out.printf("%-15.2f%-15.2f%-15.2f%-15.2f%n", f, c, k, r);
        }
        
        
        System.out.println();
        System.out.println("(450 a 950 oF EN INTERVALOS DE 50 oF)");
        System.out.printf("%-15s%-15s%-15s%-15s%n", "FAHRENHEIT", "CELSIUS", "KELVIN", "RANKINE");

        for (f = 450; f <= 950; f = f + 50) {
            c = 5 * (f - 32) / 9;
            r = f + 459.67;
            k = c + 273.15;
            
            System.out.printf("%-15.2f%-15.2f%-15.2f%-15.2f%n", f, c, k, r);
        }
        
        
        System.out.println();
        System.out.println("(-50 a 250 oF EN INTERVALOS DE 10 oF)");
        System.out.printf("%-15s%-15s%-15s%-15s%n", "FAHRENHEIT", "CELSIUS", "KELVIN", "RANKINE");

        for (f = -50; f <= 250; f = f + 10) {
            c = 5 * (f - 32) / 9;
            r = f + 459.67;
            k = c + 273.15;
            
            System.out.printf("%-15.2f%-15.2f%-15.2f%-15.2f%n", f, c, k, r);
        }
		

	}

}
