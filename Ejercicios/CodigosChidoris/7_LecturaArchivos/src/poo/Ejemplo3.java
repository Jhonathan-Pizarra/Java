package poo;

import java.io.*;

public class Ejemplo3 {

	public static void main(String[] args) {
       String texto="";
		try {
    	   FileReader fr = new FileReader("/home/ubuntu/Escritorio/Prueba.txt");
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
