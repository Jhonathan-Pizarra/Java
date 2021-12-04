package poo;
import java.io.*;
public class Ejemplo4 {

	public static void main(String[] args) {
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
