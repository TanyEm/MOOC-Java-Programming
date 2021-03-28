package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application{


    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();
        Canvas canvas = new Canvas(500,500);
        layout.setCenter(canvas);
        
        GraphicsContext drawer = canvas.getGraphicsContext2D(); //helps drawing
        
        //set canvas white
        drawer.setFill(Color.WHITE);
        drawer.fillRect(0, 0, 1000, 1000);
        
        //make tassel black
        drawer.setFill(Color.BLACK);
        
        // eyes   
        drawer.fillRect(150, 150, 50, 50);
        drawer.fillRect(300, 150, 50, 50);
        
        // corners
        drawer.fillRect(100, 300, 50, 50);
        drawer.fillRect(350, 300, 50, 50);
        
        drawer.fillRect(150, 350, 50, 50);
        drawer.fillRect(200, 350, 50, 50);
        drawer.fillRect(250, 350, 50, 50);
        drawer.fillRect(300, 350, 50, 50);
        
        Scene scene = new Scene (layout);
        window.setScene(scene);
        window.show();
    }

}
