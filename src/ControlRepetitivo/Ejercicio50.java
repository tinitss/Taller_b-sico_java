package ControlRepetitivo;

public class Ejercicio50 {

	public static void ejecutar() {

		System.out.println("-- BIENVENID@ --");
		
		int suma =0;
		
		for(int i = 97; i <= 1003; i++) {
			if (i % 2 == 0) {
                suma += i;
			}	
		}
		System.out.println("LA SUMA DE LOS NÚMEROS PARES QUE ESTÁN DENTRO DE 97 Y 1003 ES: " +  suma);
	}
}
