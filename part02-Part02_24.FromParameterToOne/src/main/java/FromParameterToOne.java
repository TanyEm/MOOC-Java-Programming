import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("i");
        int in = Integer.valueOf(scan.nextLine());
        
        printFromNumberToOne(in);
    }
    
    public static void printFromNumberToOne(int number) {
        
        int count = number;
        
        for (int i = 0; i < count; i++){
            System.out.println(number--);
        }
    }

}
