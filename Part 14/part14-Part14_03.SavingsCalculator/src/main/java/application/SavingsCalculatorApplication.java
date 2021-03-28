package application;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {
    
    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();
        VBox sliderBox = new VBox();
        BorderPane topPane = new BorderPane();
        BorderPane bottomPane = new BorderPane();
        
        Slider monthsSlider = new Slider(25, 250, 25);
        Slider rateSlider = new Slider(0, 10, 3);
        
        Label monthValue = new Label(monthsSlider.getValue() + "");
        Label rate = new Label(rateSlider.getValue() + "");
        
        makeSliders(monthsSlider, rateSlider);

        topPane.setLeft(new Label("Monthly savings"));
        topPane.setCenter(monthsSlider);
        topPane.setRight(monthValue);
        topPane.setPadding(new Insets(20, 10, 10, 20));
        bottomPane.setLeft(new Label("Yearly interest rate"));
        bottomPane.setCenter(rateSlider);
        bottomPane.setRight(rate);
        bottomPane.setPadding(new Insets(20, 10, 10, 20));

        sliderBox.getChildren().addAll(topPane, bottomPane);
        
        SavingsAccount account = new SavingsAccount(monthsSlider.getValue(), rateSlider.getValue());
        
        layout.setTop(sliderBox);
        layout.setCenter(createLineChart(account));

        rateSlider.valueProperty().addListener(event -> {
            rate.setText((double) Math.round(rateSlider.getValue() * 100) / 100 + "");
            account.setMonthlyRecord(monthsSlider.getValue());
            account.setInterestRate(rateSlider.getValue());
            layout.setCenter(createLineChart(account));
        });

        monthsSlider.valueProperty().addListener(event -> { 
            monthValue.setText((double) Math.round(monthsSlider.getValue()) + "");
            account.setMonthlyRecord(monthsSlider.getValue());
            account.setInterestRate(rateSlider.getValue());
            layout.setCenter(createLineChart(account));
        });

        window.setScene(new Scene(layout));
        window.show();       
    }
    
    private void makeSliders(Slider monthsSlider, Slider rateSlider) {
        rateSlider.setMajorTickUnit(1);
        rateSlider.setSnapToTicks(true);
        
        monthsSlider.setShowTickLabels(true);
        monthsSlider.setShowTickMarks(true);
        rateSlider.setShowTickLabels(true);
        rateSlider.setShowTickMarks(true);   
    }
    
    private LineChart<Number, Number> createLineChart(SavingsAccount account) {
        NumberAxis yAxis = new NumberAxis();
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        
        LineChart<Number, Number> lineChart = new LineChart(xAxis, yAxis);
        lineChart.setTitle("Savings Calculator");
        
        XYChart.Series savings = new XYChart.Series();
        XYChart.Series savingsWithoutInterest = new XYChart.Series();
        
        savings.setName("Savings with Interest");
        savingsWithoutInterest.setName("Savings without Interest");

        for (int i = 0; i <= 30; i++) {
            savingsWithoutInterest.getData().add(new XYChart.Data(i, account.getBalanceWithoutInterest()));
            savings.getData().add(new XYChart.Data(i, account.getBalance()));
            account.increaseYear();
        }
        
        lineChart.getData().add(savingsWithoutInterest);
        lineChart.getData().add(savings);
        
        return lineChart;
    }

}
