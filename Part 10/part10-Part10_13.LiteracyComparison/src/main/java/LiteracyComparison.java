
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        read("literacy.csv");
    }
    
    public static void read(String file) {
        //List<Literacy> literacy = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .filter(part -> part.length >= 6)
                    .map(part -> new Literacy(part[2].trim().split(" ")[0], part[3].trim(), Integer.valueOf(part[4]),Double.valueOf(part[5])))
                    .sorted()
                    .forEach(item -> System.out.println(item));
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        }        
    }
}
