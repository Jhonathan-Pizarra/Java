import java.util.*;
import javax.swing.JOptionPane;
public class Jhonathan_Pizarra_Evaluacion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1) Sumar dos numeros.");
		System.out.println("2) Multiplicar dos numeros.");
		System.out.println("3) Dividir dos numeros.");
		System.out.println("4) Calcular la raiz cubica de un numero.");
		System.out.println("5) Determinar si el numero ingresado es par o impar.");
		System.out.println("6) Crear una matriz (3x3) randomica.");
		System.out.println("7) Ingresar dos numeros y determinar cual de los dos es el menor, cual es mayor o si son iguales.");
		System.out.println("8) Salir.");
		
		System.out.println(" ");
	
		Scanner entradax=new Scanner (System.in);
		System.out.println("Presiona un numero cualquiera para comenzar..");
		int opcion1=entradax.nextInt();
		System.out.println(" ");
		
		do {
			
			
			Scanner entrada=new Scanner (System.in);
			System.out.println("Ingresa una opcion: ");
			int opc=entrada.nextInt();
			System.out.println(" ");
			
		switch (opc) {
		case 1:
			System.out.println("Suma dos numeros.");
			Scanner entrada_1=new Scanner (System.in);
			System.out.print("Ingresa una numero: ");
			int numero_1=entrada_1.nextInt();
			System.out.print("Ingresa otro numero: ");
			int numero_2=entrada_1.nextInt();
			int suma=numero_1+numero_2;
			System.out.println("La suma es: "+suma);
			System.out.println(" ");
			break;
			
		case 2:
			
			System.out.println("Multiplicar dos numeros.");
			Scanner entrada_2=new Scanner (System.in);
			System.out.print("Ingresa una numero: ");
			int numero_3=entrada_2.nextInt();
			System.out.print("Ingresa otro numero: ");
			int numero_4=entrada_2.nextInt();
			int multiplicacion=numero_3*numero_4;
			System.out.println("La multiplicacion es: "+multiplicacion);
			System.out.println(" ");
			break;
			
		case 3:
			
			System.out.println("Dividir dos numeros.");
			Scanner entrada_3=new Scanner (System.in);
			System.out.print("Ingresa una numero: ");
			int numero_5=entrada_3.nextInt();
			System.out.print("Ingresa otro numero: ");
			int numero_6=entrada_3.nextInt();
			int division=numero_5/numero_6;
			if(numero_6==0) {
				System.out.println("No existe division para cero..");
			}else {
				System.out.println("La divison es: "+division);	
			}
			System.out.println(" ");
			break;
			
		case 4:
			
			System.out.println("Calcular la raiz cubica de un numero.");
			Scanner entrada_4=new Scanner (System.in);
			System.out.print("Ingresa una numero: ");
			int numero_7=entrada_4.nextInt();
			double numero_raiz=Math.sqrt(numero_7);
			
			System.out.println("La raiz cubica es: "+numero_raiz);
			System.out.println(" ");
			break;
			
		case 5:
			
			System.out.println("Determinar si el numero ingresado es par o impar.");
			Scanner entrada_5=new Scanner (System.in);
			System.out.print("Ingresa una numero: ");
			int numero_8=entrada_5.nextInt();
			
			if(numero_8%2==0) {
				System.out.print("El numero "+numero_8+ " es par");
			}else {
				System.out.print("El numero "+numero_8+ " es impar");
			}
			System.out.println(" ");
			break;
			
		case 6:
			
			System.out.println("Crear una matriz (3x3) randomica.");
			int [] [] matriz=new int [3] [3] ;
			
			for(int i=0; i<3; i++) {
				System.out.println(" ");
				for(int j=0; j<3; j++) {
					matriz[i][j]=(int) (Math.random()*100);
					System.out.print(matriz[i][j]+" ");
				}
			}
			System.out.println(" ");
			break;
			
		case 7:
			
			System.out.println("Ingresar dos numeros y determinar cual de los dos es el menor, cual es mayor o si son iguales.");
			Scanner entrada_6=new Scanner (System.in);
			System.out.print("Ingresa una numero: ");
			int numero_9=entrada_6.nextInt();
			System.out.print("Ingresa otro numero: ");
			int numero_10=entrada_6.nextInt();
			
			if(numero_9>numero_10) {
				System.out.print("El numero "+numero_9+ " es Mayor");
				System.out.print(" Y el numero "+numero_10+ " es Menor");
			}else if (numero_9<numero_10){
				System.out.print("El numero "+numero_10+ " es Mayor");
				System.out.print(" Y el numero "+numero_9+ " es Menor");
			}else {
				System.out.print("El numero "+numero_10+ " y el numero "+numero_9+ " son iguales");
			}
			System.out.println(" ");
			break;
		
		case 8:
			
			System.out.println("Hasta la proxima");
			
			
			break;
			
			default:
				System.out.println("Opcion no valida..");
				break;
		
		}
		if(opc==8) {
			break;
		}
			
		

			
		}while(opcion1!=8);
	
			
			
		}

		
	}



