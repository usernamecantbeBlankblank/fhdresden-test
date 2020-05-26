package eu.fhd.prog2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;	//beschreibt wie die Elemte die ihm zugefügt wurden gezeichnet werden sollen 
import javafx.stage.Stage;

// extends sagt das klasse eine fx Anwendung sein soll
//damit werdn automatisch alle Methoden geerbt die die klasse Applikation hat 
public class HelloFX extends Application{
	
	//Application ist eine abstrakte klasse
	// start ist noch nicht implementiert
	
	@Override
	public void start(Stage stage) {				//bekommt zuerst eine Stage übergeben --> an Theater orientiert (Stage - Bühne & Szenen ) 
		String javaVersion = System.getProperty("java.version");		//hier wird systemeigenschaft abgefragt  --> die wird zwischengspeichert in java Version
		String javafxVersion = System.getProperty("javafx.version");	// javafxversion wird hier abgefragt 
		Label l = new Label("Hello, JavaFX " + javaVersion + ", running on Java " + javaVersion + " . "); 	// Die beiden STrings werden benutzt um ein sogenanntes Label anzulegen, 
		Scene scene = new Scene(new StackPane(l), 640, 480);		// hier wird neue Szene angelegt (STRG + SPACE auf Scene --> dann kann man gucken was die anbietet an KOnstruktoren) Zuerst parentscene anbieten, also irgendwas was gezeichnet werden kann, und dannach können verscheidene Argfumente geliefert werden --> in diesem fall sind das breite und Höhe( ALso die zwei Zahlen) --> reingeetzt wird ein STackpane --> ist ein grafisches element, wlches andere Elemenete gruppiert
																	// (l) wird diesem Stackpane hinzugefügt, so dass man  neue szene hat in dem Label in Stackpane steckt
		stage.setScene(scene);		//Szene ist genau die neu angelegte Szene 								
		
		stage.show();		// Abschließend soll bühne gezeigt werden
		
	}
	
	
	public static void main(String[] args) {
		launch();  // launch ist die wichtigste Methode  --> startet JAva fx anwendung --> Öffnet grafische benutzeroberfläche
	}
	
	
}


