/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo; //Si nos fijamos bien, ahora ya no dice package default, sino ahora dice Poo, en este paquete pueden ir n clases
//Pero las clases no puedne llamarse igual...
//Si lo quisieramos así, tendríamos que crear otro paquete, y ahi si ponerle la clase (Que quieras que tenga el mismo nombre de esta clase)

//Bienvenido a Poo

public class Avion { //Avion es el nombre de mi clase
	//Dentro de esta clase, definiremos todo con respecto a nuestra clase...
	
	//1) Atributos generales de mi avión.
	private int ruedas;
	private int peso;
	private int largo;
	private int ancho;
	private int alas;
	
	//3) Atributos particulares de mi avión
	private String color; //lo encapsulamos...
	int peso_final;
	boolean primera_clase;
	boolean internet;
	
	
	//2) Dentro de esta clase, debemos definir el método constructor, el cual, le da el estado incial a mi objeto
	public Avion() { //Public es un controlador de modificacion de acceso, de la clase: Avion
		
		ruedas=2;
		peso=300;
		largo=400;
		ancho=70;
		alas=2;
		
	}
	
	//4) METODOS GETTER: Devuelve el valor de la propiedad de los objetos
	//Es decir, permite que la clase Uso_Avion, pueda tener acceso a los atributos generales que hemos creado (Y definido en el metodo contructor) en esta clase
	//Get_Ruedas
	public int GetterRuedas() {
		
		return ruedas;
	}
	//Get_Peso
	public int GetterPeso() {
		
		return peso;
	}
	//Get_Largo
	public int GetterLargo() {
		
		return largo;
	}
	//Get_Ancho
	public int GetterAncho() {
		
		return ancho;
	}
	//Get_Alas
	public int GetterAlas() {
		
		return alas; //También podríamos retornar un mensaje return "El avion tiene: "+alas+ "alas". Si hacemos esto, solo deberíamos mandar a imprimir en el Uso_Avion y ya saldíra con el texto
	}
	
	/*public String GetterColor() {
		
		return color;
		
	} Esto esta mal... Porque no fue definido el color en el metodo contructor . Y no lo defini porque no es un atriburo general, entonces... ¿Qué debería ahacer?*/
	
	//5) METODOS SETTER: Modifica o establece el valor de la propiedad del ejemplar 
	//Set_PesoFinal
	public void SetterPesoFinal() {
			peso_final=2000;
		}
	//Ya hemos creado , colocado un valor para el peso final (En este caso mandé un valor quemado, pero ustede puede modificarlo con Scanner o JoPtion..O paraámetros..)
	
	//Set_Color
	public void SetterColor(String color) { 
		this.color=color; //Usamos this para referenciar que el color que pongamos tendrá el color que mandemos" en esta funcion, en este parámetro.
	}
	
	public void SetterInternet() {
		internet=false;
		/*if(internet==false) {
			System.out.println("No tiene internet.");
		}*/
	}
	
	//Pero ahora, necesitamos que mi objeto avion_1, tenga acceso a este Método 
	//¿Como lo hacemos?.... A traves de un metodo Getter
	
	//6) GETTERS PARA SETTERS
	public String GetterColor() {

		return color;
	} 
	
	//Get PesoFinal
	public int GetterPesoFinal() {
		
		return peso_final;
	}
	
	//Get Internet
	public boolean GetterInternet() {
		
		return internet;
	}

}
//Si mandamos a ejecutar así tal y como está.... no imprimirá nada
//Porque no hay un método main.
//Aqui solo hemos creardo una plantilla, "los planos del avion."



//OJO, TODO DEBE ESTAR DENTRO DE LA PUBLIC CLASS AVION
//Si le mando a imprimir...me sale color: null 
//Crisis exixtencial: Si yo defino el color en el GetterColor, si me va a imprimir : azul, pero ese sería entonces, una característica general puesto que, si creo otro avion, y trato de ponerle color, se me va a poner azul...
//La solución aparente sería crear otro setter para color2, diferente a color, y por ende otro getter... Pero eso no sería optimizar el código...

//Pues no, lo que se debe hacer es... PASAR POR PARÁMETROS, en el setter
//Algo que podemos rescatar es que el nombre del parametro de los setters no importa que sea igual que el nombre del atributo. (Pero siempre y cuando usemos la palabra this.)

//Solucion a la crisis existencial :3 
//En los setter,yo puedo de hecho realizar las operaciones, definir en el setter, ya sea quemados o por el usuario... Pero primero que todo, debo, en el Uso_Avion, colocar ese metodo a mi objeto :3 (Ver como estableci el peso final a mi avion 1)