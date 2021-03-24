
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here
        List<String> myList = new List<>();
        System.out.println(myList.contains("hello"));
        myList.add("hello");
        System.out.println(myList.contains("hello"));
        int index = myList.indexOfValue("hello");
        System.out.println(index);
        System.out.println(myList.value(index));
        myList.remove("hello");
        System.out.println(myList.contains("hello"));
        
        List<String> myList2 = new List<>();
        myList2.add("hello");
        myList2.add("world");

        for(int i = 0; i < myList2.size(); i++) {
            System.out.println(myList2.value(i));
        }
    }

}
