package ControlSecuencial;

import java.util.Scanner;

public class Ejercicio16 {

	public static void ejecutar() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("-- BIENVENIDO EMPRESARIO --");
		System.out.println();
		
		double a, b;
		double anchoLamina, largoLamina, tamañoPieza, desperdicio;
		
		System.out.print("INGRESE EL ANCHO DE LA LÁMINA: ");
		anchoLamina = leer.nextDouble();
		
		System.out.print("INGRESE EL LARGO DE LA LÁMINA: ");
		largoLamina = leer.nextDouble();
		
		System.out.print("INGRESE EL TAMAÑO DE LA PIEZA QUE DESEA REALIZAR (METROS CUADRADOS): ");
		tamañoPieza = leer.nextDouble();
		
	
		a = anchoLamina * largoLamina;
		b = a / tamañoPieza;
	
		desperdicio = a - (b * tamañoPieza);
		
		System.out.println();
		System.out.println("SE PUEDEN FABRICAR " + b + " PIEZAS");
		System.out.println("EL DESPERDICIO DE LÁMINA ES DE: " + desperdicio);
		
	}

}
