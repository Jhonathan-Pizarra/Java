package epn;
import java.util.*;

public class AppPizza {	
	///Aplicacion en la que el usuario puede esciger
	private String tamanio_pizza;
	private String tipo_carne;
	private String tipo_embutido;
	private String topping1;
	private String topping2;
	private String salsa;
	private boolean queso;
	private String borde_pizza;
	private String costo_pizza;
	
	private double precio_base;
	private double precio_final;
	
	
	//Metodo constructor
	Scanner entrada_pizza=new Scanner(System.in);
	
	public AppPizza(String pizza){
		
	/*	if(pizza.equals("Personal")){
			precio_base=3;
			
			} */
		
		System.out.println("Ingrese el tamanioo de su Pizza: ");
		System.out.println("1) Personal");
		System.out.println("2) Mediana");
		System.out.println("3) Familiar");
		System.out.println("4) Gigante");
		int opcion_tamanio=entrada_pizza.nextInt();
		
		switch (opcion_tamanio) {
		
		case 1:
			tamanio_pizza="Personal";
			precio_base=3;
			break;
		
		case 2:

			tamanio_pizza="Mediana";
			precio_base=6;
			break;
			
		case 3:
			
			tamanio_pizza="Familiar";
			precio_base=10;
			break;
		
		case 4:
			
			tamanio_pizza="Gigante";
			precio_base=12;
			break;
			
		default:
			System.out.println("Opcion no valida");
			break;
			
		
		}
		
	}
	
	//Metodo setter
	public void colocar_carne() {
		
		System.out.println("Ingrese el tipo de su carne: ");
		System.out.println("1) Pollo");
		System.out.println("2) Cerdo");
		System.out.println("3) Res");
		System.out.println("4) Ninguno");
		int opcion_carne=entrada_pizza.nextInt();
		
		switch (opcion_carne) {
		
		case 1:
			tipo_carne="Pollo";
			precio_base=2;
			break;
		
		case 2:

			tipo_carne="Cerdo";
			precio_base=1.50;
			break;
			
		case 3:
			
			tipo_carne="Res";
			precio_base=1.75;
			break;
		
		case 4:
			
			tipo_carne="Ninguno";
			precio_final=precio_base;
			break;
			
		default:
			System.out.println("Opcion no valida");
			break;
			
		
		}
		
	}
	
	//Setter para embutido
	public void colocar_embutido() {
		

		System.out.println("Ingrese el tipo de embutido: ");
		System.out.println("1) Salchicha Italiana");
		System.out.println("2) Pepperoni");
		System.out.println("3) Jamon");
		System.out.println("4) Ninguno");
		int opcion_embutido=entrada_pizza.nextInt();
		
		switch (opcion_embutido) {
		
		case 1:
			tipo_embutido="Salchicha Italiana";
			precio_base=1;
			break;
		
		case 2:

			tipo_embutido="Pepperoni";
			precio_base=0.75;
			break;
			
		case 3:
			
			tipo_embutido="Jamon";
			precio_base=0.50;
			break;
		
		case 4:
			
			tipo_embutido="Ninguno";
			precio_final=precio_base;
			break;
			
		default:
			System.out.println("Opcion no valida");
			break;
		
	
		}

	}
	
	public void colocar_topping() {
		
		System.out.println("Opcion de Topping: ");
		System.out.println("1) Champi�ones");
		System.out.println("2) Aceitunas");
		System.out.println("3) Palmito");
		System.out.println("4) Ninguno");
		int opcion_topping=entrada_pizza.nextInt();
		
		switch (opcion_topping) {
		
		case 1:
			topping1="Champi�ones";
			precio_base=2;
			break;
		
		case 2:

			topping1="Aceitunas";
			precio_base=2;
			break;
			
		case 3:
			
			topping1="Palmito";
			precio_base=2;
			break;
		
		case 4:
			
			topping1="Ninguno";
			precio_final=precio_base;
			break;
			
		default:
			System.out.println("Opcion no valida");
			break;
		
	
		}
		
	}
	
	public void colocar_topping2() {
		
		System.out.println("Opcion de Topping 2: ");
		System.out.println("1) Pimientos");
		System.out.println("2) Pi�a");
		System.out.println("3) Jalape�os");
		System.out.println("4) Ninguno");
		int opcion_topping2=entrada_pizza.nextInt();
		
		switch (opcion_topping2) {
		
		case 1:
			topping2="Pimientos";
			precio_base=1.50;
			break;
		
		case 2:

			topping2="Pi�a";
			precio_base=1.50;
			break;
			
		case 3:
			
			topping2="Jalape�os";
			precio_base=1.50;
			break;
		
		case 4:
			
			topping2="Ninguno";
			precio_final=precio_base;
			break;
			
		default:
			System.out.println("Opcion no valida");
			break;
		
	
		}
		
	}
	
	public void colocar_salsa() {
		
		System.out.println("Opciones de salsa: ");
		System.out.println("1) Italiana");
		System.out.println("2) BBQ ");
		System.out.println("3) Mexicana");
		int opcion_salsa=entrada_pizza.nextInt();
		
		switch (opcion_salsa) {
		
		case 1:
			salsa="Italiana";
			precio_final=precio_base;
			break;
		
		case 2:

			salsa="BBQ";
			precio_final=precio_base;
			break;
			
		case 3:
			
			salsa="Mexicana";
			precio_final=precio_base;
			break;
		
		case 4:
			
			salsa="Ninguno";
			precio_final=precio_base;
			break;
			
		default:
			System.out.println("Opcion no valida");
			break;
		
	
		}
		
	}
	
	public void colocar_queso() {
		
		System.out.println("�Desea queso extra?: ");
		System.out.println("1) Si");
		System.out.println("2) No ");
		int opcion_queso=entrada_pizza.nextInt();
		
		switch (opcion_queso) {
		
		case 1:
			queso=true;
			precio_final=precio_base+1;
			break;
		
		case 2:

			queso=false;
			precio_final=precio_base+0;
			break;
			
			
		default:
			System.out.println("Opcion no valida");
			break;
		
	
		}
		
	}
	
	//Metodo Getter
	public String definir_costo() {
		
		System.out.println("Su pedido se ha registrado con exito: "+"Una pizza tamanio: "+tamanio_pizza+" Con carne de: "+tipo_carne+" y embutido: "+ tipo_embutido+ ", su topping :"+ topping1+" y ademas: "+ topping2+" A�adiedno una salsa: "+salsa+ " Tiene un costo de: "+ precio_final);
		
		
		return costo_pizza;
		}
	
	
	
	}
	
	
	

	
