package Poo;
//Subir el archivo en Zip
//Nombre: Jhonathan Pizarra
//Carrera: ASI

import java.util.*;

public class Calculadora {
	
	private double x;
	private double y;
	private double suma;
	private double multiplicacion;
	private double resta;
	private double division;
	private double exponencial;
	
	Scanner entrada=new Scanner (System.in);
	
	//Métodos COnstructores
	public Calculadora(){ 
		x=1;
		y=2;
		suma=(x+y);
		resta=(x-y);
		multiplicacion=(x*y);
		if(y==0) {
			System.out.println("No existe division para cero");
		}else {
			division=(x/y);
		}
		
		exponencial=Math.pow(x, y);
		
	}
	
	public Calculadora(double x, double y){ 
		this.x=x;
		this.y=y;
		suma=(x+y);
		resta=(x-y);
		multiplicacion=(x*y);
		if(y==0) {
			System.out.println("No existe division para cero");
		}else {
			division=(x/y);
		}
		exponencial=Math.pow(x, y);
		
	}
	
	public Calculadora(double x){ 
		this.x=x;
		System.out.print("Ingrese el valor de y: ");
		double y=entrada.nextInt();
		this.y=y;
		suma=(x+y);
		resta=(x-y);
		multiplicacion=(x*y);
		if(y==0) {
			System.out.println("No existe division para cero");
		}else {
			division=(x/y);
		}
		exponencial=Math.pow(x, y);
	}
	
	//Métodos Getter
	public double getsuma() {
		
		return suma;
	}
	
	//Resta:
	public double getresta() {
		
		return resta;
	}
	
	//Multiplicacion:
	public double getmultiplicacion() {
		
		return multiplicacion;
	}
	
	//Division:
	public double getdivision() {
	
		
		return division;
	}
	
	//Exponentes:
		public double getexponente() {
			
			return exponencial;
		}
		
	
	
}