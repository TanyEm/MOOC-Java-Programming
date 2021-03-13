import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] stringArray = {"hi", "moi", "hello", "moikka", "привет"};
        
        ArrayList<Integer> integerArray = new ArrayList<>();
        integerArray.add(4);
        integerArray.add(-8);
        integerArray.add(1);
        integerArray.add(5);
        integerArray.add(0);
        
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("bay");
        stringArrayList.add("baybay");
        stringArrayList.add("baybaybaybay");
        stringArrayList.add("moi moi");
        stringArrayList.add("good night");
        stringArrayList.add("hyvää yötä");
        stringArrayList.add("пока");
        
        sort(array);
        System.out.println(Arrays.toString(array));
        sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        sortIntegers(integerArray);
        System.out.println(integerArray);
        sortStrings(stringArrayList);
        System.out.println(stringArrayList);
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers)  {
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
