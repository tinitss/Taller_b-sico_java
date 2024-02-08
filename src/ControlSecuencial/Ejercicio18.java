package ControlSecuencial;

import java.util.Scanner;

public class Ejercicio18 {

	public static void ejecutar() {

		Scanner leer = new Scanner (System.in);
		
		System.out.println("-- BIENVENIDO A LA GASOLINERÍA --");
		
		double precioLitro = 100, litros, total;
		
		System.out.println("INGRESE CUÁNTOS LITROS DESEA COMPRAR: ");
		litros = leer.nextDouble();
		
		total = precioLitro * litros;
		
		System.out.println("EL TOTAL QUE DEBE PAGAR ES DE: " + total + "BOLÍVARES");
		
	}

}
