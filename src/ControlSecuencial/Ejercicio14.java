package ControlSecuencial;

import java.util.Scanner;

public class Ejercicio14 {
	
		public static void ejecutar() {
		
		Scanner leer = new Scanner (System.in);
		
		int a,b,c,d,e,f;
		int denominador, x, y;
		
		System.out.print("-- BIENVENIDO --");
		System.out.println();
		
		System.out.print("INGRESE EL VALOR DE A: ");
		a = leer.nextInt();
		
		System.out.print("INGRESE EL VALOR DE B: ");
		b = leer.nextInt();
		
		System.out.print("INGRESE EL VALOR DE C: ");
		c = leer.nextInt();
		
		System.out.print("INGRESE EL VALOR DE D: ");
		d = leer.nextInt();
		
		System.out.print("INGRESE EL VALOR DE E: ");
		e = leer.nextInt();
		
		System.out.print("INGRESE EL VALOR DE F: ");
		f = leer.nextInt();
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("** CALCULAREMOS EL DENOMINADOR COMÚN **");	
		denominador = (a*e) - (b*d);
		System.out.println("EL DOMINADOR COMÚN ES: " +  denominador);
		System.out.println();
		
		
		System.out.println("CALCULAREMOS EL VALOR DE X");
		x = ((c*e) -(b*f)) / denominador;
		System.out.println("EL VALOR DE X ES: " +  x);
		System.out.println();
		
		
		System.out.println("CALCULAREMOS EL VALOR DE Y");
		y = ((a*f) -(c*d)) / denominador;
		System.out.println("EL VALOR DE Y ES: " +  y);
		
		
}

}
