
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> year = new ArrayList<>();
        
        while(true) {
            String in = scanner.nextLine();
            
            if (in.equals("")){
                break;
            }
            
            String[] str = in.split(",");
            int arg = Integer.valueOf(str[str.length - 1]);
            
            name.add(str[0]);
            year.add(arg);
        }
        
        getLongest(name);
        getAverage(year);
    }
    
    public static void getLongest(ArrayList<String> list){
        
        int longest = list.get(0).length();
        String element = list.get(0);
        for (int i = 0; i < list.size(); i++){
            if (element.length() <  list.get(i).length()){
                element = list.get(i);
                longest = list.get(i).length();
            }
        }
        System.out.println("Longest name: " + element);        
    }
    
    public static void getAverage(ArrayList<Integer> list) {
        int sum = 0;
        int count = 0;
        
        while (count < list.size()){
            sum = sum + list.get(count);
            count++;
        }
        
        double avr = 1.0 * sum / count;
        
        System.out.println("Average of the birth years: " + avr);
    }
    
}
