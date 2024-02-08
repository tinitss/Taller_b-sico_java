package ControlRepetitivo;

import java.util.Scanner;

public class Ejercicio52 {

	public static void ejecutar() {
		
		Scanner leer = new Scanner (System.in);
			
		double edad, peso;
		double promedioNiño = 0, promedioJoven = 0, promedioAdulto = 0, promedioAnciano = 0;
		double pesoNiños = 0, totalNiños = 0;
		double pesoJovenes = 0, totalJovenes = 0;
		double pesoAdultos = 0, totalAdultos = 0;
		double pesoAncianos = 0, totalAncianos = 0;
		
				
			
		System.out.println("-- BIENVENIDO --");
		System.out.println();
		
	
		
		for(int personas = 1; personas <= 100; personas++) {
			
			System.out.println("PERSONA " + personas);
			
			System.out.print("INGRESE SU EDAD: ");
			edad = leer.nextDouble();
			
			System.out.print("INGRESE SU PESO: ");
			peso = leer.nextDouble();
			
			System.out.println();
			
			if(edad < 0) {
				System.out.println("INGRESE UNA EDAD VÁLIDA");
				
			}else if(edad <= 12) {
				pesoNiños = pesoNiños + peso;
				totalNiños = totalNiños + 1;
				promedioNiño = pesoNiños / totalNiños;
				
			}else if(edad >= 13 && edad <= 29) {
				pesoJovenes = pesoJovenes + peso;
				totalJovenes = totalJovenes + 1;
				promedioJoven = pesoJovenes / totalJovenes;
			
			}else if(edad >= 30 && edad <= 59) {
				pesoAdultos = pesoAdultos + peso;
				totalAdultos = totalAdultos + 1;
				promedioAdulto = pesoAdultos / totalAdultos;
				
			}else if(edad >= 60) {
				pesoAncianos = pesoAncianos + peso;
				totalAncianos = totalAncianos + 1;
				promedioAnciano = pesoAncianos / totalAncianos;
			}
			
		
		}
			System.out.println();
			System.out.println("EL PROMEDIO DE PESO DE LOS NIÑOS ES: " + promedioNiño);
			System.out.println("EL PROMEDIO DE PESO DE LOS JÓVENES ES: " + promedioJoven);
			System.out.println("EL PROMEDIO DE PESO DE LOS ADULTOS ES: " + promedioAdulto);
			System.out.println("EL PROMEDIO DE PESO DE LOS ANCIANOS ES: " + promedioAnciano);

	}

}
