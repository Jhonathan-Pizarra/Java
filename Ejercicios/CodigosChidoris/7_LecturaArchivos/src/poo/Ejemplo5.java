package poo;

import java.io.*;

public class Ejemplo5 {

	public static void main(String[] args) {
		try 
		{	
		 FileOutputStream fas;
		 BufferedOutputStream bos;
		int data;
		fas = new FileOutputStream("/home/ubuntu/Escritorio/Prueba.txt");
		bos = new BufferedOutputStream(fas);
        DataOutputStream dos = new DataOutputStream(bos);
        dos.writeBoolean(false);
        dos.close();
        
		}catch(IOException e1) {
			
		}
	
		
	}

}
