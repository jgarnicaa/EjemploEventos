/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CambioVentana;


import javafx.application.Application;
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
public class Vista1 implements Vista {
    private Scene escena;
    private Label l1;
    private Label l2;
    private TextField nombre;
    private TextField apellido;
    private Button ok;
    public Vista1(){
        l1=new Label("    Nombre     ");
        l2=new Label("    Apellido     ");
        this.nombre=new TextField();
        this.apellido=new TextField();
        ok=new Button("Ok");
        HBox h1=new HBox();
        HBox h2=new HBox();
        VBox v=new VBox();
        h1.getChildren().add(l1);
        h2.getChildren().add(l2);
        h1.getChildren().add(nombre);
        h2.getChildren().add(apellido);
        v.getChildren().add(h1);
        v.getChildren().add(h2);
        v.getChildren().add(ok);
        //Se crea la escena
        this.escena=new Scene(v, 500, 500);
    }

    @Override
    public Scene getScene() {
       return this.escena;
    }
    //S definen los get

    public Scene getEscena() {
        return escena;
    }

    public Label getL1() {
        return l1;
    }

    public Label getL2() {
        return l2;
    }

    public TextField getNombre() {
        return nombre;
    }

    public TextField getApellido() {
        return apellido;
    }

    public Button getOk() {
        return ok;
    }
    
    
    
}
