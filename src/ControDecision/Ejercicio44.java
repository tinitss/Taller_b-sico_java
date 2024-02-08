package ControDecision;

import java.util.Scanner;

public class Ejercicio44 {

	public static void ejecutar() {
		
		Scanner leer = new Scanner (System.in); 
		
		double inversionNegocio, hipoteca, inversionSocio, inversionHipoteca, inversionPropia, inversionTotal; 
		
		System.out.println("-- BIENVENID@ --");
		System.out.println();
		
		System.out.print("INGRESE EL MONTO DE LA HIPOTECA: ");
		hipoteca = leer.nextDouble();
		
		System.out.print("CUÁNTO DINERO NECESITA INVERTIR EN SU NEGOCIO: ");
		inversionNegocio = leer.nextDouble();
		
		if(hipoteca < 1000000) {
			inversionPropia = inversionNegocio * 0.50;
			inversionSocio = inversionNegocio * 0.50;
			inversionNegocio = inversionPropia + inversionSocio;
			
			
			System.out.println();
			System.out.println("-- EL VALOR DE HIPOTECA ES MUY BAJO -- ");
			System.out.println("SU INVERSIÓN DEBE SER DE: " + inversionPropia);
			System.out.println("LA INVERSIÓN DE SU SOCIO DEBE SER DE: " + inversionSocio);
			System.out.println("EL TOTAL DE LA INVERSIÓN ES DE: " +  inversionNegocio);
		
		}else {
			System.out.println();
			System.out.println("LA INVERSIÓN DEL NEGOCIO ES: " + inversionNegocio);
			System.out.println("EL MONTO DE LA HIPOTECA ES: " + hipoteca);
			
			inversionTotal = inversionNegocio - hipoteca;
			inversionTotal = inversionTotal / 2;
			
			
			System.out.println();
			System.out.println();
			System.out.println("** DESCONTADO EL MONTO DE LA HIPOTECA, USTED Y SU SOCIO DEBEN APORTAR UN 50% CADA UNO AL RESTANTE DE LA INVERSIÓN **");
			System.out.println("LO CUAL EQUIVALE A (PARA CADA UNO): " + inversionTotal);
			
		}
	}

}
