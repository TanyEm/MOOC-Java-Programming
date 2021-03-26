package textstatistics;

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
        TextArea textArea = new TextArea("Enter text");
        
        HBox horisont = new HBox();
        
        horisont.setSpacing(10);
        horisont.getChildren().add(new Label("Letters: 0"));
        horisont.getChildren().add(new Label("Words: 0"));
        horisont.getChildren().add(new Label("The longest word is:"));
        
        layout.setCenter(textArea);
        layout.setBottom(horisont);
        
        Scene view = new Scene(layout);
 
        window.setScene(view);
        window.show();
    }

}
