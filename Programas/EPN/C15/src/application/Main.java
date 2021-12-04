package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	//1) Definir
	Stage ventana;
	Scene escena;
	Button boton;
	
	@Override
	public void start(Stage primaryStage) {
	
		//2) Crear
		ventana =  primaryStage;
		boton = new Button("Iniciar");
		
		//3) Layout
		StackPane layout = new StackPane();
		layout.getChildren().addAll(boton);
		
		boton.setOnAction(e->{boolean respuesta= Programa_Final.Pantalla("Pantalla_2", "¿Desea sobreescribir el archivo?");
							 {boolean respuesta2= Programa_Final2.Pantalla2("Pantalla_3", "¿Desea leer el archivo?");
 		if(respuesta==true) {
			try {
				FileWriter fw = new FileWriter("C:/Users/HP/Desktop/Archivo_1.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				
				pw.print("Jonathan_Xavier");
				pw.close();
				
			}catch (IOException ex_1) {
				
			}
		}
		if(respuesta2==true) {
				String texto="";
				try {
					FileReader fr = new FileReader("C:/Users/HP/Desktop/Archivo_1.txt");
					BufferedReader br = new BufferedReader(fr);
					
					String linea;
					while((linea= br.readLine())!=null){
						texto += linea;
						
					}
					System.out.println(texto);
					br.close();
				}catch(IOException ex_2) {
					
				}
			}
			
			
		}
		
		});
		
		//4) Escenario
		escena = new Scene(layout, 200, 200);
		ventana.setTitle("Examen Supletorio");
		ventana.setScene(escena);
		ventana.show();
	
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
