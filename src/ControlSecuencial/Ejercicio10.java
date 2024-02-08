	/*El cambio de divisas en la bolsa de Madrid el 25/08/1987 fue el siguiente
	100 chelines austríacos = 956.871 pesetas
	1 dólar EEUU = 122.499 pesetas
	100 dracmas griegos = 88.607 pesetas
	100 francos belgas = 323.728 pesetas
	1 franco francés = 20.110 pesetas
	1 libra esterlina = 178.938 pesetas
	100 liras italianas = 9.289 pesetas
	Lea una cantidad en chelines austriacos e imprima el equivalente en pesetas. Lea una
	cantidad en dracmas griegos e imprima su equivalente en francos franceses. Finalmente, lea una
	cantidad en pesetas e imprima su equivalente en dólares y liras italianas.*/


package ControlSecuencial;

import java.util.Scanner;

public class Ejercicio10 {

	public static void ejecutar() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("** BIENVENIDO AL CAMBIO DE DIVISAS **");
		System.out.println();
		
		// 1 
		double chelines, total1, chelinesP = 9.56871;
		
		System.out.print("INGRESE LA CANTIDAD DE CHELINES AUSTRIACOS PARA VERLOS EN PESETAS: ");
		chelines = leer.nextDouble();
		
		total1 = chelines * chelinesP;
		
		System.out.println(" LA CANTIDAD DE " + chelines + "CHELINES AUSTRIACOS EN PESETAS ES DE: " + total1);
		System.out.println();
		
		
		// 2 (REPASAR /ESTÁ DENSO)
		double dracmas, total2, francos, dracmasP= 0.88607;
		
		System.out.print("INGRESE LA CANTIDAD DE DRACMAS GRIEGOS QUE QUIERE VER EN FRANCOS FRANCESES: ");
		dracmas = leer.nextDouble();
		
		total2 = dracmas * dracmasP;
		francos = total2 * 1/20.110;
		
		System.out.println(" LA CANTIDAD DE " + dracmas + "DRACMAS GRIEGOS EN PESETAS ES DE: " + francos);
		System.out.println();
		
		
		// 3
		double total3, total4, dolares = 122.499, liras=92.89, pesetas;
		
		System.out.print("INGRESE LA CANTIDAD DE PESETAS AUSTRIACOS PARA VERLOS EN DÓLARES Y LIRAS ITALIANAS: ");
		pesetas = leer.nextDouble();
		
		total3 = pesetas * dolares;
		total4 = pesetas * liras;
		
		System.out.println(" LA CANTIDAD DE " + pesetas + "PESETAS EN DÓLARES ES DE: " + total3);
		System.out.println(" LA CANTIDAD DE " + pesetas + "PESETAS EN LIRAS ITALIANAS ES DE: " + total4);
		System.out.println();
		
	}

}
