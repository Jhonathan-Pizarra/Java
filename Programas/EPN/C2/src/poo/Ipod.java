/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Hacer un programa para que, en base a las elecciones del usuario, se establzca un precio final para nuestro Ipod
/*Al final debería impimir:
 * Gracias por la compra de tu Ipod
 * Modelo: 
 * Color 
 * Capaddad...etc*/
//Buena suerte!
// https://www.apple.com/shop/buy-ipad/ipad-pro/10.5-inch-display-512gb-silver-wifi-cellular

package poo;
import java.util.Scanner; //Ojo, lo que importemos debe estar siempre después del paquete
public class Ipod {
	
	//1) Atributos Generales
	private String modelo;
	private String color;
	private int capacidad;
	private String wifi;
	
	//3) Atributos específicos
	private double precio_base;
	private boolean seguro;
	
	//2) Metodo contructor
	public Ipod() {
		/*Yo podría o no dar estados iniciales de los atributos, pero la idea es que el usuario elija
		this.modelo=modelo; */
	}
	
	//4) METODOS GETTER (No tengo nada definido en el contructor)
	
	//5) METODS SETTERS
	//Set Modelo
	public void SetModelo() {
		Scanner entrada=new Scanner (System.in);
		System.out.println("1) 10.5 inch-display");
		System.out.println("2) 12.9-inch display");
		System.out.print("Modelo: ");
		int eleccion;
		eleccion=entrada.nextInt();
		
		if(eleccion==1) {
			modelo="10.5 inch-display";
			precio_base=649;
		}else if(eleccion==2) {
			modelo="12.9-inch display";
			precio_base=799;
		}
		
	}
	//Set Color
		public void SetColor() {
			Scanner entrada=new Scanner (System.in);
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
			
		//6) Getters de Setters
		//Getter PrecioFinal
		public double GetPrecioFinal() {
			SetModelo();
			SetColor();
			SetCapacidad();
			SetWifi();
			SetSeguro();
			
			System.out.println(" ");
			
			System.out.println("Gracias por comprar el nuevo: "+modelo);
			System.out.println("Color: "+color);
			System.out.println("Capacidad: "+capacidad+ "GB");
			System.out.println("Conectividad: "+wifi);
			System.out.println("Seguro: "+seguro);
			
			return precio_base; 
		}
		

		
}
