package ControDecision;

import java.util.Scanner;

public class Ejercicio34 {

	public static void ejecutar() {

		Scanner leer = new Scanner (System.in);
		
		double sueldo, categoria, resultado, total;
		
		System.out.println("-- BIENVENIDO --");
		
		System.out.print("INGRESE SU CATEGORÍA: ");
		categoria = leer.nextDouble();
		
		System.out.print("INGRESE SU SUELDO: ");
		sueldo = leer.nextDouble();
		
		System.out.println();
		
		if(categoria == 1) {
			System.out.println("SU CATEGORÍA ES LA 1"); 
			
			resultado = sueldo * 0.15;
			total = sueldo + resultado;
			
			System.out.println("USTED TIENE UN AUMENTO DEL 15%, LO CUAL CORRESPONDE A: " + resultado);
			System.out.println("FINALMENTE SU SULEDO MÁS EL AUMENTO ES EQUIVALENTE A: " + total);
			
		}else if(categoria == 2) {
			System.out.println("SU CATEGORÍA ES LA 2"); 
			
			resultado = sueldo * 0.10;
			total = sueldo + resultado;
			
			System.out.println("USTED TIENE UN AUMENTO DEL 10%, LO CUAL CORRESPONDE A: " + resultado);
			System.out.println("FINALMENTE SU SULEDO MÁS EL AUMENTO ES EQUIVALENTE A: " + total);
			
		}else if(categoria == 3) {
			System.out.println("SU CATEGORÍA ES LA 3"); 
			
			resultado = sueldo * 0.08;
			total = sueldo + resultado;
			
			System.out.println("USTED TIENE UN AUMENTO DEL 8%, LO CUAL CORRESPONDE A: " + resultado);
			System.out.println("FINALMENTE SU SULEDO MÁS EL AUMENTO ES EQUIVALENTE A: " + total);
			
		}else if(categoria == 4) {
			System.out.println("SU CATEGORÍA ES LA 4"); 
			
			resultado = sueldo * 0.07;
			total = sueldo + resultado;
			
			System.out.println("USTED TIENE UN AUMENTO DEL 7%, LO CUAL CORRESPONDE A: " + resultado);
			System.out.println("FINALMENTE SU SULEDO MÁS EL AUMENTO ES EQUIVALENTE A: " + total);
			
		}else {
			System.out.println("POR FAVOR ESCOJA UNA CATEGORÍA VÁLIDA");
		}
	}

}
