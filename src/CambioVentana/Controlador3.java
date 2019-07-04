/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CambioVentana;

import Modelo.Dao;
import Modelo.Singleton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class Controlador3 {
    private Vista3 vista;
    private Dao modelo;
     public Controlador3() {
        this.vista = new Vista3();
        this.vista.getGuardar().setOnAction(new Evento()); //Aqui se define la accion del boton ok
        this.modelo = new Dao("bd.txt");
    }
    //Registro eventos
    private class Evento implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
           Controlador1 controlador =new Controlador1();
         Vista vista =controlador.getVista();
         Singleton singleton= Singleton.getSingleton();
         Stage stage=singleton.getStage();
         stage.setScene(vista.getScene());
         stage.show();
        }
    
    }

    public Vista3 getVista() {
        return vista;
    }
}
