package ControDecision;

import java.util.Scanner;

public class Ejercicio26 {
	

	public static void ejecutar() {
	
		Scanner leer = new Scanner (System.in);
		
		System.out.println("-- BIENVENIDO --");
		
		double a, b, c, d, resultado1, resultado2;
		
		
		System.out.print("INGRESE EL VALOR PARA A: ");
		a = leer.nextDouble();
		
		System.out.print("INGRESE EL VALOR PARA B: ");
		b = leer.nextDouble();
		
		System.out.print("INGRESE EL VALOR PARA C: ");
		c = leer.nextDouble();
		
		System.out.print("INGRESE EL VALOR PARA D: ");
		d = leer.nextDouble();
		
		if (d == 0) {
			
			resultado1 = a - c;
			resultado1 = Math.pow(resultado1, 2);
			
			System.out.println("EL RESULTADO DE LA EXPRESIÓN ES: " + resultado1);
			
		}else if(d>0) {
			
			resultado2 = a - b;
			resultado2 = Math.pow(resultado2, 3) / d;
			
			System.out.println("EL RESULTADO DE LA EXPRESIÓN ES: " + resultado2);
		
		}else {
			System.out.println("LOS VALORES NO CUMPLEN CON LOS CRITERIOS ESTABLECIDOS");
		}
			
	}

}
