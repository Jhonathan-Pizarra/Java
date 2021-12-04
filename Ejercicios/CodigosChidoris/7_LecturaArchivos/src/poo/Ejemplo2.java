package poo;
import java.io.*;

public class Ejemplo2 {

	public static void main(String[] args) {
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
