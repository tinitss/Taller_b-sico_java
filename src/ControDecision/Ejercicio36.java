package ControDecision;

import java.util.Scanner;

public class Ejercicio36 {

	public static void ejecutar() {

			Scanner leer = new Scanner (System.in);
			
			int cantidad; 
			double resultado;
			
			System.out.println("-- BIENVENIDO --");
			
			System.out.print("INGRESE LA CANTIDAD DE BOLÍVARES: ");
	        cantidad = leer.nextInt();

	        if (cantidad >= 50000) {
	            resultado = cantidad / 50000;
	            System.out.println("50000 BOLÍVARES = " + resultado);
	            cantidad = cantidad % 50000;
	            
	        }if (cantidad >= 20000) {
	            resultado = cantidad / 20000;
	            System.out.println("20000 BOLÍVARES = " + resultado);
	            cantidad = cantidad % 20000;
	            
	        }if (cantidad >= 10000) {
	            resultado = cantidad / 10000;
	            System.out.println("10000 BOLÍVARES = " + resultado);
	            cantidad = cantidad % 10000;
	            
	        }if (cantidad >= 5000) {
	            resultado = cantidad / 5000;
	            System.out.println("5000 BOLÍVARES = " + resultado);
	            cantidad = cantidad % 5000;
	            
	        }if (cantidad >= 2000) {
	            resultado = cantidad / 2000;
	            System.out.println("2000 BOLÍVARES = " + resultado);
	            cantidad = cantidad % 2000;
	            
	        }if (cantidad >= 1000) {
	            resultado = cantidad / 1000;
	            System.out.println("1000 BOLÍVARES = " + resultado);
	            cantidad = cantidad % 1000;
	            
	        }if (cantidad >= 500) {
	            resultado = cantidad / 500;
	            System.out.println("500 BOLÍVARES = " + resultado);
	            cantidad = cantidad % 500;
	            
	        }if (cantidad >= 100) {
	            resultado = cantidad / 100;
	            System.out.println("100 BOLÍVARES = " + resultado);
	            cantidad = cantidad % 100;
	            
	        }if (cantidad >= 50) {
	            resultado = cantidad / 50;
	            System.out.println("50 BOLÍVARES = " + resultado);
	            cantidad = cantidad % 50;
	            
	        }if (cantidad >= 20) {
	            resultado = cantidad / 20;
	            System.out.println("20 BOLÍVARES = " + resultado);
	            cantidad = cantidad % 20;
	            
	        }if (cantidad >= 10) {
	            resultado = cantidad / 10;
	            System.out.println("10 BOLÍVARES = " + resultado);
	            cantidad = cantidad % 10;
	            
	            
	        }if (cantidad == 0) {
	            System.out.println("EL RESULTADO ES 0");
 
	        }else if(cantidad < 0){
	            System.out.println("POR FAVOR INGRESE VALORES POSITIVOS");
	        }
	}

}
