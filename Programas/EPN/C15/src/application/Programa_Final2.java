package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Programa_Final2 {
	
	//5) Metodo Getter
		static boolean respuesta2;
		public static boolean Pantalla2(String titulo, String mensaje) {
			
			//6)Stage
			Stage ventana = new Stage ();
			ventana.initModality(Modality.APPLICATION_MODAL);
			ventana.setTitle(titulo);
			ventana.setMinWidth(50);
			
			//7)Label
			Label label = new Label(mensaje);
			Button boton_a= new Button("Yes");
			Button boton_b = new Button("Not");
			
			//9) Acciones del boton
					boton_a.setOnAction(e->{respuesta2= true; ventana.close();}); 
					boton_b.setOnAction(e->{respuesta2= false; ventana.close();});
			
			//8)VBox
			VBox layout = new VBox(10);
			layout.getChildren().addAll(label, boton_a, boton_b);
			Scene escena = new Scene (layout, 200, 200);
			ventana.setScene(escena);
			ventana.showAndWait();

			
			return respuesta2;
		}


}
