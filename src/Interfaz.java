/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class Interfaz extends Application{
    private TextField nombre;
    private TextField apellido;
    public void start(Stage primaryStage) throws Exception{
        Label l1=new Label("    Nombre     ");
        Label l2=new Label("    Apellido     ");
        this.nombre=new TextField();
        this.apellido=new TextField();
        Button ok=new Button("Ok");
        ok.setOnAction(new Evento());
        VBox v1=new VBox();
        VBox v2=new VBox();
        HBox h=new HBox();
        v1.getChildren().add(l1);
        v1.getChildren().add(l2);
        v2.getChildren().add(nombre);
        v2.getChildren().add(apellido);
        v2.getChildren().add(ok);
        h.getChildren().add(v1);
        h.getChildren().add(v2);
        Scene scene=new Scene(h,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

class Evento  implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent t) {
        System.out.println(nombre.getText());
        System.out.println(apellido.getText());
    }
}


public static void main(String[]args){
    Application.launch(args);
    }
}
