
public class Matematica { //Un error ser�a que a tu clase le llames "Math" y que quieras usar justamente los metodos que ofrece esta clase
//Porque clase Math ya est� definida y no saldr�n los metodo que esa clase contendr� si tienes el mismo nombre de esa clase en tu clase
	//En otras palabras: "No puedes usar el nombre de una clase definida en una propia"
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EJERCICIOS:
		//Clcular la ra�z de un numero:
		//En el API: dice que el modificador y tipo es Static Double 
		//El que sea static significa que debemos primero llamar a la clase, luego un punto y depu�s el m�todo
		
		// Y que los metodos son as�:  sqrt (Argumentos); (Quer ser�a el metodo y el argumento)
		//Entonces significa que el tipo de dato de nuestro argumento debe ser double

		double raiz;
		raiz=Math.sqrt(34);
		//Pero si quisieramos una ra�z con resultado..float o int. �Que tendr�amos que hacer? ..�Un cast!
		//Esto se le llama refundicion
		float raiz_2;
		raiz_2=(float) Math.sqrt(34);
		
		System.out.println(raiz);
		System.out.println(raiz_2);
		System.out.println(" ");
		
		int raiz_3;
		raiz_3=(int) Math.sqrt(34);
		System.out.println(raiz_3);
		System.out.println("Cachin ! , pan comido jaja");
		
		
	}

}
