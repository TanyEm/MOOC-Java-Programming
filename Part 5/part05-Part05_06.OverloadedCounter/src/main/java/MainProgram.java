
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        Counter c = new Counter(2);
        c.decrease();
        c.decrease();
        c.decrease();
        System.out.println(c.value());
    }
}
