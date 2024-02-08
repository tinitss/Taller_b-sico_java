package ControlRepetitivo;

import java.util.Scanner;

public class Ejercicio54 {

	public static void ejecutar() {
		
		Scanner leer = new Scanner (System.in);
		
		double promedioGeneral = 0, promedioIndividual = 0;
		double totalPreguntas = 0, opcion;
		double promedioAlto = 0, promedioBajo = Double.MAX_VALUE;
		int cuestionarios, cuestionarioAlto = 0, cuestionarioBajo = 0, totalCustionarios = 0, preguntas;
		double totalPuntos = 0;
		double cantidadPromediosInferior = 0, porcentajeInferior = 0 , cantidadPromediosSuperior = 0,porcentajeSuperior = 0, cantidadPromedios = 0, porcentajeMasDe45 = 0;
		
		System.out.println("");
		
		for(cuestionarios = 1; cuestionarios <= 3; cuestionarios++) {
			System.out.println("--- CUESTIONARIO " + cuestionarios + " ---");
			System.out.println("* PREGUNTAS * --- (SELECCIONE ENTRE 1 Y 5)");
			System.out.println();
			
			totalPuntos = 0;
			totalPreguntas = 0;
			
			
			for(preguntas = 1; preguntas <= 2; preguntas++) {
				System.out.print("PREGUNTA " + preguntas + ": ");
				opcion = leer.nextDouble();
//				System.out.println("PARA ESTA PREGUNTA USTED SELECCIONÓ: " + opcion);
//				System.out.println();
				
				totalPuntos = totalPuntos + opcion;
				totalPreguntas ++;
				
				promedioIndividual = totalPuntos / totalPreguntas;
				
			}
			
			// PROMEDIO INDIVIDUAL DE CADA CUESTIONARIO
			promedioIndividual = totalPuntos / totalPreguntas;
			System.out.println("EL PROMEDIO INDIVIDUAL DEL CUESTIONARO "  +  cuestionarios + " ES: " + promedioIndividual);
			System.out.println();
			
			

			//PROMEDIO GENERAL DE LOS CUESTIONARIOS
			promedioGeneral = promedioGeneral + promedioIndividual;
			promedioGeneral = promedioGeneral / cuestionarios;
			
			//PROMEDIO MÁS ALTO
			 if (promedioIndividual > promedioAlto) {
	                promedioAlto = promedioIndividual;
	                cuestionarioAlto = cuestionarios;
             }
			 
			 //PROMEDIO MÁS BAJO
			 if (promedioIndividual < promedioBajo) {
	                promedioBajo = promedioIndividual;
	                cuestionarioBajo = cuestionarios;
          }
			 
			 //PORCENTAJE DE PROMEDIOS INFERIOR A 3 / SUPERIOR A 4
			 if(promedioIndividual <= 3) {
				 cantidadPromediosInferior++; 
			 }
			 porcentajeInferior = (cantidadPromediosInferior / cuestionarios) * 100;
			 
			 
			 if(promedioIndividual >= 4) {
				 cantidadPromediosSuperior++;  
			 }
			 porcentajeSuperior = ((cuestionarios - cantidadPromediosInferior) / cuestionarios) * 100;
			 
			 
			 if(promedioIndividual >= 4.5 && promedioIndividual <= 5) {
				 cantidadPromedios++;
			 }
			 porcentajeMasDe45 = (cantidadPromedios / cuestionarios) * 100;
			 
		}
		
		//PROMEDIO GENERAL DE LOS CUESTIONARIOS
		System.out.println("EL PROMEDIO GENERAL DE TODOS LOS CUESTIONARIOS ES: " + promedioGeneral );
		
		//PROMEDIO MÁS ALTO
		System.out.println("EL PROMEDIO MÁS ALTO ES: " + promedioAlto + " Y CORRESPONDE AL CUESTIONARIO: " + cuestionarioAlto );	

		//PROMEDIO MÁS BAJO
		System.out.println("EL PROMEDIO MÁS BAJO ES: " + promedioBajo + " Y CORRESPONDE AL CUESTIONARIO: " + cuestionarioBajo );
	
		//PORCENTAJE DE PROMEDIOS INFERIORES O IGUALES A 3
		System.out.println("EL PORCENTAJE DE LOS PROMEDIOS INFERIORES A 3 ES: " + porcentajeInferior);
		
		//PORCENTAJE DE PROMEDIOS SUPERIORES O IGUALES A 4
		System.out.println("EL PORCENTAJE DE LOS PROMEDIOS SUPERIORES A 4 ES: " + porcentajeSuperior);
		
		//PORCENTAJE DE PROMEDIOS ENTRE 4.5 Y 5
		System.out.println("EL PORCENTAJE DE LOS PROMEDIOS ENTRE 4.5 Y 5 ES: " + porcentajeMasDe45);
		
		
		
//		System.out.println("TOTAL PUNTOS: "  + totalPuntos);
//		System.out.println("TOTAL PREGUNTAS: "  + totalPreguntas);
		
		
		
	}

}
