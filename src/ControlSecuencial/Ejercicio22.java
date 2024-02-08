package ControlSecuencial;

import java.util.Scanner;

public class Ejercicio22 {

	public static void ejecutar() {

		Scanner leer = new Scanner (System.in);

		System.out.println("-- BIENVENIDO A PC-BOT --");
		System.out.println();
		
		double tiempo, precioContado, precioCuotas, cuotas, tasaIntereses;
		
		System.out.print("INGRESE EL PRECIO DE CONTADO: ");
		precioContado = leer.nextDouble(); 
		
		System.out.print("INGRESE EL PRECIO DE LAS CUOTAS : ");
		cuotas = leer.nextDouble();
		
		System.out.print("INGRESE POR CUÁNTO TIEMPO SERÁN LAS CUOTAS: ");
		tiempo = leer.nextDouble();
		
		System.out.println();
		
		precioCuotas = cuotas * tiempo;
		tasaIntereses =  precioCuotas - precioContado;
		
		tasaIntereses = (tasaIntereses / precioContado) * 100;
		
		System.out.println("EL RECARGO POR PAGAR EN CUOTAS ES DE: " + tasaIntereses + "%");
		
		
		
	}

}