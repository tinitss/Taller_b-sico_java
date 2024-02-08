import java.util.Scanner;

//SECUENCIALES
import ControlSecuencial.Ejercicio2;
import ControlSecuencial.Ejercicio4;
import ControlSecuencial.Ejercicio6;
import ControlSecuencial.Ejercicio8;
import ControlSecuencial.Ejercicio10;
import ControlSecuencial.Ejercicio12;
import ControlSecuencial.Ejercicio14;
import ControlSecuencial.Ejercicio16;
import ControlSecuencial.Ejercicio18;
import ControlSecuencial.Ejercicio20;
import ControlSecuencial.Ejercicio22;

//CONDICIONALES
import ControDecision.Ejercicio24;
import ControDecision.Ejercicio26;
import ControDecision.Ejercicio28;
import ControDecision.Ejercicio30;
import ControDecision.Ejercicio32;
import ControDecision.Ejercicio34;
import ControDecision.Ejercicio36;
import ControDecision.Ejercicio38;
import ControDecision.Ejercicio40;
import ControDecision.Ejercicio42;
import ControDecision.Ejercicio44;

//CÍCLICOS
import ControlRepetitivo.Ejercicio46;
import ControlRepetitivo.Ejercicio48;
import ControlRepetitivo.Ejercicio50;
import ControlRepetitivo.Ejercicio52;
import ControlRepetitivo.Ejercicio54;
import ControlRepetitivo.Ejercicio56;
import ControlRepetitivo.Ejercicio58;
import ControlRepetitivo.Ejercicio60;
import ControlRepetitivo.Ejercicio62;
import ControlRepetitivo.Ejercicio64;
import ControlRepetitivo.Ejercicio66;
import ControlRepetitivo.Ejercicio68;
import ControlRepetitivo.Ejercicio70;
import ControlRepetitivo.Ejercicio72;
import ControlRepetitivo.Ejercicio74;
import ControlRepetitivo.Ejercicio76;
import ControlRepetitivo.Ejercicio78;
import ControlRepetitivo.Ejercicio80;


//VECTORES
import Vectores.Ejercicio82;
import Vectores.Ejercicio84;
import Vectores.Ejercicio86;
import Vectores.Ejercicio88;




public class main {
	
	public static void mostrarMenuPrincipal() {
	    System.out.println("=== Menú Principal ===");
	    System.out.println("1. CONTROL SECUENCIAL");
	    System.out.println("2. CONTROL DE DECISIÓN");
	    System.out.println("3. CONTROL REPETITIVO");
	    System.out.println("4. VECTORES");
	    
	    System.out.println("0. SALIR");
	}
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
        int opcion, ejercicio;

        do {
            mostrarMenuPrincipal();
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            
            switch (opcion) {
            case 1:
                System.out.println("HA SELECCIONADO CONTROL SECUENCIAL");

	                do {
	                	System.out.println();
	                	System.out.print("ESCOJA UN EJERCICIO DEL 2 AL 22 (SOLO NÚMEROS PARES)   - PARA SALIR PRESIONE 0 -");
	                	ejercicio = leer.nextInt();
	                	
	                	
	                	switch(ejercicio) {
		                	case 2:
		                		Ejercicio2.ejecutar();
		                		break;	
		                		
		                	case 4:      
		                		Ejercicio4.ejecutar();
		                		break;
		                		
		                	case 6:
		                		Ejercicio6.ejecutar();
		                		break;
	                		
		                	case 8:
		                		Ejercicio8.ejecutar();
		                		break;
		                		
		                	case 10:
		                		Ejercicio10.ejecutar();
		                		break;
		                		
		                	case 12:
		                		Ejercicio12.ejecutar();
		                		break;
		                		
		                	case 14:
		                		Ejercicio14.ejecutar();
		                		break;
		                		
		                	case 16:
		                		Ejercicio16.ejecutar();
		                		break;
		                		
		                	case 18:
		                		Ejercicio18.ejecutar();
		                		break;
		                		
		                	case 20:
		                		Ejercicio20.ejecutar();
		                		break;
		                		
		                	case 22:
		                		Ejercicio22.ejecutar();
		                		break;
		                		
		                	case 0:
		                		System.out.println("Saliendo del programa...");
		                		break;
	                		
	                		default:
	                			System.out.println("Opción no válida. Inténtelo de nuevo.");
	                			break;
	                	}
              }while(ejercicio != 0);
      
            break;
                
            case 2: 
            	System.out.println("HA SELECCIONADO CONTROL DE DECISIÓN");
            	
            	do {
                	System.out.println();
                	System.out.print("ESCOJA UN EJERCICIO DEL 24 AL 44 (SOLO NÚMEROS PARES)   - PARA SALIR PRESIONE 0 -");
                	ejercicio = leer.nextInt();
                	
                	
                	switch(ejercicio) {
	                	case 24:
	                		Ejercicio24.ejecutar();
	                		break;	
	                		
	                	case 26:      
	                		Ejercicio26.ejecutar();
	                		break;
	                		
	                	case 28:
	                		Ejercicio28.ejecutar();
	                		break;
                		
	                	case 30:
	                		Ejercicio30.ejecutar();
	                		break;
	                		
	                	case 32:
	                		Ejercicio32.ejecutar();
	                		break;
	                		
	                	case 34:
	                		Ejercicio34.ejecutar();
	                		break;
	                		
	                	case 36:
	                		Ejercicio36.ejecutar();
	                		break;
	                		
	                	case 38:
	                		Ejercicio38.ejecutar();
	                		break;
	                		
	                	case 40:
	                		Ejercicio40.ejecutar();
	                		break;
	                		
	                	case 42:
	                		Ejercicio42.ejecutar();
	                		break;
	                		
	                	case 44:
	                		Ejercicio44.ejecutar();
	                		break;
	                		
	                	case 0:
	                		System.out.println("Saliendo del programa...");
	                		break;
                		
                		default:
                			System.out.println("Opción no válida. Inténtelo de nuevo.");
                			break;
                	}
                	
            	}while(ejercicio != 0);
            
        	break;
                
            case 3: 
            	System.out.println("HA SELECCIONADO CONTROL REPETITIVO");
                
            	do {
                	System.out.println();
                	System.out.print("ESCOJA UN EJERCICIO DEL 46 AL 80 (SOLO NÚMEROS PARES)   - PARA SALIR PRESIONE 0 -");
                	ejercicio = leer.nextInt();
                	
                	
                	switch(ejercicio) {
	                	case 46:
	                		Ejercicio46.ejecutar();
	                		break;	
	                		
	                	case 48:      
	                		Ejercicio48.ejecutar();
	                		break;
	                		
	                	case 50:
	                		Ejercicio50.ejecutar();
	                		break;
                		
	                	case 52:
	                		Ejercicio52.ejecutar();
	                		break;
	                		
	                	case 54:
	                		Ejercicio54.ejecutar();
	                		break;
	                		
//	                	case 56:
//	                		Ejercicio56.ejecutar();
//	                		break;
//	                		
//	                	case 58:
//	                		Ejercicio58.ejecutar();
//	                		break;
//	                		
//	                	case 60:
//	                		Ejercicio60.ejecutar();
//	                		break;
//	                		
//	                	case 62:
//	                		Ejercicio62.ejecutar();
//	                		break;
//	                		
//	                	case 64:
//	                		Ejercicio64.ejecutar();
//	                		break;
//	                		
//	                	case 66:
//	                		Ejercicio66.ejecutar();
//	                		break;
//	                		
//	                	case 68:
//	                		Ejercicio68.ejecutar();
//	                		break;
//	                		
//	                	case 70:
//	                		Ejercicio70.ejecutar();
//	                		break;
//	                		
//	                	case 72:
//	                		Ejercicio72.ejecutar();
//	                		break;
//	                		
//	                	case 74:
//	                		Ejercicio74.ejecutar();
//	                		break;
//	                		
//	                	case 76:
//	                		Ejercicio76.ejecutar();
//	                		break;
//	                		
//	                	case 78:
//	                		Ejercicio78.ejecutar();
//	                		break;
//	                		
//	                	case 80:
//	                		Ejercicio80.ejecutar();
//	                		break;
//	                		
	                	case 0:
	                		System.out.println("Saliendo del programa...");
	                		break;
                		
                		default:
                			System.out.println("Opción no válida. Inténtelo de nuevo.");
                			break;
                	}
            	}while(ejercicio != 0);
        	break;     
           
        
//            case 4: 
//            	System.out.println("HA SELECCIONADO VECTORES");
//                
//            	do {
//                	System.out.println();
//                	System.out.print("ESCOJA UN EJERCICIO DEL 82 AL 88 (SOLO NÚMEROS PARES)   - PARA SALIR PRESIONE 0 -");
//                	ejercicio = leer.nextInt();
//                	
//                	
//                	switch(ejercicio) {
//	                	case 82:
//	                		Ejercicio82.ejecutar();
//	                		break;	
//	                		
//	                	case 84:      
//	                		Ejercicio84.ejecutar();
//	                		break;
//	                		
//	                	case 86:
//	                		Ejercicio86.ejecutar();
//	                		break;
//                		
//	                	case 88:
//	                		Ejercicio88.ejecutar();
//	                		break;
	                		
//	                	case 0:
//	                		System.out.println("Saliendo del programa...");
//	                		break;
//                		
//                		default:
//                			System.out.println("Opción no válida. Inténtelo de nuevo.");
//                			break;
//                	}
//            	}while(ejercicio != 0);
//  
//        	break;
            	
        	
            case 0:
                System.out.println("Saliendo del programa...");
                break;
                
            default:
                System.out.println("Opción no válida. Inténtelo de nuevo.");
                break;
        }
	
      
    } while (opcion != 0);

    }

	

}


	


