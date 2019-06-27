/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CambioVentana;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author usuario
 */
public class Vista2 implements Vista{
    private Label e;
    private Label g;
    private TextField edad;
    private Button guardar;
    private RadioButton Masculino;
    private RadioButton Femenino;
    private Scene escena;
    private ToggleGroup genero;
    

    public Vista2() {
        e=new Label("Edad");
        g=new Label("Genero");
        edad=new TextField();
        guardar=new Button("Guardar");
        Masculino=new RadioButton("Masculino");
        Femenino=new RadioButton("Femenino");
        genero=new ToggleGroup();
        Masculino.setToggleGroup(genero);
        Masculino.setSelected(true);
        Femenino.setToggleGroup(genero);
        
        HBox h1=new HBox();
        HBox h2=new HBox();
        VBox v=new VBox();
        VBox lista=new VBox();
        lista.getChildren().add(Masculino);
        lista.getChildren().add(Femenino);
        h1.getChildren().add(e);
        h1.getChildren().add(edad);
        h2.getChildren().add(g);
        h2.getChildren().add(lista);
        v.getChildren().add(h1);
        v.getChildren().add(h2);
        v.getChildren().add(guardar);
        this.escena=new Scene(v, 500, 500);
        
    }
        
    
    @Override
    public Scene getScene() {
       return this.escena;
    }

    public Label getE() {
        return e;
    }

    public Label getG() {
        return g;
    }

    public TextField getEdad() {
        return edad;
    }

    public Button getGuardar() {
        return guardar;
    }

    public RadioButton getMasculino() {
        return Masculino;
    }

    public RadioButton getFemenino() {
        return Femenino;
    }

    public Scene getEscena() {
        return escena;
    }

    public ToggleGroup getGenero() {
        return genero;
    }
    
}
