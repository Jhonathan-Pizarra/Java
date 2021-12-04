package Poo;
import java.io.*;
public class Archivo_EscribirCaracteres{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 try {
	    	FileWriter fw = new FileWriter("/home/ubuntu/Escritorio/Prueba.txt",true);
	    	BufferedWriter bw= new BufferedWriter(fw);
	    	PrintWriter pw = new PrintWriter(bw);
	        pw.print("Segunda linea de prueba");//El archivo se sobreescribe
	    	pw.close();
	    	
	    }catch(IOException e1) {
	    	
	    }
		

	}
}