package Poo;

import java.io.*;

public class Leer_ArchivoBYTES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) Poner estos metodos especiales 
		FileInputStream fis;
		BufferedInputStream bis;
		
		try {
			fis = new FileInputStream("C:/Users/HP/Desktop/Mis_Archivos/Archivo_1.txt");
			bis = new BufferedInputStream(fis); //Almacenar en buffer lo que encunetres en esa dirección
		
			System.out.println("Archivo Leído");
		
		
		}catch(FileNotFoundException ex1) {
			
			System.out.println("Error: "+ex1.getMessage());
		}catch(IOException e2) {
			
		} 

	}
}

