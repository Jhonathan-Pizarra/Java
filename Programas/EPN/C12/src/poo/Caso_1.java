package Poo;

public class Caso_1 {
	//1) Definir varialbes globales
	public static int numerador=10; //static �Por qup�?
	//Static puede ser utiliada en constanes, o metodos, o variables (EN este caso esta variable se vuelve una variable de clase, (o un atributo)
	public static int denominador=0;
	public static double division;
	
	public static void main(String[] args) {
		System.out.println("Paso previo a la ejecucion: ^_^ ");
		System.out.println(" ");
	
		//division=(numerador/denominador);
		//System.out.println(division);
		
		//Tal y como esta hasta ahora, si lo mandamos a ejecutar saldra un error Exception thread "manin"... "ArithmeticEception
		//Entonces, debemos usar try y catch para las excepciones
		
		try {
			System.out.println("Entrada a Try...");
			division=(numerador/denominador);
			System.out.println(division); //Desde aqui, no se va a imprimir, porque se localiz� un error, entonces salt� al catch directo
			System.out.println("...Salida Try"); //No se va a imprimir, porque 
			System.out.println("..................");
		}
		catch(ArithmeticException ex) { //ex de excepcion para este tipo de errores
			System.out.println("Entrada a Catch...");
			System.out.println("Error: "+ ex.getMessage()); //Aqu� estamos capurando la expcepcion, bueno, de hecho fue en el try, cuando la identific� , salt� directo al catch
			System.out.println("...Salida Catch");
			System.out.println("--------------------");			
		}
		//Sin emvargo, para que el codigo no termine as�, usamos finally
		finally {
			System.out.println("Entrada a Finally...");
			System.out.println("NO EXISTE DIVIS�N PARA CERO");
			System.out.println("...Salida finally");
		}
		
		//�Por qu� no se imprimio Salida Try?
		//Lo que pasa es que finally lo que hace es que, el programa siga localizando errores en el try, y no se detenga solo en el primero y salte de una al catch
		//Sino que los localiza, y una vez localiados, los clasifica en alg�n catch... al que ere error corresponda
		
	}

}
