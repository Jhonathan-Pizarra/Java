
public class GradosCentigrados_GradosFarenhait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Convetirdor de grados cent�grados a grados farenheit
		
		float centigrados=37f;
		float farenheit;
		
		farenheit=(float) ((centigrados*(1.8))+32); 
		//Me da error, porque seguramente, el numero que est� alojado en farenhit es demasiado grande para float...
		//Por lo que, he de cambiar a tipo de dato farenheit a double.
		//O, add a cast (float) quiere decir, que ajuste el resultado a float.
		
		System.out.println("El equivalente de "+ centigrados + "� cent�grados"+ ". En grados Farenheit es: "+ farenheit + "�" );
		
	}

}
