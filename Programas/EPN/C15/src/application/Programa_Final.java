package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Programa_Final {

	//5) Metodo getter
	static boolean respuesta;
	public static boolean Pantalla(String titulo, String mensaje) {
		
		
		//6)Stage
		Stage ventana = new Stage();
		ventana.initModality(Modality.APPLICATION_MODAL);
		ventana.setMinWidth(10);
		ventana.setTitle(titulo);
		
		//7) Label
		Label label = new Label(mensaje);
		Button boton_x= new Button("Si");
		Button boton_y= new Button("No");
		
		//9) Acciones del boton
				boton_x.setOnAction(e->{respuesta=true; ventana.close();});
				boton_y.setOnAction(e->{respuesta=false; ventana.close();});


		//8) VBox layput
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, boton_x, boton_y);
		Scene escena = new Scene(layout, 200, 200);
		ventana.setScene(escena);
		ventana.showAndWait();
		
		
		
		
		return respuesta;
		
	}
	

}
