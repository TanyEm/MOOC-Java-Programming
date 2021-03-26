package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane firstScreenLayout = new BorderPane();
        Button button = new Button("To the second view!");
        Button secondButton = new Button("To the third view!");
        Button thirdButton = new Button("To the first view!");
        
        firstScreenLayout.setTop(new Label("First view!"));
        firstScreenLayout.setCenter(button);

        VBox secondScreenLayout = new VBox();
        secondScreenLayout.getChildren().add(secondButton);
        secondScreenLayout.getChildren().add(new Label("Second view!"));
        
        GridPane thirdScreenLayout= new GridPane();
        thirdScreenLayout.add(new Label("Third view!"), 0, 0);
        thirdScreenLayout.add(thirdButton, 0, 0);

        Scene first = new Scene(firstScreenLayout, 200, 200);
        Scene second = new Scene(secondScreenLayout, 200, 200);
        Scene third = new Scene(thirdScreenLayout, 200, 200);

        button.setOnAction((event) -> {
            window.setScene(second);
        });
        
        secondButton.setOnAction((event) -> {
            window.setScene(third);
        });
        
        thirdButton.setOnAction((event) -> {
            window.setScene(first);
        });

        window.setScene(first);
        window.show();
    }

}