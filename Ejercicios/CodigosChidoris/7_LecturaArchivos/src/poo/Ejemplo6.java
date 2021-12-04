package poo;

import java.io.*;

public class Ejemplo6 {

public static void main(String[] args) {
	File archivo = new File("/home/ubuntu/Escritorio/Prueba2.txt");
	System.out.println(archivo.getName());
	System.out.println(archivo.getTotalSpace());
	archivo.delete();
	}

	
}
