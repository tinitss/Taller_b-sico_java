
/*Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuánto
deberá pagar finalmente por su compra.*/

package ControlSecuencial;

import java.util.Scanner;

public class Ejercicio4 {

	public static void ejecutar() {
		
		Scanner leer = new Scanner (System.in);
		
		int total, descuento, totalCon;
		
		System.out.println("** BIENVENIDO A NUESTRA TIENDA **");
		
		System.out.print("INGRESE EL VALOR TOTAL DE LA COMPRA: ");
		total = leer.nextInt();
		
		descuento = (int) ((double)total * 0.15);
		
		totalCon = total - descuento;
		
		System.out.print("TENIENDO EN CUENTA EL DESCUENTO (15%), DEBE PAGAR UN  TOTAL DE: " + totalCon);
		
		

	}

}
