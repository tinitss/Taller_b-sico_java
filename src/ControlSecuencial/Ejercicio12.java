package ControlSecuencial;

import java.util.Scanner;

public class Ejercicio12 {
	
	public static void ejecutar() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println(" -- BIENVENIDO ALUMNO -- ");
		
		double notaExamenMatematicas, tareaM1, tareaM2, tareaM3, promedioE_M = 0.9, promedioT_M = 0.1, examenM, tareasM, totalM;
		double notaExamenFisica, tareaF1, tareaF2, promedioE_F = 0.8, promedioT_F = 0.2, examenF, tareasF, totalF;
		double notaExamenQuimica, tareaQ1, tareaQ2, tareaQ3, promedioE_Q = 0.85, promedioT_Q = 0.15, examenQ, tareasQ, totalQ;
		double promedioTotal;
		
		// MATEMÁTICAS
		System.out.print("INGRESE LA NOTA DEL EXÁMEN DE MATEMATICAS: ");
		notaExamenMatematicas  = leer.nextDouble();
		
		System.out.print("INGRESE LA NOTA DE LA TAREA 1 DE MATEMATICAS: ");
		tareaM1 = leer.nextDouble();
		
		System.out.print("INGRESE LA NOTA DE LA TAREA 2 DE MATEMATICAS: ");
		tareaM2 = leer.nextDouble();
		
		System.out.print("INGRESE LA NOTA DE LA TAREA 3 DE MATEMATICAS: ");
		tareaM3 = leer.nextDouble();
		
		System.out.println();
		
		
		//FÍSICA
		System.out.print("INGRESE LA NOTA DEL EXÁMEN DE FÍSICA ");
		notaExamenFisica = leer.nextDouble();
		
		System.out.print("INGRESE LA NOTA DE LA TAREA 1 DE FÍSICA ");
		tareaF1 = leer.nextDouble();
		
		System.out.print("INGRESE LA NOTA DE LA TAREA 2 DE FÍSICA ");
		tareaF2 = leer.nextDouble();
		
		System.out.println();
		
		//QUÍMICA
		System.out.print("INGRESE LA NOTA DEL EXÁMEN DE QUÍMICA ");
		notaExamenQuimica = leer.nextDouble();
		
		System.out.print("INGRESE LA NOTA DE LA TAREA 1 DE QUÍMICA ");
		tareaQ1 = leer.nextDouble();
		
		System.out.print("INGRESE LA NOTA DE LA TAREA 2 DE QUÍMICA ");
		tareaQ2 = leer.nextDouble();
		
		System.out.print("INGRESE LA NOTA DE LA TAREA 3 DE QUÍMICA ");
		tareaQ3 = leer.nextDouble(); 
		
		System.out.println();
		System.out.println();
		
		
		//OPERACIONES
		examenM = notaExamenMatematicas * promedioE_M;
		tareasM= (tareaM1 + tareaM2 + tareaM3) / 3;
		tareasM = tareasM * promedioT_M;
		totalM = examenM + tareasM;
		
		
		examenF = notaExamenFisica * promedioE_F;
		tareasF = (tareaF1 + tareaF2) / 2;
		tareasF = tareasF * promedioT_F;
		totalF = examenF + tareasF;
		
		examenQ = notaExamenQuimica * promedioE_Q;
		tareasQ = (tareaQ1 + tareaQ2 + tareaQ3) / 3;
		tareasQ = tareasQ * promedioT_Q;
		totalQ = examenQ + tareasQ;
		
		
		promedioTotal = (totalM + totalF + totalQ) / 3;
		
		
		
		
		
		System.out.println("EL PROMEDIO DE MATEMÁTICAS ES DE: " +  totalM);
		System.out.println("EL PROMEDIO DE FÍSICA ES DE: " +  totalF);
		System.out.println("EL PROMEDIO DE QUÍMICA ES DE: " +  totalQ);
		System.out.println("EL PROMEDIO GENERAL DE LAS TRES MATERIAS ES DE: " + promedioTotal);
		
		
		
	
	
	}
	

}
