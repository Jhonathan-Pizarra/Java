package Poo;

import java.io.*;
public class Eliminar_Archivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File archivo = new File("C:/Users/HP/Desktop/Mis_Archivos/Archivo_1.txt");
		System.out.println(archivo.getName());
		System.out.println(archivo.getTotalSpace());
		
		archivo.delete();
		}
	}


