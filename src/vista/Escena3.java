/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 *
 * @author Estudiante
 */
public class Escena3 implements Vista{
     private Button btSeguir;
     private Scene escena;

    public Button getBtSeguir() {
        return btSeguir;
    }

    public void setBtSeguir(Button btSeguir) {
        this.btSeguir = btSeguir;
    }

    public Escena3() {
        this.btSeguir=new Button("Seguir");
          VBox layout  = new VBox();
          layout.getChildren().add(btSeguir);
          this.escena = new Scene(layout, 500, 500);
          
    }

    @Override
    public Scene getScene() {
       return this.escena;
    }
    
}
