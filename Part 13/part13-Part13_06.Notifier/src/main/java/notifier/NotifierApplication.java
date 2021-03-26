package notifier;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class NotifierApplication extends Application{


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        TextField textField = new TextField();
        Button button = new Button("Update");
        Label label = new Label();
        
        button.setOnAction((event) -> {
            label.setText(textField.getText());
        });
      
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.getChildren().addAll(textField, button, label);
        
        Scene view = new Scene(vBox, 150, 150);
 
        window.setScene(view);
        window.show();
    }

}
