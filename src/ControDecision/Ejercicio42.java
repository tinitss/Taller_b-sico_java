package ControDecision;

import java.util.Scanner;

public class Ejercicio42 {
	
	public static void ejecutar() {
		
		Scanner leer = new Scanner (System.in);
		
		double meses, hemoglobina;
		int genero;
		
		System.out.println("-- BIENVENIDO --");
		System.out.println();
		
		System.out.print("INGRESE LA EDAD EN MESES: ");
		meses = leer.nextDouble();
		
		System.out.print("INGRESE QUE NIVEL DE HEMOGLOBINA TIENE: ");
		hemoglobina = leer.nextDouble();
		
		System.out.println("OPCIÓN 1 DE GÉNERO (1/Mujer)");
		System.out.println("OPCIÓN 2 DE GÉNERO (2/Hombre)");
		System.out.print("INGRESE A QUE GÉNERO PERTENECE: ");

		genero = leer.nextInt();
		
		System.out.println();
		
		if(meses >= 0 && meses <= 1) {
			if(hemoglobina < 13 || hemoglobina > 26) {
				System.out.println("LASTIMOSAMENTE TIENE ANEMIA ");
			}else {
				System.out.println("ESTÁ BIEN DE SALUD");
			}
			
		}else if(meses > 1 && meses <= 6) {
			if(hemoglobina < 10 || hemoglobina > 18) {
				System.out.println("LASTIMOSAMENTE TIENE ANEMIA ");	
			}else {
				System.out.println("ESTÁ BIEN DE SALUD");
			}
			
		}else if(meses > 6 && meses <= 12) {
			if(hemoglobina < 11 || hemoglobina > 15) {
				System.out.println("LASTIMOSAMENTE TIENE ANEMIA ");			
			}else {
				System.out.println("ESTÁ BIEN DE SALUD");
			}
		
		}else if(meses > 12 && meses <= 60) {
			if(hemoglobina < 11.5 || hemoglobina > 15) {
				System.out.println("LASTIMOSAMENTE TIENE ANEMIA ");			
			}else {
				System.out.println("ESTÁ BIEN DE SALUD");
			}
			
		}else if(meses > 60 || meses <= 120) {
			if(hemoglobina < 12.6 || hemoglobina > 15.5) {
				System.out.println("LASTIMOSAMENTE TIENE ANEMIA ");	
			}else {
				System.out.println("ESTÁ BIEN DE SALUD");
			}
			
		}else if(meses > 120 && meses <= 180) {
			if(hemoglobina < 13 || hemoglobina > 15.5) {
				System.out.println("LASTIMOSAMENTE TIENE ANEMIA ");	
			}else {
				System.out.println("ESTÁ BIEN DE SALUD");
				
			}
		}else {
			System.out.println("fin");
		}
		switch(genero){
			case 1:
				if(meses > 120) {
					if(hemoglobina < 12 || hemoglobina > 16) {
						System.out.println("LASTIMOSAMENTE TIENE ANEMIA ");	
					}else {
						System.out.print("ESTÁ BIEN DE SALUDaaa");
					}
				}
			break;
					
			case 2:
				if(meses > 120) {
				
					if(hemoglobina < 14 || hemoglobina > 18) {
						System.out.println("LASTIMOSAMENTE TIENE ANEMIA ");	
					}else {
						System.out.print("ESTÁ BIEN DE SALUD");
					}	
				}
			break;
			
			default:
				System.out.println("GÉNERO NO RECONOCIDO, INTÉNTELO DE NUEVO");
	
			}
				
		
	}
}
	

