package ControDecision;

import java.util.Scanner;

public class Ejercicio24 {

	public static void ejecutar() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("-- BIENVENIDO AL BANCO -- ");
		System.out.println();
		
		double capital, tiempo, resultado, interes = 0.05, reinversion;
		
		System.out.print("INGRESE LA CANTIDAD QUE DESEA INVERTIR (TENGA EN CUENTA QUE EL BANCO LE PAGARÁ EL 5% DE INTERÉS MENSUAL): ");
		capital = leer.nextDouble(); 
		
		System.out.print("INGRESE POR CUÁNTOS MESES DESEA INVERTIR SU DINERO: ");
		tiempo = leer.nextDouble();
		
		resultado = capital * tiempo;
		
		resultado = resultado * interes;
		
		System.out.println();
		System.out.println("USTED RECIBIRÁ: " + resultado + " DE INTERESES");
		
		if (resultado > 7000) {
			reinversion = capital + resultado;
			
			System.out.println("SEGÚN LA SUMA DE SUS INTERESES, AL FINAL REBIRIRÁ: " + reinversion);
			
		}else {
			System.out.println();
			System.out.println("** SUS INTERESES SON INFERIORES A 7000, POR LO TANTO NO LOS PODRÁ REINVERTIR **");
		}
		
		
		
		
		
		
	}

}
