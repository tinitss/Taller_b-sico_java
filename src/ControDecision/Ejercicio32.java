package ControDecision;

import java.util.Scanner;

public class Ejercicio32 {

	public static void ejecutar() {

		Scanner leer = new Scanner (System.in);
		
		double p, q, resultado;
		
		System.out.println("-- BIENVENIDO --");
		
		System.out.print("INGRESE EL VALOR DE P: ");
		p = leer.nextDouble();
		
		System.out.print("INGRESE EL VALOR DE Q: ");
		q = leer.nextDouble();
		
		
		resultado = Math.pow(p, 3) + Math.pow(q, 4) - 2 * Math.pow(p,2);
		
		  if (resultado > 680) {
	            System.out.println("EL VALOR DE P ES: " + p);
	            System.out.println("EL VALOR DE Q ES: " + q);
	            System.out.println("LOS VALORES P y Q SATISFACEN LA EXPRESIÓN");
	            System.out.println();
	            System.out.println(" -- EL RESULTADO DE LA EXPRESIÓN ES: " + resultado);
	            
	        } else {
	            System.out.println("LOS VALORES P y Q NO SATISFACEN LA EXPRESIÓN");
	        }
		}

}
