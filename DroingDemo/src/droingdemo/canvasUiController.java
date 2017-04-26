/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droingdemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author User
 */
public class canvasUiController implements Initializable {
    
    @FXML
    private Canvas canvas;
    
    //dwring tooth
    private void sawTooth() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        for( int k = 0; k < 3; k++){
            for( int i  = 0; i < 9; i++){
            gc.strokeLine(0 + i * 100 + k, 0 + k * 200, 50 + i * 100, 100 + k * 200);
            gc.strokeLine(50 + i * 100, 100 + k * 200, 100 + i *100, 0 + k * 200);
            }

            for( int j = 0; j < 9; j++){
            gc.strokeLine( 50 + j * 100, 100 + k * 200, 0 + j * 100 , 200 + k * 200);
            gc.strokeLine(50 + j * 100, 100 + k * 200, 100 + j * 100, 200 + k * 200);
            }
        }
    }
    
    private void drowingRect(){
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        gc.setFill(Color.GREEN);
        gc.fillRect(0, 0, 600, 360);
        gc.setFill(Color.CHOCOLATE);
        gc.strokeOval(240, 120, 120, 120);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // sawTooth();
        drowingRect();
        
       } 
    
}
