/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author usuario
 */
public class Dao {
    //Se debe hacer un archivo de texto
    private String ruta;
    private File archivo;
    
    public Dao(String ruta) {
   this.ruta = ruta;
    this.archivo=new File(ruta);
    }
    
    public boolean guardar(Persona persona) throws FileNotFoundException{
    //falta completar. PrintStream incompleto va borrando y no guarda
 PrintStream salida=new PrintStream(archivo);
 salida.println(persona.getNombre()+";");
 salida.println(persona.getApellido()+";");
 salida.println(persona.getEdad()+";");
 salida.print(persona.getGenero()+";");
 salida.println("");
 salida.flush();
 salida.close();
 return true;
    }
    
    public ArrayList<Persona> listar(){
    
    
    }


}
