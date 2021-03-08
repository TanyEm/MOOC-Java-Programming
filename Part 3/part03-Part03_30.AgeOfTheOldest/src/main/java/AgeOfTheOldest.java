
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> ages = new ArrayList<>();
        
        while(true) {
            String in = scanner.nextLine();
            
            if (in.equals("")){
                break;
            }
            
            String[] str = in.split(",");
            int arg = Integer.valueOf(str[str.length - 1]);
            
            ages.add(arg);
        }
        
        printGreatest(ages);
        
    }
    
    public static int printGreatest(ArrayList<Integer> list){
        
        int greatest = list.get(0);
        for (int i = 0; i < list.size(); i++){
            if (greatest <  list.get(i)){
                greatest = list.get(i);
            }
        }
        System.out.println("The greatest number: " + greatest);
        
        return 0;
    }
}
