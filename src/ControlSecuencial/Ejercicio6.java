
/*Un maestro desea saber qué porcentaje de hombres y qué porcentaje de mujeres hay en un grupo
de estudiantes.*/

package ControlSecuencial;

import java.util.Scanner;

public class Ejercicio6 {

	public static void ejecutar() {
		
		Scanner leer = new Scanner (System.in);
		
		double hombres, mujeres, estudiantes;
		double  porMujeres, porHombres;
		
		System.out.println("HOLA PROFESOR, BIEN O NO?");
		System.out.println();
		
		System.out.print("INGRESE LA CANTIDAD DE ESTUDIANTES: ");
		estudiantes = leer.nextInt();
		
		System.out.print("INGRESE LA CANTIDAD DE MUJERES: ");
		mujeres = leer.nextInt();
		
		System.out.print("INGRESE LA CANTIDAD DE HOMBRES: ");
		hombres = leer.nextInt();

		porMujeres = mujeres / estudiantes;
		porMujeres =  porMujeres * 100;
				;
		porHombres = hombres / estudiantes;
		porHombres = porHombres * 100;
		
		System.out.println();
		System.out.println("EL PORCENTAJE DE MUJERES ES DE: " + porMujeres + "%");
		System.out.println("EL PORCENTAJE DE HOMBRES ES DE: " + porHombres + "%");
	}

}
