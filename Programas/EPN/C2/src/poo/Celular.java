/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
import java.util.Scanner;

public class Celular {
	
	//1) Atributos Generales
	private String modelo;
	private String color;
	private int capacidad;
	private String wifi;
	
	//3) Atributos Especificos
	private double precio_base;
	private boolean seguro;
	
	//2) Metodo Contrcutor
	public Celular() {
			
		
	}
	//Scanner entrada=new Scanner(System.in);//Para todos, fuera del metodo contructor
	
	//4) METODOS GETTER
/*	public String GetModelo() {
		
		return modelo;
	}*/
	//Duda, aunque no tenga un SETTER, mientras lo defina en el contructor, siempre es necesario un metodo Getter para un atributo?..Si
	//Hasta aqui, no necesito los otros getters, porque lo voy a meter en uno solo, El de precio final
	
	//5) METODOS SETTER
	//Set Modelo
	public void SetModelo() {
		Scanner entrada=new Scanner(System.in);
		System.out.println("1) 10.5 Samsung-display");
		System.out.println("2) 12.9 SonyXperia-display");
		System.out.print("Modelo: ");
		int eleccion;
		eleccion=entrada.nextInt();
		
		switch(eleccion) {
		case 1:
			modelo="10.5 Samsung-display";
			precio_base=649;
			break;
		case 2:
			modelo="12.9 SonyXperia-display";
			precio_base=799;
			break;
			
		}
	}
	public void SetColor() {
		Scanner entrada=new Scanner(System.in);
		System.out.println("1) Silver");
		System.out.println("2) Gold");
		System.out.println("3) Rose Gold");
		System.out.println("4) Space Gray");
		System.out.print("Color: ");
		int eleccion;
		eleccion=entrada.nextInt();
		
		switch(eleccion) {
		case 1:
			color="Silver";
			break;
		case 2:
			color="Gold";
			break;
		case 3:
			color="Rose Gold";
			break;
		case 4:
			color="Space Gray";
			break;
		}
		
	}
		//Set Capacidad
		public void SetCapacidad() {
		Scanner entrada=new Scanner(System.in);
		System.out.println("1) G4 GB");
		System.out.println("2) 256 GB");
		System.out.println("3) 512 GB");
		System.out.print("Capacidad: ");
		int eleccion;
		eleccion=entrada.nextInt();
		
		switch(eleccion) {
		case 1:
			capacidad=64;
			precio_base=precio_base+0;
			break;
		case 2:
			capacidad=256;
			precio_base=(precio_base+150);
			break;
		case 3:
			capacidad=512;
			precio_base=(precio_base+350);
			break;
		}
		
		
	}
		//Set Wifi
		public void SetWifi() {
		Scanner entrada=new Scanner(System.in);
		System.out.println("1) Wi-Fi");
		System.out.println("2) Wi-Fi + Celular");
		System.out.print("Conectividad: ");
		int eleccion;
	    eleccion=entrada.nextInt();
					
	switch(eleccion) {
		case 1:
			wifi="Wi-Fi";
			precio_base=precio_base+0;	
			break;
		case 2:	
			wifi="Wifi + Celular";
			precio_base=(precio_base+130);
			break;
		}	
	}
		//Set Seguro
		public void SetSeguro() {
		Scanner entrada=new Scanner(System.in);	
		System.out.println("1) Si");
		System.out.println("2) No");
		System.out.print("¿Desea seguro?: ");
		int eleccion;
		eleccion=entrada.nextInt();
					
		if(eleccion==1) {
			seguro=true;
			precio_base=(precio_base+99);
		}else if(eleccion==2) {
			seguro=false;
			precio_base=(precio_base+0);
		}
					
	}
	
	//6) GETTERS DE SETTERS
		
	//Get todo
		public String GetTdo() {
			SetModelo();
			SetColor();
			SetCapacidad();
			SetWifi();
			SetSeguro();
			return " ";
		}
	//Get PrecioFinal
		
		public String GetPrecioFinal() {

				System.out.println("Gracias por adquirir el nuevo "+ modelo +" con las características: ");
				System.out.println("Color: "+ color);
				System.out.println("Capacidad: "+capacidad+" GB");
				if(wifi=="Wifi") {
					System.out.println("Conectividad: Wifi");
					
				}else if(wifi=="Wifi + Celular") {
					System.out.println("Conectividad: Wifi+Celular");
				}
				if(seguro==true) {
					System.out.println("Seguro: Si");
				}else if(seguro==false) {
					System.out.println("Seguro: No");
				}
				
			
				System.out.println(" ");
				System.out.println("Precio final: "+precio_base);
				
	
				
			
			return  "Gracias por su compra";
		}
	
}