package buttonandtextfield;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
 
public class ButtonAndTextFieldApplication extends Application {
 
 
    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }
 
    @Override
    public void start(Stage window) throws Exception {
        TextField textField = new TextField("This is a button");
        Button button  = new Button("This is button");
        
        TilePane componentGroup = new TilePane();
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(textField);
        
        Scene scene = new Scene(componentGroup, 200, 200);
 
        window.setScene(scene);
        window.show();
    }
 
}