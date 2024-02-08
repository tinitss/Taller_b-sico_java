
/*Calcule el área de un triángulo en función de las longitudes de sus lados, utilizando la fórmula:
√p(p­a)(p­b)(p­c) donde p = (a+b+c) / 2*/


package ControlSecuencial;

import java.util.Scanner;

public class Ejercicio8 {

	public static void ejecutar() {
		
		Scanner leer = new Scanner (System.in);
		
		double a,b,c,p;
		
		double area;
		
		System.out.println("** CÁLCULO DEL ÁREA DE UN TRIÁNGULO **");
		System.out.println();
		
		System.out.print("INGRESE EL VALOR PARA a: ");
		a = leer.nextDouble();
		
		System.out.print("INGRESE EL VALOR PARA b: ");
		b = leer.nextDouble();
		
		System.out.print("INGRESE EL VALOR PARA c: ");
		c = leer.nextDouble();
		
		
		p = (a+b+c) / 2;
		
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("EL ÁREA DEL TRIÁNGULO ES: " + area);
		
		

	}

}
