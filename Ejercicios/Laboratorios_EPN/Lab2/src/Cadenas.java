
public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena_1="Jhonathan";
		String cadena_2="Pizarra";
		System.out.println(cadena_1 +" "+ cadena_2);
		
		//Cuando estamos tratando con objetos no estaticos, debemos poner el nombre del objeto
		// Y el metodo. El otro era uno estatico, por lo que se ponía el nombre de la clase, el punto y el método
		int numero_letras=cadena_1.length(); //Comienza a cotnar desde 1
		System.out.println(numero_letras);
		
		char letra_nombre=cadena_1.charAt(8); //Comienza a contar desde cero.
		System.out.println(letra_nombre);
		
		

	}

}
