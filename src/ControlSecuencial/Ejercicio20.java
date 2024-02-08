package ControlSecuencial;

import java.util.Scanner;

public class Ejercicio20 {

	public static void ejecutar() {

		Scanner leer = new Scanner (System.in);
		
		System.out.println("-- BIENVENIDO USUARIO --");
		
		int tiempo, capital, interes, tasaInteres;
		
		System.out.print("INGRESE CUANTO DINERO INVIRTIÓ: ");
		capital = leer.nextInt();
		
		System.out.print("INGRESE CUÁNTO INTERÉS HA PAGADO: ");
		interes = leer.nextInt();
		
		System.out.print("INGRESE POR CUÁNTO TIEMPO INVIRTIÓ EL DINERO: ");
		tiempo= leer.nextInt();
		
		tasaInteres = (interes * 100) / (capital * tiempo);
		
		System.out.println();
		System.out.println("LA TASA ANUAL QUE LE COBRARON FUE DEL: " + tasaInteres + "%");
		
		
	}

}
