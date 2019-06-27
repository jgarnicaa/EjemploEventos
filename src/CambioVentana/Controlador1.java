/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CambioVentana;

import Modelo.Singleton;
import Modelo.Dao;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class Controlador1 {
    private Vista1 vista;
    private Dao modelo;

    public Controlador1() {
        this.vista = new Vista1();
        this.vista.getOk().setOnAction(new EventoSiguiente()); //Aqui se define la accion del boton ok
        this.modelo = new Dao("bd.txt");
    }
    //Registro eventos
    private class EventoSiguiente implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
         String nombre=vista.getNombre().getText();
         String apellido=vista.getApellido().getText();
         Singleton singleton= Singleton.getSingleton();
         Stage stage=singleton.getStage();
         Controlador2 controlador=new Controlador2();
         Vista vista2=controlador.getVista();
         stage.setScene(vista2.getScene());
         stage.show();
        }
    
    }

    public Vista1 getVista() {
        return vista;
    }
    
}
