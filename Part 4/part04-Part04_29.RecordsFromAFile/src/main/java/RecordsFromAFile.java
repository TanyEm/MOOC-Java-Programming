
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                
                if (row.equals("")) {
                    break;
                }
                String[] list = row.split(",");
                
                if (list[1].equals("1")){
                    System.out.println(list[0] + ", age: " + list[1] + " year");
                } else {
                    System.out.println(list[0] + ", age: " + list[1] + " years");
                }
            }
        } catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
