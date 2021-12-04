package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application implements EventHandler<ActionEvent> {
	//1) Definir
	Stage ventana;
	Scene escena;
	Button boton;
	
	@Override
	public void start(Stage primaryStage){
		
		//2) Crear
		ventana=primaryStage;
		boton= new Button("Iniciar");
		
		boton.setOnAction(this);
		//3) Lyout
		StackPane layout = new StackPane();
		layout.getChildren().addAll(boton);
	
		
		//4) Escena
		escena = new Scene(layout, 200, 200);
		ventana.setTitle("Programa POO");
		ventana.setScene(escena);
		ventana.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	//Metodo Setter
	public void handle(ActionEvent event) {
		
		if(event.getSource()==boton) {
			System.out.println("Hola Mundo!");
			//Programa para contar los nueros del 1 al 5
			int n=0;
			for (int i=0; i<=5; i++) {
				System.out.print(i+" ");
			}
		ventana.close();
		}
		
	}
	
	
}
