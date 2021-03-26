package title;

import javafx.application.Application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give me a title: \n> ");
        String in = scan.nextLine();

        Application.launch(UserTitle.class, "--title=" + in);

    }

}


