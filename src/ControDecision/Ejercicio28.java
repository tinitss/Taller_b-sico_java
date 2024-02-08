package ControDecision;

import java.util.Scanner;

public class Ejercicio28 {

	public static void ejecutar() {
		
		Scanner leer = new Scanner (System.in);
		
		double numeroPiezas, precioPiezas = 50000, total, totalEmpresa, totalBanco, valorCuotas, totalCuotas, interes ;
			
			System.out.println("-- BIENVENIDO EMPRESARIO --");
			
			System.out.println("EL PRECIO DE CADA PIEZA ES DE: $50000");
			
			System.out.print("CUÁNTAS PIEZA DESEA COMPRAR: ");
			numeroPiezas = leer.nextDouble();
			
			System.out.println();
			
			total = precioPiezas * numeroPiezas; 
			System.out.println("** EL TOTAL A PAGAR ES: " + total);
			
			if (total >= 500000) {
				
				totalEmpresa = total * 0.55;
				System.out.println("DE SU PROPIO DINERO SERÁ UN 55%, LO CUAL EQUIVALE A:: " + totalEmpresa );
				
				totalBanco = total * 0.30;
				System.out.println("EL BANCO LE PRESTARÁ UN 30%, LO CUAL EQUIVALE A: " + totalBanco );
				
				valorCuotas = totalEmpresa + totalBanco;
				
				valorCuotas = total - valorCuotas;
				
				interes = valorCuotas * 0.20;
				
				totalCuotas = (valorCuotas / total) * 100;
				
				System.out.println();
				System.out.println("EL VALOR QUE DEBE CANCELAR EN CUOTAS ES: " + valorCuotas);
				System.out.println("EL PORCENTAJE QUE DEBE PAGAR EN CUOTAS EQUIVALE Al: " + totalCuotas + "%");
				System.out.println("LOS INTERESES QUE DEBERÁ PAGAR POR LAS CUOTAS, SON: " + interes);
				System.out.println();
				
				total = total + interes;
				System.out.println("EL TOTAL QUE AL FINAL DEBE PAGAR ES: " + total);
				
			}else if (total < 500000) {
				
				totalEmpresa = total * 0.70;
				System.out.println("DE SU PROPIO DINERO SERÁ UN 70%, LO CUAL EQUIVALE A:: " + totalEmpresa );
				
				valorCuotas = total - totalEmpresa ;
				
				interes = valorCuotas * 0.20;
				
				totalCuotas = (valorCuotas / total) * 100;
				
				System.out.println();
				System.out.println("EL VALOR QUE DEBE CANCELAR EN CUOTAS ES: " + valorCuotas);
				System.out.println("EL PORCENTAJE QUE DEBE PAGAR EN CUOTAS EQUIVALE AL: " + totalCuotas + "%");
				System.out.println("LOS INTERESES QUE DEBERÁ PAGAR POR LAS CUOTAS, SON: " + interes);
				System.out.println();
				
				total = total + interes;
				System.out.println("EL TOTAL QUE AL FINAL DEBE PAGAR ES: " + total);
			
			}else {
				System.out.println("LOS DATOS INGRESADOS SON ERRÓNEOS");
			}
		

	}

}
