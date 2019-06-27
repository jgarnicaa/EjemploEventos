/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CambioVentana;

import Modelo.Singleton;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class Pruebatemporal extends Application{
    public static void main(String []args){
    Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Singleton singleton=Singleton.getSingleton();
        singleton.setStage(stage);
        Controlador1 controlador=new Controlador1();
        Vista vista =controlador.getVista();
        stage.setScene(vista.getScene());
        stage.show();
    }
    
    
}
