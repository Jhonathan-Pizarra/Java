package Poo;
import java.io.*;
public class Leer_ArchivoCARACTERES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String texto="";
			try {
	    	   FileReader fr = new FileReader("C:/Users/HP/Desktop/Archivo_1.txt");
	    	   BufferedReader br = new BufferedReader(fr);
	    	   String linea;
	    	   while((linea= br.readLine())!=null) {
	    		texto +=linea;   
	    	   }
	    	   System.out.println(texto);
	    	   br.close();	   
	    	   }
			catch(FileNotFoundException e1) {
				System.out.println("Archivo no encontrado");
				
	       }
			catch(IOException e2) {
				
			}
			
		
			
			
			
			
			


	}

}
