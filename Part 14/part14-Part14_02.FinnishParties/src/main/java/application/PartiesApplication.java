package application;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {
    
    private HashMap<String, HashMap<Integer, Double>> electionsData;
    
    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

    public PartiesApplication() {
        this.electionsData = readFile("partiesdata.tsv");
    }

    @Override
    public void start(Stage window) throws Exception {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        addDataToLineChart(lineChart);
        
        
        Scene view = new Scene(lineChart, 600, 500);
        window.setTitle("Finnish parties application");
        window.setScene(view);
        window.show();
    }
    
    private HashMap<String, HashMap<Integer, Double>> readFile(String filename) {
        HashMap<String, HashMap<Integer, Double>> parsedData = new HashMap<>();
        ArrayList<Integer> yearList = new ArrayList<>();

        try(Scanner file = new Scanner(Paths.get(filename))) {
            String row = file.nextLine();
            String[] stringArgument = row.split("\t");
            
//            skip first line in file
            for (int i = 1; i < stringArgument.length; i++) {
                yearList.add(Integer.parseInt(stringArgument[i]));
            }

            while (file.hasNext()) {
                String next = file.nextLine();
                stringArgument = next.split("\t");
                String party = stringArgument[0];
                HashMap<Integer, Double> map = new HashMap<>();
                
                for (int i = 1; i < stringArgument.length; i++) {
                    if (!stringArgument[i].equals("-")) {
                        int year = yearList.get(i-1);
                        String dat = stringArgument[i];
                        double number = Double.parseDouble(dat);
                        map.put(year, number);
                    }
                }
                parsedData.put(party, map);
            }
        } catch(IOException e) {
            System.err.println("Error: " + e.toString());
        }

        return parsedData;
    }
    
    private void addDataToLineChart(LineChart<Number, Number> lineChart) {
        electionsData.keySet().stream().forEach(party -> {
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            electionsData.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            lineChart.getData().add(data);
        });
    } 

}
