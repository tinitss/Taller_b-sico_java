package ControDecision;

import java.util.Scanner;

public class Ejercicio40 {

	public static void ejecutar() {
		
		Scanner leer = new Scanner (System.in);
		
		double monto, costo=0, lecturaAnterior, lecturaActual, totalLecturas;
		
		System.out.println("-- BIENVENIDO --");
		System.out.println();
		
		System.out.print("INGRESE LA LECTURA ANTERIOR: ");
		lecturaAnterior = leer.nextDouble();
		
		System.out.print("INGRESE LA LECTURA ACTUAL: ");
		lecturaActual = leer.nextDouble();
		
		System.out.println();
		
		totalLecturas = lecturaActual - lecturaAnterior;
		
		if(totalLecturas <= 100) {
			costo = 2.622;
			
		}else if(totalLecturas <= 300) {
			costo = 79.78;
			
		}else if(totalLecturas <= 500) {
			costo = 89.52;
			
		}else if(totalLecturas > 500) {
			costo = 97.95;
			
		}else {
			System.out.println("VALORES ERRÓNEOS, POR FAVOR VUELVA A INTENTARLO");
		}
		
		monto = totalLecturas * costo;
		
		
		System.out.println();
		System.out.println("----PROCESANDO....");
		System.out.println();
		System.out.println("LA DIFERENCIA DE LAS LECTURAS ES: " + totalLecturas);
		System.out.println("EL MONTO TOTAL QUE DEBE CANCELAR ES DE: " + monto);
		

	}

}
