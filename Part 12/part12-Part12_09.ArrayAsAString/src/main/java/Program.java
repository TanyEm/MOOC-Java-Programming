
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
        
        int[][] matrix2 = {
            {1},
            {2, 2},
            {3, 3, 3},
            {4, 4, 4, 4}
        };
        System.out.println(arrayAsString(matrix2));
    }
    
    public static String arrayAsString(int[][] array) {
        StringBuilder matrix = new StringBuilder();
 
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int value = array[i][j];
                matrix.append(value);
            }
            matrix.append("\n");
        }
        
        return matrix.toString();
    }
}
