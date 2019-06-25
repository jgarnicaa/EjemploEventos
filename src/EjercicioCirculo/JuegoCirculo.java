/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioCirculo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class JuegoCirculo extends Application {
int x=10;
Canvas table = new Canvas(400,400);
GraphicsContext lapiz=table.getGraphicsContext2D();
    @Override
    public void start(Stage primaryStage) throws Exception {
 Button a= new Button("aumentar");
Button d=new Button("Disminuir"); 
a.setOnAction(new EventoA());
d.setOnAction(new EventoD());
Pane p1=new Pane();
p1.getChildren().add(table);
lapiz.fillOval(200, 200, x, x);
HBox h=new HBox();
VBox v=new VBox();
h.getChildren().add(a);
h.getChildren().add(d);
v.getChildren().add(p1);
v.getChildren().add(h);
Scene scene=new Scene(v,400,420);
primaryStage.setScene(scene);
primaryStage.show();
    }

class EventoA  implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent t) {
        lapiz.clearRect(0, 0, 400, 400);
        lapiz.fillOval(10, 10, x, x);
        x=x+10;
    }
}   


class EventoD  implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent t) {
        lapiz.clearRect(0, 0, 400, 400);
        lapiz.fillOval(10, 10, x, x);
        x=x-10;
    }
}


public static void main(String[]args){
    Application.launch(args);
    }    
}
