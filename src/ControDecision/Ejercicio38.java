	package ControDecision;
	
	import java.util.Scanner;
	
	public class Ejercicio38 {
	
		public static void ejecutar() {
			
			Scanner leer = new Scanner (System.in);
			
			int año, mes, dia, calcularEdad;
			
			System.out.println("-- BIENVENIDO --");
			
			System.out.println("INGRESE SU AÑO DE NACIMIENTO (YYYY)");
			año = leer.nextInt();
			
			System.out.println("INGRESE SU MES DE NACIMIENTO (MM)");
			mes = leer.nextInt();
			
			System.out.println("INGRESE SU DIA DE NACIMIENTO (DD)");
			dia = leer.nextInt();
			
			calcularEdad = 2023 - año;
			
			System.out.println("-- SU EDAD ES: " + calcularEdad + " AÑOS");
			System.out.println();
			
			if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
			
				System.out.println("SU SIGNO ZODIACAL ES: SAGITARIO" );
				
			}else if ((dia >= 22 && mes == 12) || (dia <= 20 && mes == 01)) {
			
				System.out.println("SU SIGNO ZODIACAL ES: CAPRICORNIO" );
				
			}else if ((dia >= 21 && mes == 01) || (dia <= 19 && mes == 02)) {
			
				System.out.println("SU SIGNO ZODIACAL ES: ACUARIO" );
				
			}else if ((dia >= 20 && mes == 02) || (dia <= 19 && mes == 03)) {
			
				System.out.println("SU SIGNO ZODIACAL ES: PISCIS" );
				
			}else if ((dia >= 21 && mes == 03) || (dia <= 20 && mes == 04)) {
			
				System.out.println("SU SIGNO ZODIACAL ES: ARIES" );
				
			}else if ((dia >= 21 && mes == 4) || (dia <= 21 && mes == 5)) {
			
				System.out.println("SU SIGNO ZODIACAL ES: TAURO" );
				
			}else if ((dia >= 22 && mes == 5) || (dia <= 21 && mes == 6)) {
			
				System.out.println("SU SIGNO ZODIACAL ES: GÉMINIS" );
				
			}else if ((dia >= 22 && mes == 6) || (dia <= 22 && mes == 7)) {
			
				System.out.println("SU SIGNO ZODIACAL ES: CANCÉR" );
				
			}else if ((dia >= 23 && mes == 7) || (dia <= 23 && mes == 8)) {
			
				System.out.println("SU SIGNO ZODIACAL ES: LEO" );
				
			}else if ((dia >= 24 && mes == 8) || (dia <= 22 && mes == 9)) {
			
				System.out.println("SU SIGNO ZODIACAL ES: VIRGO" );
				
			}else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) {
			
				System.out.println("SU SIGNO ZODIACAL ES: LIBRA" );
				
			}else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) {
			
				System.out.println("SU SIGNO ZODIACAL ES: ESCORPIÓN" );
				
			}else if ((mes < 1 || mes > 12) && (dia < 1 || dia > 31)){
				System.out.println("LOS DATOS INGRESADOS SON ERRÓNEOS");
			}
			else {
				System.out.println("LOS DATOS INGRESADOS SON ERRÓNEOS");
			}
		}
	
	}
