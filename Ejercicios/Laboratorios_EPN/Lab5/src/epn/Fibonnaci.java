import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner (System.in);
		System.out.print("Ingresa la cantidad de numeros: ");
		int canitdad_numeros;
		canitdad_numeros=entrada.nextInt();
		//Hasta aqui, pedi cuantos numeros ...
		
		int numero_original=1;
		int numero_nuevo=1;
		int fibo;
		System.out.println("La sucesión: ");
		System.out.print(numero_original+ " "+numero_nuevo+" " );

		for(int i=0; i<canitdad_numeros; i++) {
		
			fibo=numero_nuevo+numero_original;
			System.out.print(fibo+" ");
			numero_original=numero_nuevo;
			numero_nuevo=fibo;
			
			
		}
	}

}
//SI escribimos 100, apareceran numeros negatovos, es porque el tipo de dato entero ya no alberga valores muy grandes
//Por lo que deberiamos usar un tipo de dato entero long...