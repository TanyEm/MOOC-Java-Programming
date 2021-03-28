package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.geometry.Pos;



public class TicTacToeApplication extends Application {
    
    char turn = 'X';
    boolean done = false;

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        
        BorderPane layout = new BorderPane();
        
        Label label = new Label("Turn: " + this.turn);
        label.setFont(Font.font("Arial",40));
        
        
        GridPane pane = new GridPane();
        pane.setVgap(10);
        pane.setHgap(10);
        pane.setAlignment(Pos.CENTER);
        
        createPane(label, pane);
        
        layout.setTop(label);
        layout.setCenter(pane);
        
        Scene scene = new Scene (layout,350,400);
        
        window.setScene(scene);
        window.show();
    }
    
    public void createPane(Label label, GridPane pane) {
        Button[][] buttons = new Button[3][3];
        GameLogic xd = new GameLogic(3);
        
        for (int i = 0; i < 3; i++){                // create 3x3 buttons
            for (int j = 0; j < 3; j++){
                
                //create buttons
                Button button = new Button("");
                button.setPrefSize(100, 100);
                button.setFont(Font.font("Arial", 40));
                
                // make value i and j final for lambda
                int x = i;
                int y = j;
               
                button.setOnAction((event) -> {
                    if (button.getText().equals("") && done == false){
                        button.setText(Character.toString(turn));
                        xd.add(x, y, turn);
                        if (xd.gameFinished()){   
                            done = true; 
                        }
                        
                        // change turn
                        if (turn == 'X'){
                            turn = 'O';
                        } else {
                            turn = 'X';
                        }
                        
                        label.setText("Turn: " + turn);
                        
                    }
                    
                    if (done){
                        label.setText("The end!");
                    }
                });
                
                buttons[i][j] = button;
                pane.add(button, i, j);

            }
        }
    }

}
