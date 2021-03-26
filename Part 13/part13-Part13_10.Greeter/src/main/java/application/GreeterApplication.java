package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class GreeterApplication extends Application {


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Button button = new Button("Start");
        TextField textField = new TextField();
        
        GridPane layout = new GridPane();
        layout.add(new Label("Enter your name"), 0, 0);
        layout.add(textField, 0, 1);
        layout.add(button, 0, 2);
               
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        
        Scene firstView = new Scene(layout);
        
        Label label = new Label("");
        
        
        GridPane layoutSecond = new GridPane();
        layoutSecond.add(label, 0, 0);
        
        layoutSecond.setPrefSize(300, 180);
        layoutSecond.setAlignment(Pos.CENTER);
        layoutSecond.setVgap(10);
        layoutSecond.setHgap(10);
        layoutSecond.setPadding(new Insets(20, 20, 20, 20));
        
        Scene secondView = new Scene(layoutSecond);
        
        button.setOnAction((event) -> {
            label.setText("Welcome " + textField.getText() + "!");

            window.setScene(secondView);
        });

        
        window.setScene(firstView);
        window.show();
    }
}
