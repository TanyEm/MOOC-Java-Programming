
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStatistic statistic = new GradeStatistic();
        
        UserInterface ui = new UserInterface(scanner, statistic);
        ui.start();
    }
}
