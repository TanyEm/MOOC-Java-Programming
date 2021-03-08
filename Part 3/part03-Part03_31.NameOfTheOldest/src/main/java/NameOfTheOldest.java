
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> usrs = new ArrayList<>();
        
        while(true) {
            String in = scanner.nextLine();
            
            if (in.equals("")){
                break;
            }
            
            String[] str = in.split(",");
            String arg1 = str[0];
            int arg2 = Integer.valueOf(str[str.length - 1]);
            
            usrs.add(arg1);
            ages.add(arg2);
        }
        
        printGreatest(ages, usrs);
    }
    
    public static void printGreatest(ArrayList<Integer> listOfAges, ArrayList<String> listOfUsers){
        
        int greatest = listOfAges.get(0);
        int greatestId = 0;
        for (int i = 0; i < listOfAges.size(); i++){
            if (greatest <  listOfAges.get(i)){
                greatest = listOfAges.get(i);
                greatestId = i;
            }
        }
        System.out.println("Name of the oldest: " + listOfUsers.get(greatestId));        
    }
}
