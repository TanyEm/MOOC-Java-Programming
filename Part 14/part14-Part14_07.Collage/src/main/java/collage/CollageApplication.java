package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");
        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();
        int smallerWidth = (int) (sourceImage.getWidth() / 2);
        int smallerHeight = (int) (sourceImage.getHeight() / 2);

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();

        for (int i = 0; i < smallerHeight; i++) {
            for (int j = 0; j < smallerWidth; j++) {
                Color color = imageReader.getColor(j * 2, i * 2);
                Color negativeColor = makeItNegative(color);

                imageWriter.setColor(j, i, negativeColor);
                imageWriter.setColor((j + smallerWidth), i, negativeColor);
                imageWriter.setColor(j, (i + smallerHeight), negativeColor);
                imageWriter.setColor((j + smallerWidth), (i + smallerHeight), negativeColor);
            }
        }

        ImageView image = new ImageView(targetImage);

        Pane pane = new Pane();
        pane.getChildren().add(image);

        stage.setScene(new Scene(pane));
        stage.show();
    }
    
    public Color makeItNegative(Color color) {
        double red = 1.0 - color.getRed();
        double green = 1.0 - color.getGreen();
        double blue = 1.0 - color.getBlue();
        double opacity = color.getOpacity();
        
        return new Color(red, green, blue, opacity);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
