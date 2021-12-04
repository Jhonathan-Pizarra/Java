
public class Matematics_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// De dos numeros: a=1, b=2
		//Suma 
		//Resta
		//Multiplicacion
		//Divison
		//Ra�z de b
		//Exonencia de a elevado a la b;
		//Seno de 45;
		//Coseno de 90
		//Tangente de 45;
		// Valor absoluto de -3
		// La hipotenusa de a y b
		// El logaritmo en base 10 de 5
		//El mayor de dos numeros decimales
		//El menor de dos numeros enteros
		//Convertir 90 grados centirgrados a radianes
		//Convertir 3Pi/2 a centrigrados;
		
		double a=2;
		double b=3;
		
		//Suma
		int suma;
		suma=(int)(a+b);
		
		//Resta
		int resta;
		resta=(int)(a-b);
		
		//Multiplicacion
		int multiplicacion;
		multiplicacion=(int)(a*b);
		
		//Division
		double divison;
		divison=(a/b);
		System.out.println("division "+divison);
		
		//Raiz
		float raiz;
		raiz=(float)Math.sqrt(b);
		
		//Exponente
		float exponente;
		exponente=(float) Math.pow(a, b);
		
		//..............................................................
		//Convertir un angulo en centigrados a radianes
		float angulo;
		angulo=(float) Math.toRadians(45);
		System.out.println(angulo);
		
		//Converir un angulo en radianes a centigrados
		float angulo_2;
		angulo_2=(float)Math.toDegrees(4.712389);
		System.out.println(angulo_2+ "�");
		
		
		//Seno de 45
		float seno;
		seno=(float) Math.sin(angulo); //El angulo debe estar en radianes. Solo aspi funciona bien 		
		System.out.println(seno);
		
		//Coseno de 45
		float coseno;
		coseno= (float) Math.cos(angulo);
		System.out.println(coseno);
		
		//Tangente de 45
		float tangente;
		tangente=(float) Math.tan(angulo);
		System.out.println(tangente);
		
		//........................................................................
		
		//Valor absoluto de -3
		int absoluto;
		absoluto=Math.abs(-3);
		System.out.println(absoluto);
		
		//Hipotenusa de a y b
		float hipotenusa;
		hipotenusa=(float)Math.hypot(a, b);
		System.out.println(hipotenusa);

	}

}
