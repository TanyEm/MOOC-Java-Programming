package textstatistics;

import java.util.Arrays;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;

public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();
        TextArea textArea = new TextArea();
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longest = new Label("The longest word is: ");
        
        textArea.setPromptText("Enter text");

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            // calculate length
            letters.setText("Letters: " + newValue.length());
            // calculate amount of words
            String[] parts = newValue.split(" ");
            words.setText("Words: " +  parts.length);
            // get longest word
            String longestWord = Arrays.stream(parts).sorted((s1, s2) -> s2.length() - s1.length()).findFirst().get();
            longest.setText("The longest word is: " + longestWord);
        });
        
        HBox horizon = new HBox();
        
        horizon.setSpacing(10);
        horizon.getChildren().add(letters);
        horizon.getChildren().add(words);
        horizon.getChildren().add(longest);
        
        layout.setCenter(textArea);
        layout.setBottom(horizon);
        
        Scene view = new Scene(layout);
 
        window.setScene(view);
        window.show();
    }

}
