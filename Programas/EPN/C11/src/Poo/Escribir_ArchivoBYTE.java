package Poo;
import java.io.*;
public class Escribir_ArchivoBYTE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{	
		 FileOutputStream fas;
		 BufferedOutputStream bos;
		int data;
		fas = new FileOutputStream("/home/ubuntu/Escritorio/archivo.bin");
		bos = new BufferedOutputStream(fas);
	    data=(int)'L';
	    bos.write(data); 
	    bos.close();
		}
		catch(	IOException e1) {
			System.out.println("Archivo Imnace");
		}
			
		

	}

}
