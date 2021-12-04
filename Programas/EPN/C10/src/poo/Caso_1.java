package poo;

public class Caso_1 {
	
	private static int numerador=1;
	private static int denominador=0;
	private static int division;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1) Try
		try{
			System.out.println("Entrada al TRY..");
			division=(numerador/denominador); //Salio error de ArithmeticException...
			//Llega hasta aqui y pum, salta al catch porque aqui ya detecto un error
			System.out.println("...Salida del TRY"); 
			
		} catch (ArithmeticException ex1) {
			System.out.println("Entrada al CATCH..");
			System.out.println("Error: "+ex1.getMessage()); //Imprime en pantalla el mensaje de error que ha encontrado...
			System.out.println("...Salida del CATCH");
		}
		//Pero si quiesieramos que siga leyendo el resto del codigo?
		// Si no estuviera finally, el codigo va a leerese hasta que encuentre la primera excepcion, luego salta al catch y ahi se detiene, los demas ya no buscan 
		//Como no hya m�s errores, ya no se vuelve a menter al try... pro eso no imprime el Salida Try
		finally {
			System.out.println("Entrada Finally");
			System.out.println("Hola K Ase");
			System.out.println("Salida Finally");
		}
	}

}
