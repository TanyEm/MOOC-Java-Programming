
public class Main {

    public static void main(String[] args) {
        // Test your program here
        IOU myDebts = new IOU(); 
        myDebts.howMuchDoIOweTo("Paul");
        
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Arthur", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}
