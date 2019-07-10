/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.ArchivoDao;
import modelo.Dao;
import modelo.Estudiante;
import vista.Escena1;
import vista.Escena2;

/**
 *
 * @author Estudiante
 */
public class Controlador2 {
   private Escena2 vista;
    private Dao modelo;
    private String nombre;
    private String apellido;

    public Escena2 getVista() {
        return vista;
    }

    public void setVista(Escena2 vista) {
        this.vista = vista;
    }

    public Dao getModelo() {
        return modelo;
    }

    public void setModelo(Dao modelo) {
        this.modelo = modelo;
    }


public Controlador2(String nombre ,String apellido) {
    this.nombre=nombre;
    this.apellido=apellido;
      this.vista = 
              new Escena2();
      this.vista.getBtGuardar().setOnAction(new Evento());
    }
 private class Evento 
      implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
           boolean bachillerato= vista.getRbBachillerato().isSelected();
           boolean pregrado= vista.getRbPregrado().isSelected();
           boolean postgrado=vista.getRbPosgrado().isSelected();
           Estudiante estudiante=new Estudiante();
           estudiante.setNombre(nombre);
           estudiante.setApellido(apellido);
           ArchivoDao guardar=new ArchivoDao("estudiante.txt");
           guardar.guardar(estudiante);
          Singleton singleton=
                   Singleton.getSingleton();
           Stage stage = singleton.getStage();
           Controlador3 controlador = new 
                Controlador3();
           Scene escena =
                   controlador.getVista().getScene();
           stage.setTitle("Escena 2");
           stage.setScene(escena);
        }
 }
}