package buttonandlabel;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
 
 
public class ButtonAndLabelApplication extends Application {
 
 
    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }
 
    @Override
    public void start(Stage window) throws Exception {
        Button button = new Button("This is a button");
        Label label = new Label("This is a label");
        
        label.setLabelFor(button);
        
        
        
        TilePane componentGroup = new TilePane();
        componentGroup.getChildren().add(label);
        componentGroup.getChildren().add(button);
        
        Scene scene = new Scene(componentGroup, 200, 200);
 
        window.setScene(scene);
        window.show();
    }
 
}