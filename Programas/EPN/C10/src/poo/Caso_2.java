package poo;

public class Caso_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		int [] array = new int [5];
		
		for (int i=0; i<5; i++) {
			array[i]=20;			
		}
		System.out.println(" ");
		//1) 
		try{
			for (int i=0; i<7; i++) { //Aqui me genraraira error---
			System.out.println("Array: "+array[i]);
			
			}
		
		} catch (ArrayIndexOutOfBoundsException ex1) {
			System.out.println("Fin del Array");
			System.out.println("El tama�o ideal es:"+ex1.getLocalizedMessage());
		}
		System.out.println("Resto del codigo");

	
}

}
