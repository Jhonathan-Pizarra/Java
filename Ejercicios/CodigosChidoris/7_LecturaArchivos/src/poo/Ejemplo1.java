package poo;

import java.io.*;
public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis;	//para bytes
		BufferedInputStream bis;
		
		try
		{
	
		int data;
		fis = new FileInputStream("/home/ubuntu/Escritorio/archivo.bin");
		bis = new BufferedInputStream(fis);
		System.out.println("archivo leido");
		
		
		}
		catch(FileNotFoundException e1)
		{
			System.out.println("Arvhivo no encontrado");
		}
		catch(IOException e2) {
			
		} 


	}
}
