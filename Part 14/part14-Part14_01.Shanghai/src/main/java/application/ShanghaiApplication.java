package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public static void main(String[] args)  {
        System.out.println("Hello world!");
        launch(ShanghaiApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        // create the x and y axes that the chart is going to use
        //for x 4 ticks per label
        NumberAxis xAxis = new NumberAxis(2006,2018,2);
        NumberAxis yAxis = new NumberAxis(0,100,10);
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        // create the line chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai Ranking");
        
        XYChart.Series shanghaiData = new XYChart.Series();
        
        // and single data points into the data set
        shanghaiData.getData().add(new XYChart.Data(2007, 73));
        shanghaiData.getData().add(new XYChart.Data(2008, 68));
        shanghaiData.getData().add(new XYChart.Data(2009, 72));
        shanghaiData.getData().add(new XYChart.Data(2010, 72));
        shanghaiData.getData().add(new XYChart.Data(2011, 74));
        shanghaiData.getData().add(new XYChart.Data(2012, 73));
        shanghaiData.getData().add(new XYChart.Data(2013, 76));
        shanghaiData.getData().add(new XYChart.Data(2014, 73));
        shanghaiData.getData().add(new XYChart.Data(2015, 67));
        shanghaiData.getData().add(new XYChart.Data(2016, 56));
        shanghaiData.getData().add(new XYChart.Data(2017, 56));
        
        // add the data set to the line chart
        lineChart.getData().add(shanghaiData);
        lineChart.setLegendVisible(false);

        // display the line chart
        Scene view = new Scene(lineChart, 640, 500);
        window.setScene(view);
        window.show();
    }

}
