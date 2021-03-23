package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        dictionary.load();
        
        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
        
        dictionary.add("rara", "roro");
        
        dictionary.save();
        
        System.out.println(dictionary.translate("rara"));
        System.out.println(dictionary.translate("roro"));
        System.out.println(dictionary.translate("win"));
    }
}
