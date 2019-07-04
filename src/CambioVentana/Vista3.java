/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CambioVentana;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author usuario
 */
public class Vista3 implements Vista {
private Label ho;
private CheckBox deporte;
private CheckBox musica;
private CheckBox teatro;
private Button guardar;
private Scene escena;
    
 
public Vista3(){
ho=new Label("Hobbies");
deporte= new CheckBox("Deporte");
musica= new CheckBox("Musica");
teatro= new CheckBox("Teatro");
guardar=new Button("Guardar");

HBox h=new HBox();
VBox v1=new VBox();
VBox v2=new VBox();

v1.getChildren().add(deporte);
v1.getChildren().add(musica);
v1.getChildren().add(teatro);
h.getChildren().add(ho);
h.getChildren().add(v1);
v2.getChildren().add(h);
v2.getChildren().add(guardar);
this.escena=new Scene(v2, 500, 500);

}

    @Override
    public Scene getScene() {
       return this.escena; 
    }

    public Label getHo() {
        return ho;
    }

    public void setHo(Label ho) {
        this.ho = ho;
    }

    public CheckBox getDeporte() {
        return deporte;
    }

    public void setDeporte(CheckBox deporte) {
        this.deporte = deporte;
    }

    public CheckBox getMusica() {
        return musica;
    }

    public void setMusica(CheckBox musica) {
        this.musica = musica;
    }

    public CheckBox getTeatro() {
        return teatro;
    }

    public void setTeatro(CheckBox teatro) {
        this.teatro = teatro;
    }

    public Button getGuardar() {
        return guardar;
    }

    public void setGuardar(Button guardar) {
        this.guardar = guardar;
    }

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }
    
}

 
