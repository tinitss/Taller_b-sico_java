package ControDecision;

import java.util.Scanner;

public class Ejercicio30 {

	public static void ejecutar() {
		
		Scanner leer = new Scanner (System.in);
		
		double a, b, c, d, resultado, numeroRedondeado;
		
		System.out.println("-- BIENVENIDO --");
		
		System.out.print("INGRESE EL VALOR DE A: ");
		a = leer.nextDouble();
		
		System.out.print("INGRESE EL VALOR DE B: ");
		b = leer.nextDouble();
		
		System.out.print("INGRESE EL VALOR DE C: ");
		c = leer.nextDouble();
		
		System.out.print("INGRESE EL VALOR DE D: ");
		d = leer.nextDouble();
		
		resultado = a * 1000 + b * 100 + c * 10 + d;
		
		System.out.println();
		
		if(resultado > 0) {
			
			numeroRedondeado = Math.round(resultado/ 100.0) * 100;

			System.out.println("EL NÚMERO: " + resultado + "  REDONDEADO ES: " + numeroRedondeado);
			
		}else if (resultado == 0) {
			System.out.println("EL VALOR EN AMBOS CASOS ES CERO (0), POR FAVOR REPITA EL PROCESO CON NÚMEROS MAYORES A CERO");
		
		}else {
			System.out.println("HA INGRESADO NÚMEROS NEGATIVOS, POR FAVOR SOLO INGRESE NÚMEROS POSITIVOS");

		}
		
	}

}
