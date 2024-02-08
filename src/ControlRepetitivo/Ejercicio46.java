package ControlRepetitivo;

import java.util.Scanner;

public class Ejercicio46 {

	public static void ejecutar() {
		
		Scanner leer = new 	Scanner (System.in);
		
		System.out.println("-- BIENVENIDO --");
		System.out.println();
		
		int n, k;
		
		System.out.print("INGRESE EL VALOR PARA N: ");
		n = leer.nextInt();
		
		System.out.print("INGRESE EL VALOR PARA K: ");
		k = leer.nextInt();
		
		
		if(k >= n) {
			System.out.println();
			System.out.println("K DEBE SER MENOR QUE N");
		
		}else {
			for(int i = n; i >= k; i--) {
				System.out.println(i);
			}
		}
		
		
	}

}
