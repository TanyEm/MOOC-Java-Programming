
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        JokeManager manager2 = new JokeManager();
        manager2.addJoke("Just joking 1");
        manager2.addJoke("Just joking 2");
        manager2.addJoke("Just joking 3");
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(manager2, scanner);
        ui.start();

    }
}
