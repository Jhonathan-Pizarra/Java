package poo;
import java.util.*;

public class Avion_Militar extends Avion{
	
	//1) Atributos especificos
	private boolean arma;
	private String radar;
	private int cantidad_cajas;
	
	//2) Metodo constuctor
	public Avion_Militar(String radar, int cantidad_cajas) {
		super();
		
		this.radar=radar;
		this.cantidad_cajas=cantidad_cajas;
	}
	
	public void SetArmas() {
		Scanner entrada=new Scanner(System.in);
		System.out.println("�Tiene armas?: ");
		System.out.println("1) Si ");
		System.out.println("2) No ");
		int armas=entrada.nextInt();
		
		if(armas==1) {
			this.arma=true;
			
		}else if(armas==2) {
			this.arma=false;
			
		}
	
	}
	
	public boolean GetArmas(){
		
		return arma;
	}
	
	public int GetCanitdad(){
		
		return cantidad_cajas;
	}
}
