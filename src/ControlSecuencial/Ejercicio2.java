
/*Suponga que un individuo decide invertir su capital en un banco y desea saber cuánto dinero ganará
después de un mes si el banco paga a razón de 2% mensual.*/

package ControlSecuencial;

import java.util.Scanner;

public class Ejercicio2 {

	public static void ejecutar() {
		
		Scanner leer = new Scanner(System.in);
		
		int valorI, mes=0;
		int interes;
		
		System.out.println(" ** BIENVENIDO A NUESTRO BANCO ** ");
		System.out.println(" ** (PAGAMOS EL 2% MENSUAL DE LA INVERSIÓN REALIZADA)  ** ");
		System.out.print("Ingrese cuánto quiere invertir:");
		valorI = leer.nextInt();
		
		System.out.print("Ingrese por cuántos meses quiere invertir su dinero:");
		mes = leer.nextInt();
		
		interes = (int) ((double) valorI * 0.02);
		interes = interes * mes;
		
		System.out.println();
		System.out.print("LOS INTERESES QUE RECIBIRÁ POR " + mes + " MESES SON DE:  " +  interes);
		

	}

}
