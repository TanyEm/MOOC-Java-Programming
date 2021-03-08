import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try (Scanner scan = new Scanner(Paths.get(file))){
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                list.add(row);
            }
            
        } catch(Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        boolean result = false;
        
        for (int i = 0; i < list.size(); i++) {
            if (searchedFor.equals(list.get(i))) {
                result = true;
            } 
        }
        
        if (result){
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
        

    }
}
